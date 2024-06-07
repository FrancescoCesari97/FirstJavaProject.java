public class dataType {

    // bolean | true : false | 1 bit
    // byte | -128 : 127 | 1 byte
    // short | -32768 : 32767 | 2 bytes
    // int | -2 billion : 2 billion | 4 bytes
    // long | -9 quintillion : 9 quintillion | 8 bytes

    // float | 6-7 decimal number | 4 bytes
    // double | 15 decimal number | 8 bytes

    // char | single character | 2 bytes
    // String | sequence of character | variable
    public static void main(String[] args) {

        boolean theBoolean = true;
        byte theByte = 127;
        short theShort = 32767;
        int theInt = 2_000_000_000;
        long theLong = 9_000_000_000_000_000_000L;

        float theFloat = 2.2549225f;
        double theDouble = 3.236985147826594;

        char theChar = 'c'; // con il singolo apice indica il char
        String theString = "freedus"; // con il doppio apice per le stringe

        System.out.println(theLong);

    }

}
