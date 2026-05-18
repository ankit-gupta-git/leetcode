class Solution {

    public int minJumps(int[] arr) {

        int n = arr.length;

        if(n == 1) return 0;

        HashMap<Integer, List<Integer>> hmap = new HashMap<>();

        for(int i = 0; i < n; i++) {

            if(!hmap.containsKey(arr[i])) {
                hmap.put(arr[i], new ArrayList<>());
            }

            hmap.get(arr[i]).add(i);
        }

        // BFS queue
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        // distance array
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        dist[0] = 0;

        while(!q.isEmpty()) {

            int curr = q.remove();

            // reached end
            if(curr == n - 1) {
                return dist[curr];
            }

            // move left
            if(curr - 1 >= 0 && dist[curr - 1] == -1) {

                dist[curr - 1] = dist[curr] + 1;

                q.add(curr - 1);
            }

            // move right
            if(curr + 1 < n && dist[curr + 1] == -1) {

                dist[curr + 1] = dist[curr] + 1;

                q.add(curr + 1);
            }

            // same value jumps
            List<Integer> temp = hmap.get(arr[curr]);

            for(int idx : temp) {

                if(dist[idx] == -1) {

                    dist[idx] = dist[curr] + 1;

                    q.add(idx);
                }
            }

            // optimization to avoid TLE
            temp.clear();
        }

        return -1;
    }
}