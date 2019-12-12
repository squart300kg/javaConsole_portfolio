import java.util.Scanner;

public class 뜨거운고기집 extends 아르바이트 {
	int 시급 = 12000;
	int 설거지갯수;//설거지의 갯수는 10~30개이다.
	int 불판갯수;//불판의 갯수는 10~10개이다.
	//알바의 역경을 어떻게 겪냐에 따라 삼대중량과 HP감소량이 차이가 있다.
	int 고기집알바의역경(홍길동 홍길동) {
	//1. 불판이 너무 뜨겁다.
	//2. 설거지가 너무 많다.
	//3. 서빙이 너무 많다.
	//4. 손님이 술먹고 주정을 부린다.
		int 선택;
		
		System.out.printf("[ 근로계약서를 쓰기 무섭게... ");
		for(int i = 1 ; i <= 근무일수 ; i++) {
			System.out.println("점주가 바로 설거지를 지시한다. 이때 길동이의 선택은... ]");
			System.out.println("====================================================");
			System.out.println("|                    1. 점주의 지시에 따른다.            |");
			System.out.println("|                    2. 따르지 않는다.                 |");
			System.out.println("====================================================");
			System.out.printf("[ 입력 ] : ");
			선택 = Integer.parseInt(스캐너.nextLine());
			if(선택 == 1) {//설거지를 한다.
				소리쓰레드 설거지 = new 소리쓰레드("설거지소리");
				설거지.start();
				System.out.println("[ 설거지를 하러가니 설거지의 갯수는 다음과 같았다. ]");
				설거지갯수 = 설거지갯수();
				System.out.println("설거지 갯수 한개당 한번씩 클릭해야 한다.");
				for(int j = 1 ; j <= 설거지갯수 ; j ++) {
					//자제무게가 30키로그람이 될때까지 반복한다.
					System.out.println("====================================================");
					System.out.println("|                        1. 한다.                   |");
					System.out.println("|                        2. 안한다.                  |");
					System.out.println("====================================================");
					System.out.printf("[ 입력 ] : ");
					선택 = Integer.parseInt(스캐너.nextLine());
					if(선택 == 1) {//설거지를 수행한다.  한번 수행할 때마다 길동이의 HP가 1씩 떨어진다.
						홍길동.HP -= 1;
						System.out.println("====================================================");
						System.out.println("|              "+설거지갯수+"개의 설거지중 "+j+"개를 완료하였습니다.          |");
						System.out.println("====================================================");
						if(j >= 설거지갯수) {
							System.out.println("[ 설거지를 끝냈다!!! 기분이 좋으려고 하는 찰나... 점주가 손님들의 고기를 구워주라고 한다... ]");
						}
					}else if(선택 == 2) {//설거지를 안한다.
						System.out.println("====================================================");
						System.out.println("|         점주의 지시에 불응할 경우 아르바이트에서 해고되며               |");
						System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
						System.out.println("|                       [Y/N]                      |");
						System.out.println("====================================================");
						String 선택1 = 스캐너.nextLine();
						
						if(선택1.equalsIgnoreCase("Y")) {
							return 0;
						}else if(선택1.equalsIgnoreCase("N")) {
							
						}
					}
				}
				for(int z = 1 ; z <= 5 ; z ++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				//길동이가 자제를 하루동안 날랐다면 3대운동 증가분이 1 떨어진다.
				홍길동.삼대중량 -= 1;
				if(홍길동.삼대중량 <= 0 )홍길동.삼대중량 = 0;
			}else if(선택 == 2) {//안간다.
				return 0;
			}
			
			//설거지 업무를 다 끝내고 이제 불판을 닦는다.
			System.out.println(" 이때 길동이의 선택은... ]");
			System.out.println("====================================================");
			System.out.println("|                   1. 점주의 지시를 따른다                         |");
			System.out.println("|                   2. 따르지 않는다                                   |");
			System.out.println("====================================================");
			System.out.printf("[ 입력 ] : ");
			선택 = Integer.parseInt(스캐너.nextLine());
			if(선택 == 1) {//설거지를 한다.
				System.out.println("[ 손님들의 고기를 구워줄 테이블의 수는 다음과 같았다. ]");
				불판갯수 = 불판갯수();
				소리쓰레드 고기 = new 소리쓰레드("고기굽는소리");
				고기.start();
				System.out.println("한테이블당 한번씩 클릭해야 한다.");
				for(int j = 1 ; j <= 불판갯수 ; j ++) {

					System.out.println("====================================================");
					System.out.println("|                        1. 한다.                   |");
					System.out.println("|                        2. 안한다.                  |");
					System.out.println("====================================================");
					System.out.printf("[ 입력 ] : ");
					선택 = Integer.parseInt(스캐너.nextLine());
					if(선택 == 1) {//자제를 나른다. 자제를 한번 나를때마다 길동이의 HP가 1씩 떨어진다.
						홍길동.HP -= 2;
						System.out.println("====================================================");
						System.out.println("|              "+불판갯수+"개의 테이블중 "+j+"개를 완료하였습니다.          |");
						System.out.println("====================================================");
						if(j >= 불판갯수) {
							고기.interrupt();
							System.out.println("[ 휴... 설거지 폭탄에 손님들의 고기를 구워주는 것도 너무 힘들었다... 그래도 오늘 근무는 끝냈다. ]");
							System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
							System.out.println("|                    "+근무일수+"일 중 "+i+"일 근무 성공!              |");
							System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
							
						}
					}else if(선택 == 2) {//설거지를 안한다.
						System.out.println("====================================================");
						System.out.println("|         설거지를 하지 않을 경우 아르바이트에서 해고되며               |");
						System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
						System.out.println("|                       [Y/N]                      |");
						System.out.println("====================================================");
						String 선택1 = 스캐너.nextLine();
						
						if(선택1.equalsIgnoreCase("Y")) {
							return 0;
						}else if(선택1.equalsIgnoreCase("N")) {
							
						}
					}
				}
				//길동이가 자제를 하루동안 날랐다면 3대운동 증가분이 1 떨어진다.
				홍길동.삼대중량 -= 1;
				if(홍길동.삼대중량 <= 0 )홍길동.삼대중량 = 0;
			}else if(선택 == 2) {//점주의 지시에 불응한다.
				System.out.println("====================================================");
				System.out.println("|         점주의 지시에 불응할 경우 아르바이트에서 해고되며            |");
				System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
				System.out.println("|                       [Y/N]                      |");
				System.out.println("====================================================");
				String 선택1 = 스캐너.nextLine();
				
				if(선택1.equalsIgnoreCase("Y")) {
					return 0;
				}else if(선택1.equalsIgnoreCase("N")) {
					
				}
			}
		}
		if(홍길동.삼대중량 <= 0)홍길동.삼대중량 = 0;
		return 1;
	}
	int 설거지갯수() {
		설거지갯수 = (int)(Math.random() * 20 + 10);
		System.out.println("====================================================");
		System.out.println("|                   설거지갯수 : "+설거지갯수+"개                                         |");
		System.out.println("====================================================");
		return 설거지갯수;
	}
	int 불판갯수() {
		불판갯수 = (int)(Math.random() * 10 + 10);
		System.out.println("====================================================");
		System.out.println("|                   테이블수 : "+불판갯수+"개                                              |");
		System.out.println("====================================================");
		return 불판갯수;
	}
	
	
}
