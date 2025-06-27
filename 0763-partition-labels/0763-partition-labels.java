class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> partitions = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int startIdx = i;
            int endIdx = str.lastIndexOf(str.charAt(i));

            for (int j = startIdx + 1; j < endIdx; j++) {
                int lastIdxOfNextChar = str.lastIndexOf(str.charAt(j));
                if (lastIdxOfNextChar > endIdx) {
                    endIdx = lastIdxOfNextChar;
                }
            }

            partitions.add(endIdx - startIdx + 1);
            i = endIdx + 1;
        }

        return partitions;
    }
}
