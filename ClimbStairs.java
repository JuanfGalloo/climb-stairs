import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de degraus: ");
        int n = scanner.nextInt();
        System.out.println("Número de maneiras de subir " + n + " degraus: " + subindoEscadas(n));

        scanner.close();

    }

    public static int subindoEscadas(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n = subindoEscadas(n - 1) + subindoEscadas(n - 2);
    }

}
