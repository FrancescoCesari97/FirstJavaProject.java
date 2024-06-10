public class Array {

    public static void main(String[] args) {

        // !/ array
        // String[] cars = { "fiat", "corvette", "tesla" };
        // cars[0] = "abart";

        // System.out.println(cars[2]);

        //

        // String[] cars = new String[3];

        // cars[0] = "fiat";
        // cars[1] = "corvette";
        // cars[2] = "tesla";

        // System.out.println(cars[2]);

        // for (int i = 0; i <= cars.length; i++) {
        // System.out.println(cars[i]);
        // }
        // ;
        // !/

        // !/ 2D array

        // String[][] cars = new String[3][3];

        String[][] cars = {
                { "fiat", "corvette", "tesla" },
                { "Mustung", "Abart", "Alfa" },
                { "Pagani", "Jaguar", "Lancia" }
        };

        // cars[0][0] = "fiat";
        // cars[0][1] = "corvette";
        // cars[0][2] = "tesla";
        // cars[1][0] = "Mustung";
        // cars[1][1] = "Abart";
        // cars[1][2] = "Alfa";
        // cars[2][0] = "Pagani";
        // cars[2][1] = "Jaguar";
        // cars[2][2] = "Lancia";

        for (int i = 0; i < cars.length; i++) {

            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

    }

}
