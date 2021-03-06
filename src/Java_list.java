import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Java_list {

        public static void main (String[] args) {
            List<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Mercedez");
            cars.add("MAZDA");
            for (String i: cars) {
                System.out.println(i);
            }
            Collections.sort(cars);
            for (String i:cars) {
                System.out.println(i);
            }

        }

}

