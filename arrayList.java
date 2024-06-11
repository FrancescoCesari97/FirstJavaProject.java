import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        // ArrayList = a resizable array,
        // elements can be added and removed after compilation phase
        // store reference data types

        // ArrayList<String> food = new ArrayList<String>();

        // food.add("pizza");
        // food.add("pasta");
        // food.add("hamburger");

        // food.set(0, "sushi");
        // food.remove(2);
        // food.clear();

        // for (int i = 0; i < food.size(); i++) {
        // System.out.println(food.get(i));
        // }

        // 2D ArrayList = a dynamic list of lists
        // you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("onion");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("beer");
        drinkList.add("varnelli");
        drinkList.add("whiskey");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));

    }

}
