import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String grade = "";

        System.out.printf("점수를 입력하세요: ");
        score =  scanner.nextInt();

        if(!(0 <= score && score <= 100)) {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
            return;
        }

        switch(score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;

            case 8:
                grade = "B";
                break;

            case 7:
                grade = "C";
                break;

            case 6:
                grade = "D";
                break;

            default:
                grade = "F";
                break;

        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}