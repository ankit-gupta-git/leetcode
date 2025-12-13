class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int result = 0;

        HashMap<String, Integer> map = new HashMap();
        for (int[] row  : grid) {
            String rowString = Arrays.toString(row);
            map.put(rowString, map.getOrDefault(rowString, 0) + 1);
            }
            for(int i = 0; i < n; i++) {
                int[] colArray = new int[n];
                for(int j = 0; j < n; j++) {
                    colArray[j] = grid[j][i];
                }
                result += map.getOrDefault(Arrays.toString(colArray), 0);
            }
        return result;
    }
} 