import java.util.Scanner;


public class areaOfRectangle {
    public static void main(String[] args){
        double length=0;
        double width=0;
        double area=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter length of rectangle:");
        length=scanner.nextDouble();

        System.out.print("enter width of rectangle:");
        width=scanner.nextDouble();

        area=length*width;

        System.out.println("area of rectangle is:"+area);

        scanner.close();


    }
}
