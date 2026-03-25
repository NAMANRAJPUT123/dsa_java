import java.util.*;
public class job_sequencing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();
        int[] id = new int[n];
        int[] deadline = new int[n];
        int[] profit = new int[n];
        System.out.println("Enter JobID Deadline Profit:");
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
            deadline[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }
        // -------- Sort jobs by Profit (Descending) --------
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (profit[i] < profit[j]) {
                    int temp;
                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;
                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;
                    temp = id[i];
                    id[i] = id[j];
                    id[j] = temp;
                }
            }
        }
        // -------- Find Maximum Deadline --------
        int maxDeadline = 0;
        for (int i = 0; i < n; i++)
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);
        int totalProfit = 0;
        // -------- Job Scheduling --------
        for (int i = 0; i < n; i++) {
            for (int j = deadline[i]; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = id[i];
                    totalProfit += profit[i];
                    break;
                }
            }
        }
        // -------- Output --------
        System.out.print("Scheduled Jobs: ");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != -1)
                System.out.print("J" + slot[i] + " ");
        }
        System.out.println("Total Profit: " + totalProfit);
        sc.close();
    }
}
