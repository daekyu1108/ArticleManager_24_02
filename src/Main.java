import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("== 프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);

    System.out.print("명령어 > ");
    String cmd = sc.nextLine();
    System.out.printf("입력된 명령어 : %s\n", cmd);

    sc.close();
    System.out.println("== 프로그램 종료 ==");
  }
}