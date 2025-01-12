import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int numar = scanner.nextInt();
        System.out.println(factorialI(numar));
    }
    public static int factorialI(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
