class Solution {
    class Pair{
        int count;
        int num;
        int den;
        Pair(int count, int num, int den){
            this.count=count;
            this.num=num;
            this.den=den;
        }
    }





    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double start=0, end=1.0;
        while(start<end){
            double mid = (start+end)/2;
            Pair p =getCount(arr, mid);
            if(p.count==k){
                return new int[] {p.num, p.den};
            }else if(p.count<k){
                start = mid;
            }else  {
                end = mid;
            }      
        }
        return null;
    }
    public Pair getCount(int[] arr, double target){
        int i=0, count=0;
        int num=arr[0], den=arr[arr.length-1];
        for(int j=1; j<arr.length; j++){
            while(arr[i]/(double)arr[j]<=target){
                i++;
            }
            count +=i;
            if(i>0 && arr[i-1]/(double)arr[j]>num/(double)den){
                num = arr[i-1];
                den = arr[j];
            }
        }
        return new Pair(count, num, den);
    }
}
