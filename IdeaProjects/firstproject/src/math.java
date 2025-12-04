import java.util.Scanner;
public class math {
    public static void main() {


      /* System.out.println(Math.PI);
        System.out.println(Math.E);

       double result;
       result=Math.pow(2,3);
       result=Math.abs(-10);
       result=Math.sqrt(9);
       result=Math.round(4.4);
       result=Math.ceil(3.22);
       result=Math.floor(3.22);
       result=Math.max(3,10);
       result=Math.min(3,10);
       // System.out.println(result);
*/
//Hypotenuse c=Math.sqrt(a™2+b™2)

        Scanner sc=new Scanner(System.in);

        double a;
        double b;
        double c;
        System.out.println("enter a base of triangle A:");
        a=sc.nextDouble();

        System.out.println("enter height of triangle B:");
        b=sc.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("the hypotenuse of triangle is:"+c);

        sc.close();
    }
}
