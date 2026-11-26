class Solution {
    public boolean canAliceWin(int n) {
        int turn = 1;;
        int need = 10;
        while(n >= need) {
            n -= need;
            turn = 1-turn;
            need--;
        }
        return turn == 0;
    }
}