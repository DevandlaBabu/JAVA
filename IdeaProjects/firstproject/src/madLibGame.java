import java.util.Scanner;
public class madLibGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb;

        System.out.print("enter the name of adjective1:");
        adjective1=sc.nextLine();

        System.out.println("enter the name of noun1:");
        noun1=sc.nextLine();

        System.out.println("enter the name of adjective2:");
        adjective2=sc.nextLine();

        System.out.println("enter the name of verb:");
        verb=sc.nextLine();


        System.out.println("Today I went to "+adjective1 +" zoo");
        System.out.println("In a exhibit"+","+"i saw a "+noun1);
        System.out.println(noun1+" was superhero is "+verb+" on the road");
        System.out.println("I was so "+adjective2);




        sc.close();
    }
}
