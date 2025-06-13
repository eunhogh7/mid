#  화장실 남는 위치알기

##  프로그램 설명 (3줄 요약)
화장실이 급할 때 **남는 칸을 빠르게 찾을 수 있도록**  
**앱을 통해 실시간 정보**를 제공하는 프로그램입니다.  
쾌적하고 효율적인 화장실 이용을 도와줍니다.

---

## 사용자 정의
**청주대학교 화장실을 이용하는 학생들**을 위한 프로그램입니다.  
남자/여자 화장실 각각의 칸 정보를 시각적으로 확인할 수 있습니다.

---

##  필요성
**왜 이 프로그램이 필요한가요?**

- 급한 상황에서 빠르게 빈 화장실을 찾을 수 있습니다.
- 대기 시간 단축 및 스트레스 감소
- 칸마다 들어가보지 않아도 상태 확인 가능
- 청결 유지에 기여 (급한 상황에서 실수 방지)

---

##  전체 동작 과정

###  전체 흐름 요약

1. **사용자가 화장실 칸에 들어간다**
2. **문을 잠근다**
3. **센서가 상태를 인식한다**
4. **인터넷으로 서버에 전달**
5. **앱에서 실시간 상태 확인 (빨간색: 사용 중 / 초록색: 비어 있음)**

---

##  개발 프로그램의 이점

###  대상 사용자
- **청주대학교 학생 전체**
- 특히 **화장실이 급한 상황에 처한 학생들**

###  사용자 혜택
- 빈 화장실을 **즉시 확인** 가능
- 불필요한 대기, 문 열기 시도 **없음**
- **시간 절약**, **쾌적한 캠퍼스 생활** 기여

---

>  본 프로그램은 단순한 칸 점유 확인을 넘어,  
> **스마트 캠퍼스 환경 구현**의 일환으로도 활용될 수 있습니다.





화장실 자리 관리 프로그램

이 프로그램은 화장실 칸의 상태를 관리하는 간단한 시스템입니다.  
사용자는 남자/여자 화장실의 각 칸에 대해 사용 여부를 확인하거나 변경할 수 있습니다.

---

##  기능

-  화장실 전체 상태 보기 (남/여 각각)
-  각 칸의 상태 변경 (비어 있음 / 사용 중)
-  잘못된 입력 처리 (메뉴/칸 번호/상태값)
-  안전한 종료 처리

---

##  실행 방법

1. Java가 설치된 환경에서 아래의 명령어로 실행:

```bash
javac Main.java
java Main
```

2. 콘솔에 출력되는 메뉴에 따라 번호를 입력하세요.

---

##  코드 설명

###  1. 초기화

```java
boolean[] maleToilet = {false, false, false};
boolean[] femaleToilet = {false, false, false, false};
```

- 남자 화장실: 3칸  
- 여자 화장실: 4칸  
- `false` → 비어 있음, `true` → 사용 중

---

###  2. 메뉴 구성

```
1. 전체 상태 보기
2. 자리 상태 바꾸기
3. 종료
```

---

###  3. 기능별 처리

####  전체 상태 보기

- 각 화장실의 칸 상태를 반복문으로 출력
- `true`면 "사용 중", `false`면 "비어 있음"

####  자리 상태 바꾸기

1. **화장실 선택** (1: 남, 2: 여)  
2. **칸 번호 선택** (유효 범위 체크)  
3. **상태 입력** (0: 비우기, 1: 사용하기)  

- 입력값이 잘못되면 경고 후 다시 입력 요청

####  종료

- 3번을 입력하면 프로그램 종료

---

##  예시 출력

```
===== 화장실 자리 관리 =====
1. 전체 상태 보기
2. 자리 상태 바꾸기
3. 종료
메뉴 선택: 1

[1층 남자화장실]
 - 칸 1: 비어 있음
 - 칸 2: 사용 중
 - 칸 3: 비어 있음

[2층 여자화장실]
 - 칸 1: 비어 있음
 - 칸 2: 비어 있음
 - 칸 3: 사용 중
 - 칸 4: 비어 있음
```

---

##  예외 처리

- 메뉴 번호 외 값 → `"잘못된 메뉴 번호입니다."`
- 화장실 번호 오류 → `"잘못된 선택입니다."`
- 칸 번호 오류 → `"잘못된 칸 번호입니다."`
- 상태값 오류 → `"잘못된 입력입니다."`

---

##  파일 구조

```
Main.java
README.md
```

---

##  향후 확장 아이디어

- GUI 기반으로 전환 (Swing, JavaFX)
- JSON 기반 데이터 저장/불러오기
- 관리자 인증 기능 추가
- 층/건물 단위 관리 확장

---

##  만든 목적

- Java 초보자용 콘솔 프로젝트 연습
- 배열과 조건문, 반복문 연습
- 사용자 입력 검증 로직 익히기

---
![스크린샷 2025-06-13 170122](https://github.com/user-attachments/assets/ee404f98-551a-488d-84b0-3f3fb824978c)

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


