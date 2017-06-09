/**
 * Created by 057000-07165 on 08.06.2017.
 * Решение квадратного уравнения через дискриминант
 */

import java.util.Scanner;
import java.lang.Math;

public class Quad_Eq1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения: ax^2+bx+c=0");
        System.out.println("Введите значение аргументов а, б и с");

        System.out.println("Введите значение аргумента \"a\"");
        double a = in.nextDouble();

        System.out.println("Введите значение аргумента \"b\"");
        double b = in.nextDouble();

        System.out.println("Введите значение аргумента \"c\"");
        double c = in.nextDouble();

        if (a == 0 & b == 0 & c == 0) {            // Проверка на нулевые значения всех аргументов
            System.out.println("x=0");
        } else if (a == 0 & b == 0 & c != 0){      // Проверка на нулевые значения аргументов a и б
            System.out.println("Ошибка деления на ноль!");
        } else if (a == 0 & b != 0 & c != 0) {     // Проверка на нулевое значение только a.
            System.out.print("x=");
            System.out.println((-c) / b);          // При нулевом а уравнение решается как линейное
        } else {
            double Disc = (Math.pow(b, 2) - 4 * a * c); //Вычисление дискриминанта (Disc)
            //System.out.print(Disc);
            if (Disc < 0) {                        // Проверка значения Disc на знак и определение способа решения уравнения
                System.out.print("Значение дискриминанта отрицательно!");
                System.out.print("D=");
                System.out.println(Disc);
                System.out.println("Уравнение не имеет решений!");
            } else if (Disc == 0) {
                double x = ((-b) / 2 * a);
                System.out.print("x=");
                System.out.print(x);
            } else {
                double x1 = ((-b + Math.sqrt(Disc)) / 2 * a);
                double x2 = ((-b - Math.sqrt(Disc)) / 2 * a);
                System.out.println("Уравнение имеет два корня:");
                System.out.print("x1=");
                System.out.println(x1);
                System.out.print("x2=");
                System.out.println(x2);
            }
        }
    }
}
