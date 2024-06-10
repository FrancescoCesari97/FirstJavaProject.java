public class StringMethods {

    public static void main(String[] args) {

        // ! equals method

        String name = "  freedus   ";

        // boolean result = name.equalsIgnoreCase("Freedus");
        // int result = name.length();
        // char result = name.charAt(0);
        // int result = name.indexOf("e");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('e', 'i');

        System.out.println(result);
    }

}
