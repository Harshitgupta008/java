import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int ans = a;
            int k = 0;
            while (k != n) {
                ans += Math.pow(2, k) * b;
                System.out.print(ans + " ");
                k++;
            }
            System.out.println();
        }
        in.close();
    }
}