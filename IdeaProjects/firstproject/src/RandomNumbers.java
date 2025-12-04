import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        Random random=new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1=random.nextInt(1,7);
        number2=random.nextDouble();
        isHeads=random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        if(isHeads){
            System.out.println("Heads");
        }
       else{
           System.out.println("Tails");
        }



    }
}
