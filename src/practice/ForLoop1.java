package practice;

// input 1 number ; sum from one to that number
// Example number is 49
public class ForLoop1 {

    public static void main(String[] args) {
        int number = 49;
        int sum = 0;
        for (int i = 0; i <= number; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}
