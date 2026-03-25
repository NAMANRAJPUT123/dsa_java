
import java.util.Scanner;
public class knapsack {
    public static double knapsackp(int[] val, int[] wt, double[] ratio, int n, int capacity) {

        // Bubble Sort based on ratio (descending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ratio[j] < ratio[j + 1]) {
                    double tempRatio = ratio[j];
                    ratio[j] = ratio[j + 1];
                    ratio[j + 1] = tempRatio;
                    int tempVal = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = tempVal;
                    int tempWt = wt[j];
                    wt[j] = wt[j + 1];
                    wt[j + 1] = tempWt;
                }
            }
        }
        double profit = 0;
        for (int i = 0; i < n; i++) {
            if (capacity >= wt[i]) {
                capacity -= wt[i];
                profit += val[i];
            } else {
                profit += val[i] * ((double) capacity / wt[i]);
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        double[] ratio = new double[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++)
            val[i] = sc.nextInt();
        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
            ratio[i] = (double) val[i] / wt[i];
        }
        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();
        double result = knapsackp(val, wt, ratio, n, capacity);
        System.out.println("Maximum profit: " + result);
        sc.close();
    }
}
