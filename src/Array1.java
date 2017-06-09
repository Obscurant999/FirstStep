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
        int ArrayL = in.nextInt();
        if (ArrayL <= 0) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else if (ArrayL > 100) {
            System.out.println("Ошибка! Длина массива должна быть от 1 до 100!");
        } else {
            System.out.println("Содержимое массива: ");
            int[] Monsanto = new int[ArrayL];
            //System.out.println(Monsanto.length);
            //Заполнеие массива случайными числами;
            Random random = new Random();
            for (int i = 0; i < Monsanto.length; i++) {
               Monsanto[i] = random.nextInt(999);
               System.out.print(Monsanto[i] + ", ");
            }
            System.out.println("");

            int min = 0;
                for (int j = 0; j < Monsanto.length; j++) {
                    if (Monsanto[min] > Monsanto[j]) {
                        min = j;
                        System.out.println("Наименьшее введенное число : " + Monsanto[j]);
                    }

                }

            int max = 0;
                for (int k = 0; k < Monsanto.length; k++) {
                    if (Monsanto[max] < Monsanto[k]) {
                        max = k;
                        System.out.println("Наибольшее введенное число : " + Monsanto[k]);
                    }
                }

        }

    }
}
