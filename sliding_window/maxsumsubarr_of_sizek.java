import java.util.Scanner;

class maxsumsubarr_of_sizek {
    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int i=1;
        int j=k;
        int prevSum = 0;
        for(int m=0;m<k;m++){
            prevSum+=arr[m];
        }
        while(j<arr.length){
            prevSum = prevSum +arr[j] - arr[i-1];
            maxSum = Math.max(maxSum, prevSum);
            i++;
            j++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int n;
        int k;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        k = sc.nextInt();
        System.out.println("Maximum sum of a subarray of size K: " + findMaxSumSubArray(k, arr));
        sc.close();
    }
}