import java.util.Scanner;
public class substring {
    public static void main(String[] args){
//.substring() =   A method is used to extract a portion of string
//                  .substring(start,end)
        String Email;
        String UserName;
        String domain;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Email id:");
        Email = sc.nextLine();

        if(Email.contains("@")) {

            UserName = Email.substring(0, Email.indexOf("@"));//(0,7)
            domain = Email.substring((Email.indexOf("@") + 1));

            System.out.println(UserName + " \n" + domain);
        }
        else{
            System.out.println("write a email with @ symbol");
        }
        sc.close();


    }
}
