/**
 * Created by kano on 05.06.17.
 */
import java.util.Scanner;

public class equation2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Given equation:");
        System.out.println("a*x+b=c");

        System.out.println("Enter value a");
        int a = in.nextInt();

        System.out.println("Enter value b");
        int b = in.nextInt();

        System.out.println("Enter value c");
        int c = in.nextInt();


        System.out.println("Find: x");
        System.out.print("x=");
        System.out.print((c - b) / a);
    }

}