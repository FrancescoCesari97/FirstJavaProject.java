public class wrapperClasses {

    public static void main(String[] args) {

        // wrapper class = provides a way to use primitive data types as reference data
        // types,
        // reference data types contain useful methods, can be used with collections
        // (ex.ArrayList)

        // primitive ///---/// wrapper
        // ---------///---/// ---------
        // bollean ///---/// Boolean
        // char --///---/// Character
        // int --///---/// Integer
        // double ///---/// Double

        /// autoboxing = the utomatic conversion that the java compiler makes between
        /// the primitive types and their corresponding object wrapper class

        /// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class
        /// primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "freedus";

        if (a == true) {
            System.out.println("this is true");
        }

    }

}
