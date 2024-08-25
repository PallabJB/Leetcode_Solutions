class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        Arrays.sort(arr,(a,b)->(a.value*b.weight)-(b.value*a.weight));
        double res =0;
        
        for(int i=n-1; i>=0;i--){
            if(arr[i].weight<=w){
                res+=arr[i].value;
                w-=arr[i].weight;
            }
            else{
                res+=arr[i].value*((double)w/(double)arr[i].weight);
                break;
            }
        }
        return res;
    }
}
