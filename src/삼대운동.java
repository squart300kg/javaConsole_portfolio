import java.util.Scanner;

public class 삼대운동 {
	int 중량;
	int 반복수;
	int 세트수;
	int HP감소량;
	String 경고선택;
	홍길동 홍길동;
	int 부상확률;
	int 운동수행여부;
	int 세트수반복변수;
	int 횟수반복변수;
	int 쉬는시간;
	int 트레이너가다가올확률;//랜덤메서드를 사용하여 1 ~ 10사이를 설정한다.
	Scanner 스캐너 = new Scanner(System.in);
	아빠옷관심스레드 아빠옷;
	
	
	static void 리스트보기() {
		System.out.println("=======================운동 리스트====================");
		System.out.println("|               수행하고싶은 운동을 선택해 주세요                   |");
		System.out.println("|                    1. 스쿼트                                        |");
		System.out.println("|                    2. 데드리프트                                   |");
		System.out.println("|                    3. 벤치프레스                                   |");
		System.out.println("===================================================");
	}
	
	void 삼대중량(홍길동 홍길동) {
		System.out.println("=======================삼대 중량 현황===================");
		System.out.println("|                    스쿼트       : "+홍길동.스쿼트1RM+"KG              |");
		System.out.println("|                    데드리프트 : "+홍길동.데드리프트1RM+"KG              |");
		System.out.println("|                    벤치프레스 : "+홍길동.벤치프레스1RM+"KG              |");
		System.out.println("|                                                |");
		System.out.println("|                    삼대 중량 : 400KG               |");
		System.out.println("===================================================");
	}
	int 중량_반복수_세트수_설정(int one_RM) {
		System.out.println("===================================================");
		System.out.println("|                     1. 중량을 설정하기                                 |");
		System.out.println("|                     2. 반복수를 설정하기                              |");
		System.out.println("|                     3. 세트수를 설정하기                              |");
		System.out.println("===================================================");
		
		
		System.out.printf("[ 1. 중량 설정 ] : ");
		중량 = Integer.parseInt(스캐너.nextLine());
		
		if(중량 > one_RM) {
			System.out.println("===================================================");
			System.out.println("|  *경고* 설정한 중량이 1RM 보다 높습니다. 부상의 위험이 있습니다.  |");
			System.out.println("|                  진행하시겠습니까? [Y/N]             |");
			System.out.println("===================================================");
			System.out.printf("[ 선택 ] :");
			경고선택 = 스캐너.nextLine();
			if(경고선택.equalsIgnoreCase("Y")) {//경고메시지를 무시한다.
				System.out.println("[ 경고메시지 따윈 두렵지 않다. 불도저처럼 진행한다. ]");
				System.out.printf("[ 2. 반복수 설정 ] :");
				반복수 = Integer.parseInt(스캐너.nextLine());
				
				System.out.printf("[ 3. 세트수 설정 ] : ");
				세트수 = Integer.parseInt(스캐너.nextLine());
				
				System.out.println("===================================================");
				System.out.println("|            "+중량+"KG의 중량으로 "+반복수+"회씩 "+세트수+"세트 반복한다.           |");
				System.out.println("===================================================");
				return 1;	//경고메시지를 쌩무시		
			}else if(경고선택.equalsIgnoreCase("N")) {//경고메시지를 무시 안함.
				System.out.println("[ 그래도 안전이 최우선이지!! 중량을 다시 설정해 보자. ]");
				
				if(중량_반복수_세트수_설정(one_RM) == 2) {
					return 2;
				}
			}
		}
		System.out.printf("[ 2. 반복수 설정 ] :");
		반복수 = Integer.parseInt(스캐너.nextLine());
		
		System.out.printf("[ 3. 세트수 설정 ] : ");
		세트수 = Integer.parseInt(스캐너.nextLine());
		
		System.out.println("===================================================");
		System.out.println("|            "+중량+"KG의 중량으로 "+반복수+"회씩 "+세트수+"세트 반복한다.           |");
		System.out.println("===================================================");
		return 2;
	}
	
}
