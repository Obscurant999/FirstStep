/**
 * Created by kano on 05.06.17.
 */
import java.util.Scanner;

public class equation2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Решение линейного уравнения: a*x+b=0");

        System.out.println("Введите значение аргумента \"a\"");
        double a = in.nextDouble();

        System.out.println("Введите значение аргумента \"b\"");
        double b = in.nextDouble();

        System.out.println("Вычисляем значение \"x\"");

        double x = ((-b) / a);

        System.out.print("x=");
        System.out.print(x);
    }

}