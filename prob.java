import java.util.*;
public class Solution {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] rooms = new int[N];
        for (int i = 0; i < N; i++) {
            rooms[i] = sc.nextInt();
        }
        int start = 0;
        int currentSum = 0;
        boolean found = false;
        for (int end = 0; end < N; end++) {
            currentSum += rooms[end];
            while (currentSum > K && start <= end) {
                currentSum -= rooms[start];
                start++;
            }
            if (currentSum == K) {
                System.out.println((start + 1) + " " + (end + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No valid subarray found");
        }
        sc.close();
    }
}


