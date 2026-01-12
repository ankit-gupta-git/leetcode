class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> rIdx = new LinkedList<>();
        Queue<Integer> dIdx = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') {
                    rIdx.add(i);
                } else {
                    dIdx.add(i);
                }
        }

        while (!rIdx.isEmpty() && !dIdx.isEmpty()) {
            int i  = rIdx.poll(), j = dIdx.poll();
            if(i < j){
                rIdx.add(i + n);
            } else {
                dIdx.add(j + n);
            }
        }
        return rIdx.isEmpty() ? "Dire" : "Radiant"; 
    }
}