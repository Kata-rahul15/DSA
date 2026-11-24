
class Solution {
    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();

        while (left < right) {

            if (!"aeiouAEIOU".contains(String.valueOf(chars[left]))) {
                left++;
            }
            else if (!"aeiouAEIOU".contains(String.valueOf(chars[right]))) {
                right--;
            }
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
