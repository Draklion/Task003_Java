import java.util.ArrayList;
import java.util.Arrays;

public class Task003_1 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(14, 13, 11, 16, 43, 35, 42, 65, 87, 54, 71, 9, 2));
        for (int i = 0; i < array.size(); i++) {
            if ((int) array.get(i) % 2 == 0)
                array.remove(i);
        }
        System.out.print(array);
    }
}