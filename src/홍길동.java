import java.util.ArrayList;
import java.util.Scanner;

public class 홍길동 {
	int 보유금액 = 5000;
	int 스쿼트1RM = 0;
	int 데드리프트1RM = 0;
	int 벤치프레스1RM = 0;
	int 삼대중량 = 스쿼트1RM + 데드리프트1RM + 벤치프레스1RM;
	int HP = 1000;
	
	boolean 언더아머상의보유여부 = false;
	boolean 언더아머하의보유여부 = false;
	boolean 우산보유여부 = false;
	boolean 헬스장체육복여부 = false;
	
	int 운동기간 =0;
	ArrayList<String> 준비물 = new ArrayList();//추후에 락커를 신청하지 않았을 시 체크리스트 
	//사용 의도는 락커를 신청 안했다면 헬스장 출발 전에 운동 준비물을 직접 챙겨가야 하는데 이를 챙기지 않고
	//그냥 헬스장을 간다면 집까지 왔다갔다하며 HP를 깍기 위함임.
	boolean 아버지옷착용여부 = false;
	String 선택1 = null;
	Scanner 스캐너 = new Scanner(System.in);
	
	이미지쓰레드 이미지쓰레드;
	
	int 지출(int 지출액) {//1을 반환시 길동이가 돈이 부족하다란 뜻
						//2를 반환시 길동이가 돈이 충분하다란 뜻
		if(보유금액 < 지출액) {
			//System.out.println("돈이 부족");
			return 1;
		}else {
			//System.out.println("돈이충분");
			보유금액 -= 지출액;
			return 2;
		}
	}
	
	void 길동이의선택() {
		
		System.out.println("┌────────────────────메뉴 선택─────────────────────────┐");
		System.out.println("│                    1. 돈벌기                                          ");
		System.out.println("│                    2. 운동 등록하기                                 ");
		System.out.println("│                    3. 운동하러 가기                                 ");
		System.out.println("│                    4. 상점가기                                 ");
		System.out.println("└───────────────────────────────────────────────────┘");
	}
	void 길동이의HP_삼대중량_돈능력치() {
		System.out.println("┌────────────────────길동이의능력치─────────────────────┐");
		System.out.println("│               - 길동이의 헬스장 잔여 일수 : "+운동기간+"일                           ");
		System.out.println("│               - 길동이의 HP    : "+HP+"                 ");
		System.out.println("│               - 길동이의 삼대중량 : "+삼대중량+"KG               ");
		System.out.println("│               - 길동이의 보유머니 : "+보유금액+"원                          ");
		System.out.println("└───────────────────────────────────────────────────┘");
	}
	void 길동이의신체상황() {
		System.out.println("┌────────────────────길동이의능력치─────────────────────┐");
		System.out.println("│            1. 길동이의 HP    : "+HP+"                 ");
		System.out.println("│            2. 길동이의 삼대중량 : "+삼대중량+"KG               ");
		System.out.println("└───────────────────────────────────────────────────┘");
	
	}
	void 길동이의보유머니() {
		System.out.println("┌────────────────────길동이의 머니 현황──────────────────┐");
		System.out.println("│              길동이의 보유머니 : "+보유금액+"원                            ");
		System.out.println("└───────────────────────────────────────────────────┘");
	}
	void 스쿼트1RM측정하기() {
		이미지쓰레드 = new 이미지쓰레드("스쿼트");
		이미지쓰레드.start();
		if(스쿼트1RM <= 0) {//처음 일알엠 측정시 50`~ 100사이값설정
			스쿼트1RM = (int)(Math.random() * 20 + 90);
			System.out.println("====================================================");
			System.out.println("|                                                  |");
			System.out.println("|   스쿼트 1RM을 측정해 보았다. 나의 스쿼트 1RM은 "+스쿼트1RM+"KG이다.   |");
			System.out.println("|                                                  |");
			System.out.println("====================================================");
			System.out.print("확인[Y]");
			선택1 = 스캐너.nextLine();
		}else {//처음 일알엠 측정이 아니라면 원래 값보다 큰 수를 저장한다.
			스쿼트1RM += (int)(Math.random() * 10 + 1);
		}
		삼대중량 += 스쿼트1RM;
		System.out.println("[ 스쿼트1RM ] : "+스쿼트1RM);
		
	}
	void 데드리프트1RM측정하기() {
		이미지쓰레드 = new 이미지쓰레드("데드리프트");
		이미지쓰레드.start();
		if(데드리프트1RM <= 0) {//처음 일알엠 측정시 50`~ 100사이값설정
			데드리프트1RM = (int)(Math.random() * 20 + 100);
			System.out.println("====================================================");
			System.out.println("|                                                  |");
			System.out.println("|   데드리프트 1RM을 측정해 보았다. 나의 스쿼트 1RM은 "+데드리프트1RM+"KG이다.   |");
			System.out.println("|                                                  |");
			System.out.println("====================================================");
			System.out.printf("확인[Y]");
			선택1 = 스캐너.nextLine();
		}else {//처음 일알엠 측정이 아니라면 원래 값보다 큰 수를 저장한다.
			데드리프트1RM += (int)(Math.random() * 10 + 1);
		}
		삼대중량 += 데드리프트1RM;
		System.out.printf("[ 데드리프트1RM측정하기 ] : "+데드리프트1RM);
	}
	void 벤치프레스1RM측정하기() {
		이미지쓰레드 = new 이미지쓰레드("벤치프레스");
		이미지쓰레드.start();
		if(벤치프레스1RM <= 0) {//처음 일알엠 측정시 50`~ 100사이값설정
			벤치프레스1RM = (int)(Math.random() * 20 + 80);
			System.out.println("====================================================");
			System.out.println("|                                                  |");
			System.out.println("|   스쿼트 1RM을 측정해 보았다. 나의 스쿼트 1RM은 "+벤치프레스1RM+"KG이다.   |");
			System.out.println("|                                                  |");
			System.out.println("====================================================");
			System.out.printf("확인[Y]");
			선택1 = 스캐너.nextLine();
		}else {//처음 일알엠 측정이 아니라면 원래 값보다 큰 수를 저장한다.
			데드리프트1RM += (int)(Math.random() * 10 + 1);
		}
		삼대중량 += 벤치프레스1RM;
		System.out.println("[ 벤치프레스1RM측정하기 ] : "+벤치프레스1RM);
	}
	
}
