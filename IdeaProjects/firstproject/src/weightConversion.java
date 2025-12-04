import java.util.Scanner;
public class weightConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("weight conversion program");
        System.out.println("1:convert lbs to kgs");
        System.out.println("1:convert kgs to lbs");

        System.out.print("choose an option:");
        choice=sc.nextInt();

        if(choice==1){
            System.out.print("enter your weight in lbs:");
            weight=sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("%.2f kgs",newWeight);
        }
        else if(choice==2){
            System.out.print("enter your weight in kgs:");
            weight=sc.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("%.2f lbs",newWeight);
        }
        else{
            System.out.println("not valid");
        }


        //option1 convert to lbs to kgs
        // option2 kgs to lbs
        // else print not a valid choice










sc.close();



    }
}
