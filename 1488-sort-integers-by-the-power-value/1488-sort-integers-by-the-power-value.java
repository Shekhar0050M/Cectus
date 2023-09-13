class Solution {
    public int getKth(int lo, int hi, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=lo;i<=hi;i++){
            mp.put(i,pVal(i));
        }
        List<Map.Entry<Integer,Integer>> lt = new LinkedList<>(mp.entrySet());
        Collections.sort(lt,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> me1,Map.Entry<Integer,Integer> me2){
                if(me1.getValue().compareTo(me2.getValue())==0){
                    return me1.getKey().compareTo(me2.getKey());
                }
                return me1.getValue().compareTo(me2.getValue());
            }
        });
        return lt.get(k-1).getKey();
    }
    private int pVal(int val){
        int cnt = 0;
        while(val!=1){
            if(val%2==0){
                val=val/2;
            }
            else{
                val=3*val+1;
            }
            cnt++;
        }
        return cnt;
    }
}