class Solution {
    public int lengthOfLastWord(String s) {
        String [] val=s.split(" ");
        int last= val.length-1;
        int value=val[last].length();
        return value;

    }
}