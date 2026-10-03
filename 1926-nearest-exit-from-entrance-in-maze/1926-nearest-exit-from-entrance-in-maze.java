class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);

        int level = 0;

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        visited[entrance[0]][entrance[1]] = true;

        int[][] dirs = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        while(!queue.isEmpty()) {
            level++;
            int size =  queue.size();
            while(size-->0) {
                int[] coordinates = queue.poll();
                for(int j = 0; j < 4; j++) {
                    int[] dir = dirs[j];
                    int nextR = coordinates[0] + dir[0];
                    int nextC = coordinates[1] + dir[1];
                    //within limits
                    if(nextR >= 0 && nextC >= 0 && nextR < maze.length && nextC < maze[0].length && maze[nextR][nextC] == '.' && !visited[nextR][nextC]) {
                        if((nextR == 0 || nextC == 0 || nextR == maze.length - 1 || nextC == maze[0].length - 1)) {
                            return level;
                        }

                        visited[nextR][nextC] = true;
                        queue.offer(new int[] {
                            nextR, nextC
                        });
                    }

                }
            }
        }

            return -1;
    }
}