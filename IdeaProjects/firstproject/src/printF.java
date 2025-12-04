public class printF {
    public static void main(){

//printf() = is a method used to format output
// %[flags][width][.precision][specifier-character]

        String name = "Babu";
        char firstLetter = 'B';
        int age = 22;
        double height = 170;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("your name start with %c\n",firstLetter);
        System.out.printf("you are %d years old\n",age);
        System.out.printf("you are height is %.1f cm\n",height);
        System.out.printf("employed %b\n",isEmployed);


        System.out.printf("%s is %d years old",name,age);

    }
}
