import java.util.*;

public class array_list {
   public static void main (String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Mercedez");
    cars.add("MAZDA");
    cars.add("Honda");
        for (String i: cars) {
            System.out.println(i);
        }
    Collections.sort(cars);
        for (String i:cars) {
            System.out.println(i);
        }

   }

}
