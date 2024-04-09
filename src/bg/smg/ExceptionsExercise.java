package bg.smg;

import java.util.Scanner;
import java.util.Stack;

public class ExceptionsExercise {
        public static void main(String[] args) {
            int num;
            Stack<Integer> s = new Stack<>();
            Scanner sc = null;
            try {
                sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    num = Integer.parseInt(sc.next());
                    s.push(num);
                }
            } catch (NumberFormatException e){
                System.out.println("Cannot format number because it contains non-numeric values.");
                e.printStackTrace();
            }finally {
                sc.close();
            }
        }
}
