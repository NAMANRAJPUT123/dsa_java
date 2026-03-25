import java.util.*;
// BUBBLE SORT  
// public class sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             boolean flag = false; // has any swapping happened
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     flag = true;
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//             if(!flag) break; // jis iteration pe array sort ho jaega wahi rukk jaega , optimized program
//         }
//         System.out.print("Bubble sorted array : ");
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// SELECTION SORT
// public class sorting {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");                  
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             int minIdx = i;
//             for(int j=i;j<n;j++){
//                 if(arr[minIdx]>arr[j]){
//                     minIdx = j;
//                 }
//             }   
//                 int temp = arr[minIdx];
//                 arr[minIdx] = arr[i];
//                 arr[i] = temp;  
//         }
//         System.out.print("Selection sorted array : ");
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// INSERTION SORT
// public class sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");                  // 4 6 2 9 7 3 
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//              int j = i;
//              while(j>=0 && arr[j+1]<arr[j]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 j--;
//              }
//         }
//         System.out.print("Insertion sorted array : ");
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// BINARY SEARCH ALGORITHM
// public class sorting {
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");                  // 4 6 2 9 7 3 
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         bubbleSort(arr);
//         System.out.println("Sorted array : ");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         int left = 0, right=n-1;
//         System.out.print("Enter x : ");
//         int x = sc.nextInt();
//         boolean flag = true;
//         while(left<=right){
//             int middle =(left+right)/2;
//             if(arr[middle]==x){
//                 System.out.println(x+" found at index "+middle);
//                 flag = false;
//                 break;
//             }
//             else if(arr[middle]>x){
//                 right = middle-1;
//             }
//             else {
//                 left = middle+1;
//             }
//         }
//         if(flag) System.out.println(x+" not found.");
//     }
// }

