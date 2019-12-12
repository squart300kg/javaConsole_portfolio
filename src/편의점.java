import java.util.ArrayList;
import java.util.Arrays;

public class 편의점 extends 아르바이트{
	int 시급 = 8000;
	int 자제무게;//10키로에서 30
	//boolean[] 업무일지 = new boolean[근무기간];
	String 선택1 = null;
	//알바를 시작하면 
	//돈을 번다 + 삼대중량이 떨어진다 + HP가 떨어진다. 월급에 비례해서 떨어진다.
	
	//알바의 역경을 어떻게 겪냐에 따라 
	//삼대중량과 HP감소량이 차이가 있다.
	int 편의점역경(홍길동 홍길동) {//편의점 역경을 무사히 끝마치면 1, 이상하게 때려치면 0
		int 선택;
		//1. 자제나르기&물품 진열이 꽤 힘들다.
		//2. 담배이름 외우기
		//========>>이러한 역경은 확률로 계산된다. 30퍼센트의 확률
		System.out.printf("[ 근로계약서를 쓰기 무섭게... ");
		for(int i = 1 ; i <= 근무일수 ; i++) {
			System.out.println("점주가 바로 자제를 나르는 업무시지를 내린다. 이때 길동이의 선택은... ]");
			System.out.println("====================================================");
			System.out.println("|                    1. 업무지시에 따른다.              |");
			System.out.println("|                    2. 따르지 않는다.                 |");
			System.out.println("====================================================");
			System.out.printf("[ 입력 ] : ");
			선택 = Integer.parseInt(스캐너.nextLine());
			if(선택 == 1) {//업무지시를 따른다.
				System.out.println("[ 자제를 보러가니 자제의 무게가 다음과 같았다. ]");
				자제무게 = 자제무게();
				System.out.println("자제 KG당 한번 날라야 한다.");
				for(int j = 1 ; j <= 자제무게 ; j ++) {
					//자제무게가 30키로그람이 될때까지 반복한다.
					System.out.println("====================================================");
					System.out.println("|                   1. 나른다                                                    |");
					System.out.println("|                   2. 나르지 않는다.                  |");
					System.out.println("====================================================");
					System.out.printf("[ 입력 ] : ");
					선택 = Integer.parseInt(스캐너.nextLine());
					if(선택 == 1) {//자제를 나른다. 자제를 한번 나를때마다 길동이의 HP가 1씩 떨어진다.
						홍길동.HP -= 1;
						System.out.println("====================================================");
						System.out.println("|              "+자제무게+"KG의 자제중 "+j+"KG 날랐습니다.            |");
						System.out.println("====================================================");
						if(j >= 자제무게) {
							System.out.println("[ 드디어 오늘 하루의 업무 할당량을 다 끝냈다!! 나의 근무 진행상황은]");
							System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
							System.out.println("|                    "+근무일수+"일 중 "+i+"일 근무 성공!              |");
							System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
							
							//Arrays.fill(업무일지, 0, i - 1, true);
							
						}
					}else if(선택 == 2) {//자제를 안나른다.
						자제무게 --;
						System.out.println("====================================================");
						System.out.println("|         자제를 나르지 않을 경우 아르바이트에서 해고되며               |");
						System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
						System.out.println("|                       [Y/N]                      |");
						System.out.println("====================================================");
						선택1 = 스캐너.nextLine();
						
						if(선택1.equalsIgnoreCase("Y")) {
							return 0;
						}else if(선택1.equalsIgnoreCase("N")) {
							
						}
					}
				}
				//길동이가 자제를 하루동안 날랐다면 3대운동 증가분이 1 떨어진다.
				홍길동.삼대중량 -= 1;
				
			}else if(선택 == 2) {//안간다.
				System.out.println("====================================================");
				System.out.println("|        업무지시를 따르지 않을 경우 아르바이트에서 해고되며           |");
				System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
				System.out.println("|                       [Y/N]                      |");
				System.out.println("====================================================");
				선택1 = 스캐너.nextLine();
				
				if(선택1.equalsIgnoreCase("Y")) {
					return 0;
				}else if(선택1.equalsIgnoreCase("N")) {
					
				}
			}
		}
		if(홍길동.삼대중량 <= 0)홍길동.삼대중량 = 0;
		return 1;
	}
	
	int 자제무게() {
		자제무게 = (int)(Math.random() * 20 + 10);
		System.out.println("====================================================");
		System.out.println("|                   자제무게 : "+자제무게+"KG                   |");
		System.out.println("====================================================");
		return 자제무게;
	}
	void 자제나르기선택() {
		System.out.println("====================================================");
		System.out.println("|                   1. 나른다                                                    |");
		System.out.println("|                   2. 나르지 않는다.                  |");
		System.out.println("====================================================");
	}
	
}
