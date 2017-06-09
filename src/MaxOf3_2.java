/**
 * Created by 057000-07165 on 09.06.2017.
 */
import java.util.Scanner;

public class MaxOf3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int x = in.nextInt();

        System.out.println("Введите второе число");
        int y = in.nextInt();

        System.out.println("Введите третье число");
        int z = in.nextInt();

        int[] Digitus = {x, y, z};
        int max = 0;

        for (int i = 0; i < Digitus.length; i++) {
            if (Digitus[max] < Digitus[i]) {
                max = i;
                System.out.println("Наибольшее введенное число : " + Digitus[i]);
            }
        }

        //System.out.println(Digitus[0]);
        //System.out.println(Digitus[1]);
        //System.out.println(Digitus[2]);


    }
}