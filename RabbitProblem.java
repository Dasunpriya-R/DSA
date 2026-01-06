import java.util.Scanner;

public class RabbitProblem {

    static int rabbits(int n) {
        if (n <= 1)
            return n;
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter months: ");
        int n = sc.nextInt();

        System.out.println("Rabbit pairs after " + n + " months = " + rabbits(n));
        sc.close();
    }
}
