import java.util.Scanner;

public class 아르바이트 extends 돈구하기종류 {
	int 시급;
	int 하루근무시간 = 8;
	int 근무일수;
	
	
	/*
	 * 호출 순서
	 * 1. 알바 시작 메소드
	 * 2. 근로계약서 메소드
	 * 3. 알바의 역경 메소드(자식 클래스에 정의되어 있음.)
	 * 4. 알바끝 메소드
	 * */
	
	static void 아르바이트리스트() {
		 System.out.println("======================아르바이트목록=====================");
		 System.out.println("|      1. 편의점         - 난이도 : 하,- 시급 : 8,000원               |");
		 System.out.println("|      2. 뜨거운고기집 - 난이도 : 중,- 시급 : 11,000원             |");
		 System.out.println("|      3. 사자이빨닦기 - 난이도 : 상,- 한마리당 : 50,000원       |");
		 System.out.println("|                                                   |");
		 System.out.println("|          아르바이트를 수행할 시, HP와 3대중량이 감소합니다          |");
		 System.out.println("=====================================================");
	}
	void 근로계약서() {
		System.out.println("=======================근로계약서======================");
		System.out.println("|                   1. 시급 : "+시급+"원                                    |");
		System.out.println("|                   2. 하루근무시간 : "+하루근무시간+"시간                            |");
		System.out.println("|                   3. 근무기간 : "+근무일수+"일                                     |");
		System.out.println("|                   4. "+근무일수+" 후 수령액 : "+수익금+"원                       |");
		System.out.println("====================================================");
	}
	//알바 월급을 정산한다.
		void 알바끝(홍길동 홍길동) {
			소리쓰레드 소리 = new 소리쓰레드("동전소리");
			소리.start();
			홍길동.보유금액 += 수익금;
		}
		void 알바시작(int 시급) {
			this.시급 = 시급;
			System.out.println("[ 알바를 시작하였다. 근무 기간을 정해야 한다. ]");
			
			System.out.printf("[ 근무 일수 입력 ] : ");
			근무일수 = Integer.parseInt(스캐너.nextLine());
			
			수익금 += 시급 * 하루근무시간 * 근무일수;
			//10만원씩 벌때마다 삼대중량이 1씩 떨어진다.
			삼대중량 -= (시급 * 하루근무시간 * 근무일수/100000);
			//10만원씩 벌때마다 HP가 1씩 떨어진다.
			HP -= (시급 * 하루근무시간 * 근무일수/100000);
		}	
	
	
}
