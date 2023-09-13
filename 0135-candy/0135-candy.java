class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length, res = 0;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]+=arr[i-1];
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                arr[i-1]=Math.max(arr[i-1],arr[i]+1);
            }
        }
        for(int i=0;i<n;i++){
            res+=arr[i];
        }
        return res;
    }
}