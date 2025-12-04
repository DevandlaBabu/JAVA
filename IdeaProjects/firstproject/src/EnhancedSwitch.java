import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner cd=new Scanner(System.in);

        String day;
        System.out.print("Enter a day firstLetter capital:");
        day=cd.nextLine();

        switch(day){
            case "Monday","Tuesday" ,"wednesday" ,"Thursday" ,"Friday"->
                    System.out.println("It is weekday😕");
            case "Saturday", "Sunday"->
                    System.out.println("It is weekend😀🙃");
            default-> System.out.println(day+" is not a day");
        }
        cd.close();
    }
}
