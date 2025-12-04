public class stringMethod {
    public static void main(String[] args){

        String name = "    Babu anu    ";
        int length = name.length();
        char word = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name =name.replace("a","ba");

        // contains() is check for spaces of string
        // equals
        System.out.println(name.isEmpty());


    }
}
