import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

       String name;
       int age;
       boolean isStudent;


        System.out.println("enter your name:");
        name=sc.nextLine();


        System.out.println("Enter your age:");
        age=sc.nextInt();

        System.out.println("Are you a Student?(true/false)");
        isStudent=sc.nextBoolean();

        //Group 1
        if(name.isEmpty()){
            System.out.println("you didn't entered a name");
        }
        else{
            System.out.println("Hello "+name+"!");
        }



        //Group2
       if(age<=6){
           System.out.println("you are a baby");
       }
       else if(age<18){
           System.out.println("you are a teenager");
       }
       else if(age>=18){
           System.out.println("you are a Adult");
        }
        else{
            System.out.println("you are not a teenager");
        }

        //Group3
        if(isStudent){
            System.out.println("you are a student!");

        }
        else{
            System.out.println("you are not a student!");
        }



       sc.close();


    }
}
