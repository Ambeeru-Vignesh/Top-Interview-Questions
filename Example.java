import java.util.*;

public class Example {

    private static Object obj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { { 1, 2 }, { 2, 3 }, { 3, 2 }, { 4, 5 }, { 5, 4 } };
        int len = arr.length;
        String result = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            Integer value = map.get(second) != null ? map.get(second) : Integer.MIN_VALUE;
            if (map.get(second) != null && map.get(second) == first) {
                // This means the symmetric pair exist here
                result += "{" + String.valueOf(second) + "," + String.valueOf(first) + "}";
            } else {
                map.put(first, second);
            }

        }

        System.out.println(result);
        sc.close();

    }
}
