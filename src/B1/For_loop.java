package B1;
import java.util.Scanner;
// Task: Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.
public class For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i =1 ; i < 10; i++){
            System.out.println(N +"x"+i+"="+i*N);
        }
    }
}
