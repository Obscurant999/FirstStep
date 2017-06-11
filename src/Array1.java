/**
 * Created by 057000-07165 on 08.06.2017.
 * Выборка наименьшего и наибольшего числа из
 * рандомно заполненного массива
 * с заданной пользователем длиной.
 */

import java.util.Scanner;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длину массива (от 1 до 100):");
        int arrayL = in.nextInt();
        if (arrayL <= 0) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else if (arrayL > 100) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else {
            System.out.println("Содержимое массива: ");
            int[] monsanto = new int[arrayL];
            //System.out.println(Monsanto.length);
            //Заполнение массива случайными числами;
            Random random = new Random();
            for (int i = 0; i < monsanto.length; i++) {
               monsanto[i] = random.nextInt(999);
               System.out.print(monsanto[i] + ", ");
            }
            System.out.println("");

            int min = monsanto[0];
                for (int j = 0; j < monsanto.length; j++) {
                    if (min > monsanto[j]) {
                        min = monsanto[j];
                    }

                }
            System.out.println("Наименьшее введенное число : " + min);

            int max = monsanto[0];
                for (int k = 0; k < monsanto.length; k++) {
                    if (max < monsanto[k]) {
                        max = monsanto[k];
                    }
                }
            System.out.println("Наибольшее введенное число : " + max);

        }

    }
}
