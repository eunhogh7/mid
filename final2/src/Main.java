import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] maleToilet = {false, false, false};
        boolean[] femaleToilet = {false, false, false, false};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 화장실 자리 관리 =====");
            System.out.println("1. 전체 상태 보기");
            System.out.println("2. 자리 상태 바꾸기");
            System.out.println("3. 종료");
            System.out.print("메뉴 선택: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                // 상태 보기
                System.out.println("\n[1층 남자화장실]");
                for (int i = 0; i < maleToilet.length; i++) {
                    System.out.println(" - 칸 " + (i + 1) + ": " + (maleToilet[i] ? "사용 중" : "비어 있음"));
                }

                System.out.println("[2층 여자화장실]");
                for (int i = 0; i < femaleToilet.length; i++) {
                    System.out.println(" - 칸 " + (i + 1) + ": " + (femaleToilet[i] ? "사용 중" : "비어 있음"));
                }

            } else if (menu == 2) {
                // 자리 상태 변경
                System.out.println("1. 1층 남자화장실");
                System.out.println("2. 2층 여자화장실");
                System.out.print("화장실 선택: ");
                int toiletChoice = scanner.nextInt();

                if (toiletChoice != 1 && toiletChoice != 2) {
                    System.out.println("잘못된 선택입니다. 다시 입력해 주세요.");
                    continue;
                }

                boolean[] selectedToilet = (toiletChoice == 1) ? maleToilet : femaleToilet;

                System.out.print("몇 번째 칸? (1부터 시작): ");
                int stall = scanner.nextInt() - 1;

                if (stall < 0 || stall >= selectedToilet.length) {
                    System.out.println("잘못된 칸 번호입니다. 다시 입력해 주세요.");
                    continue;
                }

                System.out.print("0: 비우기, 1: 사용하기 > ");
                int state = scanner.nextInt();

                if (state != 0 && state != 1) {
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
                    continue;
                }

                selectedToilet[stall] = (state == 1);
                System.out.println("상태가 변경되었습니다.");

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 입력해 주세요.");
            }
        }

        scanner.close();
    }
}
