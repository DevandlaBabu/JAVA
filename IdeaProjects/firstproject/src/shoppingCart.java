import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double totalCost;

        System.out.print("what would you like to buy?");
        item=sc.nextLine();

        System.out.println("price of item is:");
        price=sc.nextDouble();

        System.out.println("quantity of item is:");
        quantity=sc.nextInt();

        totalCost=price*quantity;

        System.out.println("you have bought "+quantity+" "+item+"s");
        System.out.println("total cost is "+currency + totalCost);



        sc.close();

    }
}
