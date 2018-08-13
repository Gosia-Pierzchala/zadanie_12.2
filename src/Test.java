import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Queue<Integer> liczby = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę: ");
            int liczba = scan.nextInt();
            liczby.offer(liczba);
            sum = sum + liczba;
            j++;
        }

        for (int i = 0; i < j-1; i++) {
            System.out.print(liczby.poll() + "+");
        }
        System.out.println(liczby.poll() + "=" + sum);

    }
}
