class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            int stIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(stIndex));

            for(int j = stIndex + 1; j < endIndex; j++) {
                int lastIndexOfNextChar = s.lastIndexOf(s.charAt(j));

                if(lastIndexOfNextChar > endIndex) {
                    endIndex = lastIndexOfNextChar;
                }
            }

            result.add(endIndex - stIndex + 1);
            i = endIndex;
        }
        return result;
    }
}