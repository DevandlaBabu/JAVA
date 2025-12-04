import java.util.Scanner;
public class Interest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.print("Enter principle amount:");
        principle=scanner.nextDouble();

        System.out.print("enter rate of interest(in %):");
        rate=scanner.nextDouble()/100;

        System.out.print("Enter # of Time compound in a year :");
        timeCompound=scanner.nextInt();

        System.out.print("enter the # of years:");
        years=scanner.nextInt();

        amount = principle*Math.pow(1+rate/timeCompound,timeCompound*years);

        System.out.println(amount);




        scanner.close();
    }
}
