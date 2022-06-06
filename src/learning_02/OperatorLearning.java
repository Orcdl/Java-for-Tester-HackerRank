package learning_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int myNumber1 = 1;
        int myNumber2 = 2;

       int x = ++myNumber1 + myNumber2++;
        System.out.println(x +"\n");
        System.out.println(x);
       /*
       Prefix: First -> right operand -> assign value to left operand -> Postfix
       ++a: Prefix:
       a++: Postfix:
        (++myNumber1) = <2>  => number2 = 2 ; x = 2+2 = 4
        (myNumber2++) = 2++ là tăng lên 1 đv = <3>
        x= <4>
        */
    }
}
