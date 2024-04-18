public class Solution {
    /**
     * @param words: a list of words
     * @return: a string which is correct order
     */
    public String alienOrder(String[] words) {
        
        // Write your code here
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for(String word : words) {
            for(char c: word.toCharArray()){
                inDegree.put(c,0);
            }
        }

        for(int i = 0; i < words.length - 1; i++){

            String word1 = words[i];
            String word2 = words[i+1];
            int minLength = Math.min(word1.length(), word2.length());
            boolean findDifference = false;

            for(int j = 0; j < minLength; j++){

                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if(c1 != c2){

                    if(!graph.containsKey(c1)){
                        graph.put(c1, new HashSet<>());
                    }

                    if(!graph.get(c1).contains(c2)){
                        graph.get(c1).add(c2);
                        inDegree.put(c2, inDegree.get(c2) + 1);
                    }

                    findDifference =  true;
                    break;
                }
            }

            if(!findDifference && word1.length() > word2.length()){
                return "";
            }

        }

        StringBuilder result = new StringBuilder();
        PriorityQueue<Character> queue = new PriorityQueue<>();

        for(char c : inDegree.keySet()){
            if(inDegree.get(c) == 0){
                queue.offer(c);
            }
        }

        while(!queue.isEmpty()){
            char current = queue.poll();
            result.append(current);

            if(graph.containsKey(current)){
                for(char neighbour : graph.get(current)){
                    inDegree.put(neighbour, inDegree.get(neighbour) - 1);
                    if(inDegree.get(neighbour) == 0){
                        queue.offer(neighbour);
                    }
                }
            }
        }

        if(result.length() != inDegree.size()){
            return "";
        }
        
        return result.toString();

    }
}