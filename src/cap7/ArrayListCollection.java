package cap7;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"yellow");

        System.out.printf("Apresenta lista com loop controlado por contador:%n");
        for(int i = 0; i<items.size();i++)
            System.out.printf("%s ",items.get(i));

        display(items, "%nDisplay List with enhanced for statement:%n");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:%n");

        items.remove("yellow");
        display(items, "Remove first instance of yellow:%n");

        items.remove(1);
        display(items, "Remove second list element (green):%n");

        System.out.printf("\"red\" is %s in the list%n", items.contains("red")?"":"not ") ;

        System.out.printf("Size: %s",items.size());



    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);
        for(String item:items)
            System.out.printf(" %s", item);
        System.out.println();

    }


}
