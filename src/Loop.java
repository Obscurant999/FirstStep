/**
 * Created by 057000-07165 on 09.06.2017.
 */
public class Loop {
    public static void main(String[] args) {
        // Цикл for
        System.out.println("for");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
         // цикл While
        System.out.println("while");
        int j = 0;
        while(j < 15) {
            System.out.println("Hello, World!");
            j++;
        }
        // цикл Do While
        System.out.println("do while");
        int i = 0;
        do {
            System.out.println("Hello, World!");
            i++;
        } while (i < 10);
        System.out.println("Goodbye, Cruel World!");
    }
}
