
import java.lang.Math;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        int[] customers = {1, 2, 3, 4, 5};
        int num_of_customers = 5;
        int quantity_of_drones = 9;
        solve(customers, num_of_customers, quantity_of_drones);

    }

    public static void solve(int customers[], int num_of_customers, int quantity_of_drones) {
        Arrays.sort(customers);
        int index = 0;
        while (index < num_of_customers) {
            quantity_of_drones = quantity_of_drones - customers[index];
            if (quantity_of_drones < 0) {
                break;
            }
            index++;
        }
        System.out.println(String.valueOf(index));
    }
}


