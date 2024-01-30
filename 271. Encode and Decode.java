import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode_string = new StringBuilder();
        for (String str : strs) {
            encode_string.append(str.length()).append("#").append(str);
        }
        return encode_string.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {

            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            result.add(str.substring(j + 1, i));

        }

        return result;
    }
}
