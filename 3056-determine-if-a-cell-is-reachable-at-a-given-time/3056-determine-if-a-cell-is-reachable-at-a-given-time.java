class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy && t==1){
            return false;
        }
        int diag = Math.min(Math.abs(fx-sx),Math.abs(fy-sy));
        int minTime = Math.abs(Math.abs(fx-sx)-Math.abs(fy-sy))+diag;
        return minTime<=t;
    }
}