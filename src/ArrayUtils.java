/**
 * Created by Student-22 on 14.06.2017.
 */
import java.util.Random;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            //System.out.println(array[i] + " ");
         }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            min = min > array[i] ? array[i] : min;

        }
        System.out.println(min);
    }
}
