import java.util.Scanner;

public class 돈구하기종류 {
	int 수익금;
	 int 삼대중량;//돈을 구하면 삼대중량이 감소한다.
	 int HP;//돈을 구하면 HP가 감소한다.
	 Scanner 스캐너 = new Scanner(System.in);
	 
	 static void 돈벌기목록() {
		 System.out.println("======================돈벌기목록=======================");
		 System.out.println("|                     1. 알바                                         |");
		 System.out.println("|                     2. 복권                                         |");
		 System.out.println("|                     3. 도박장                                      |");
		 System.out.println("|                     4. 나가기                                      |");
		 System.out.println("====================================================");
		 System.out.printf("[ 입력 : ]");

	 }
}
