import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        // ArrayList = a resizable array,
        // elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("pasta");
        food.add("hamburger");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }

}
