package arrays.prcatice;

public class SubArrayKSum {
    public static void main(String[] args) {
        int arr[]= {15,2,4,8,6,9};
        int k=23;
        // subArrayWithSumK(arr, k);
        subArrayWithSumKOptimized(arr, k);
    }

    private static void subArrayWithSumKOptimized(int[] arr, int k) {
        int n=arr.length;
        int curSum=arr[0], start=0;

        for (int i = 1; i <= n; i++) {
            while(curSum > k && start < i-1){
                curSum=curSum - arr[start];
                start++;
            }

            if(curSum == k){
                i--;
                System.out.println("sum from " + start+ ", " + i);
                return;
            }

            if(i<n){
                curSum=curSum+arr[i];
            }
        }
    }

    private static void subArrayWithSumK(int[] arr, int k) {
        int n=arr.length;
        int cur_sum;
        for(int i=0;i<n;i++){
            cur_sum=arr[i];

            for(int j=i+1; j<=n; j++){
                if(cur_sum == k){
                    int size= j-i;
                    j--;
                    System.out.println("size of subarray= "+ size);
                    System.out.println("sum fron " + i+ ", " + j);
                    return;
                }
                if(cur_sum > k || j == n){
                    break;
                }
                cur_sum= cur_sum + arr[j];
            }
        }
        System.out.println("not found");
    }
}
