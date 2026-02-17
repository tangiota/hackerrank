import java.util.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        int sum = 0;
        if (a >= 1 && a <= 1000) {
            if (b >= 1 && b <= 1000) {
                sum = a + b;
            }
        }
        return sum;
      // Hint: Type return a+b; below 
	}

  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}
