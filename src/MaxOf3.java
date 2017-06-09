/**
 * Created by 057000-07165 on 08.06.2017.
 * Максимум из 3 чисел
 */
import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();

        System.out.println("Введите второе число");
        int y = in.nextInt();

        System.out.println("Введите третье число");
        int z = in.nextInt();

        if (x >= y) {
            if (x >= z) {
                int max = x;
                System.out.println("Наибольшее введенное число : " + max);
            } else if (z > x) {
                int max = z;
                System.out.println("Наибольшее введенное число : " + max);
            }
        } else {
            if (z >= y) {
                int max = z;
                System.out.println("Наибольшее введенное число : " + max);
            } else if (y > z) {
                int max = y;
                System.out.println("Наибольшее введенное число : " + max);
            }
        }

    }
}
