import java.util.Scanner;
public class Circle {
    public static void main(){

        //circumference = 2 * Math.PI * radius
        //Area of circle = Math.PI * Math.pow(radius,2)
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3)

        Scanner sc = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter a radius of circle:");
        radius=sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("circumference is: %.1fcm",circumference);
        System.out.println("Area is:"+area);
        System.out.println("volume is:"+volume);




        sc.close();

    }
}
