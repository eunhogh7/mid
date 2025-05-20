import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요:");
        int studentCount = scanner.nextInt();
        System.out.print("과목 수를 입력하세요:");
        int subjectCount = scanner.nextInt();

        int[][] scores = new int[studentCount][subjectCount];


        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n 성적표 출력");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생 성적:");
            for (int j = 0; j < subjectCount; j++) {
                System.out.println("과목 " + (j + 1) + ": " + scores[i][j]);
            }
            System.out.println();

            scanner.close();
        }
    }
}
