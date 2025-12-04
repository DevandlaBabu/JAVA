import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        //ternary operator? = Return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse ;
        Scanner sc=new Scanner(System.in);

        int hours;
        System.out.print("Enter the time in 24hours it show AM or PM:");
        hours=sc.nextInt();

        String timeDay = (hours>12)? "PM":"AM";
        System.out.println(timeDay);
     /*
        int number ;
        System.out.print("Enter a number to check even or odd:");
        number = sc.nextInt();


        String evenOrOdd = (number%2==0)? "even":"odd";
        System.out.println(evenOrOdd);


        int score = 10;

        String passOrFAil = (score >= 25)? "Pass" : "Fail";
        System.out.println(passOrFAil);

          if(score>=50){
             System.out.println("PASS");
         }
         else{
             System.out.println("Fail");
         }
        */

       sc.close();
    }
}
