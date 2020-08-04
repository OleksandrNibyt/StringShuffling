class Solution {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }
        return result.toString();
    }
}

public class StringShuffling {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = Solution.restoreString(s, indices);
        System.out.println(String.valueOf(result));
    }


}
