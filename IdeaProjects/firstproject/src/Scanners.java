import java.util.Scanner;

public class Scanners {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        //common issues by using scanner

        System.out.print("enter present year:");
        int year=scanner.nextInt();

        scanner.nextLine();


        System.out.print("enter your fav food:");
        String food=scanner.nextLine();


        System.out.println("your fav food is "+food);
        System.out.println("present year is "+year);

/*
        System.out.println("Enter your name:");
       String name = scanner.nextLine();
       System.out.println("My name is "+name);

        System.out.print("Enter your age:");
        int age=scanner.nextInt();
        System.out.println("Age is "+age+" years old");

        System.out.println("what is your gpa:");
        double gpa=scanner.nextDouble();
        System.out.println("GPA is "+gpa);

        System.out.print("Are you a Student?(True/False)");

        boolean a=scanner.nextBoolean();
        if(a){
            System.out.println("you are enrolled as a student");
        }
        else{
            System.out.println("you are not enrolled as a student");
        }
*/
        scanner.close();




    }
}
