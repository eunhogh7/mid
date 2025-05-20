import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            n = sc.nextInt();

            if (n < 0) {
                break;
            }

            sum += n;
        }

        System.out.println("점수의 총합은: " + sum);
        sc.close();
    }
}
