import java.util.Scanner;
public class simpleCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.print("Enter your number1:");
        num1=sc.nextDouble();

        System.out.print("enter an operator(+,-,*,/,^):");
        operator=sc.next().charAt(0);

        System.out.print("Enter your number2:");
        num2=sc.nextDouble();

        switch(operator){
            case '+'-> result=num1 + num2;
            case '-'-> result=num1 - num2;
            case '*'-> result=num1 * num2;
            case '/'-> {
                if(num2==0){
                    System.out.println("num not divisible by zero");
                }
                else {

                    result = num1 / num2;
                }
            }
            case '^'-> result=Math.pow(num1,num2);

        }
            System.out.println(result);

        sc.close();
    }
}