// SORTING PROBLEMS
// MOVE ALL 0'S TO THE END OF IT WHILE MAINTANING THE RELATIVE ORDER OF THE NON-ZERO ELEMENTS.
// public class sorting{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");                  // 0 5 0 3 4 2
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         boolean flag = false;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1;j++){                                   // 5 3 4 2 0 0
//                 if(arr[j+1]!=0 && arr[j]==0){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     flag = true;   // swap hua
//                 }
//             }
//             if(!flag) break;
//         }
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

// GIVE AN ARRAY OF NAMES OF THE FRUITS YOU ARE SUPPOSED TO SORT IT IN LEXICOGRAPHICAL ORDER USING SELECTION SORT
// public class sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         sc.nextLine(); // consume the newline character
//         System.out.print("Enter "+n+" fruit names : ");      // Enter 6 fruits name : papaya
//         String arr[] = new String[n];                        // watermelon
//         for(int i=0;i<n;i++){                                // apple
//             arr[i] = sc.nextLine();                          // kiwi
//         }                                                    // mango
//         for(int i=0;i<n-1;i++){                              // banana
//             int minIdx = i;                                  // Sorted fruits : [apple, banana, kiwi, mango, papaya, watermelon]
//             for(int j=i;j<n;j++){
//                 if(arr[j].compareTo(arr[minIdx])<0){
//                     minIdx = j;
//                 }
//             }   
//             String temp = arr[minIdx];
//             arr[minIdx] = arr[i];
//             arr[i] = temp;  
//         }
//         System.out.println("Sorted fruit names in lexicographical order: "+Arrays.toString(arr));
//     }
// }

// MERGE SORT
// public class sorting{
//     public static void merge(int arr[],int l,int mid,int r){
//         int n1 = mid - l + 1; // size of left subarray
//         int n2 = r - mid; // size of right subarray
//         int L[] = new int[n1]; // left subarray
//         int R[] = new int[n2]; // right subarray
//         for(int i=0;i<n1;i++){
//             L[i] = arr[l+i]; // copy elements to left subarray
//         }
//         for(int j=0;j<n2;j++){
//             R[j] = arr[mid+1+j]; // copy elements to right subarray
//         }
//         int i=0,j=0,k=l; // i for left, j for right, k for merged array
//         while(i<n1 && j<n2){
//             if(L[i]<=R[j]){
//                 arr[k++] = L[i++];
//             } else {
//                 arr[k++] = R[j++];
//             }
//         }
//         while(i<n1){ // if any elements left in left subarray
//             arr[k++] = L[i++];
//         }
//         while(j<n2){ // if any elements left in right subarray
//             arr[k++] = R[j++];
//         }
//     }
//     public static  void mergeSort(int arr[],int l,int r){
//         int mid = (l+r)/2;
//         if(l>=r) return; // base case
//         mergeSort(arr, l, mid); // left half
//         mergeSort(arr, mid+1, r); // right half
//         merge(arr, l, mid, r); // merge the two halves
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter "+n+" elements : ");
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         mergeSort(arr, 0, n-1);
//         System.out.print("Sorted array : ");
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//         sc.close();
//     }
// }

// QUICK SORT
// public class sorting {
//     public static void swap(int arr[],int x,int y){
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y] = temp;
//     }
//     public static int partition(int arr[], int st, int end) {
//         int pivot = arr[st];
//         int cnt = 0;
//         for(int i=st+1;i<=end;i++){
//             if(arr[i]<=pivot) cnt++; // pivot ke duplicate agye toh = lgaya
//         }
//         int pivotidx = st + cnt;
//         swap(arr,st,pivotidx);
//         int i=st,j=end;
//         // element lesser left , greater -> right side of pivotidx
//         while(i<pivotidx && j>pivotidx){
//             while(arr[i]<=pivot) i++;
//             while(arr[j]>pivot) j--;
//             if(i<pivotidx && j>pivotidx){
//                 swap(arr,i,j);
//                 i++;
//                 j--;
//             }
//         }
//         return pivotidx;
//     }
//     public static void quickSort(int arr[], int st, int end) {
//         if (st < end) {
//             int pi = partition(arr,st, end); // partitioning index
//             quickSort(arr, st, pi - 1); // sort left half
//             quickSort(arr, pi + 1, end); // sort right half
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter " + n + " elements : ");
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         quickSort(arr, 0, n - 1);
//         System.out.print("Sorted array : ");
//         for (int j = 0; j < n; j++) {
//             System.out.print(arr[j] + " ");
//         }
//         sc.close();
//     }
// }
// COUNT SORT
// public class sorting{
//     public static int findMax(int arr[]){
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void basicCountSort(int arr[]){
//         int max = findMax(arr);// find the largest element of the arr
//         int output[] = new int[arr.length];
//         int count[] = new int[max+1]; // frequency array
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         for(int i=count.length-1;i>=0;i--){ // prefix sum count array ka
//             for(int j=0;j<i;j++){
//                 count[i] = count[i] + count[j];
//             }
//         }
//         // Find the index of each element in the original array and put it in output array
//         for(int i=arr.length-1;i>=0;i--){
//                 int idx = count[arr[i]] - 1;
//                 output[idx] = arr[i];
//                 count[arr[i]]--;
//         }
//         //copy all element of output to arr
//         for(int i=0;i<arr.length;i++){
//             arr[i] = output[i];
//         }
//     }
//     public static void display(int a[]){
//         for(int val:a){
//             System.out.print(val+" ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter arrray : ");
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         basicCountSort(arr);
//         display(arr);
//         sc.close();
//     }
// }
// RADIX SORT
// public class sorting{
//     public static int findMax(int arr[]){
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void radixSort(int arr[]){
//         int max = findMax(arr);
//         // apply counting sort to sort element on place value
//         for(int place=1;max/place>0;place*=10){
//             basicCountSort(arr,place);
//         }
//     }
//     public static void basicCountSort(int arr[],int place){
//         int output[] = new int[arr.length];
//         int count[] = new int[10]; // frequency array
//         for(int i=0;i<arr.length;i++){
//             count[(arr[i]/place)%10]++;
//         }
//         for(int i=count.length-1;i>=0;i--){ // prefix sum count array ka
//             for(int j=0;j<i;j++){
//                 count[i] = count[i] + count[j];
//             }
//         }
//         // Find the index of each element in the original array and put it in output array
//         for(int i=arr.length-1;i>=0;i--){
//                 int idx = count[(arr[i]/place)%10] - 1;
//                 output[idx] = arr[i];
//                 count[(arr[i]/place)%10]--;
//         }
//         //copy all element of output to arr
//         for(int i=0;i<arr.length;i++){
//             arr[i] = output[i];
//         }
//     }
//     public static void display(int a[]){
//         for(int val:a){
//             System.out.print(val+" ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.print("Enter arrray : ");
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         radixSort(arr);
//         display(arr);
//         sc.close();
//     }
// }
// BUCKET SORT
public class sorting{
    public static void bucketSort(float arr[]){
        int n = arr.length;
        // Buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets =new ArrayList[n];
        // Create empty bucktes
        for(int i=0;i<n;i++){
            buckets[i] = new ArrayList<Float>();
        }
        // Add elements into our buckets
        for(int i=0;i<n;i++){
            int bucketIndex = (int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        // Sort each bucket individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        // Merge all bucktes to get final sorted array
        int index = 0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter arrray : ");
        float arr[] = new float[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextFloat();
        }
        bucketSort(arr);
        for(float val:arr){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
   