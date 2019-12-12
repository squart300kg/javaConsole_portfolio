import java.util.Scanner;

public class 사자이빨닦기 extends 아르바이트 {
	
	int 이빨갯수;
	int 사자가물었다;//1 - 물음, 0 - 안물음
	int 몇마리닦을건지 = 50000;
	//알바의 역경을 어떻게 겪냐에 따라 삼대중량과 HP감소량이 차이가 있다.
	
	//사자 이빨닦기의 알바의 경우, 작업 속도가 매우 빠르기에 시급보단 몇마리를 닦느냐가 더 어울린다. 
	//따라서 해당 메소드를 오버라이딩 하였다.
	void 알바시작(int 시급) {
		this.시급 = 시급;
		System.out.println("[ 사자 이빨닦기 알바를 시작하였다. 근무 기간과 하루에 몇마릴 닦을지 정해야 한다. ]");
		
		System.out.printf("[ 근무 일수 입력 ] : ");
		근무일수 = Integer.parseInt(스캐너.nextLine());

		System.out.printf("[ 몇마리 닦을건지 ] : ");
		몇마리닦을건지 = Integer.parseInt(스캐너.nextLine());
		
		
		수익금 += 시급 * 몇마리닦을건지 * 근무일수;
		//10만원씩 벌때마다 삼대중량이 1씩 떨어진다.
		삼대중량 -= (시급 * 몇마리닦을건지 * 근무일수/100000);
		//10만원씩 벌때마다 HP가 1씩 떨어진다.
		HP -= (시급 * 몇마리닦을건지 * 근무일수/100000);
	}
	void 근로계약서() {
		System.out.println("=======================근로계약서======================");
		System.out.println("|                   1. 한마리당 : "+시급+"원                              |");
		System.out.println("|                   2. 닦을 마리 수 : "+몇마리닦을건지+"마리                               |");
		System.out.println("|                   3. 근무기간 : "+근무일수+"일                                       |");
		System.out.println("|                   4. "+근무일수+" 후 수령액 : "+수익금+"원                         |");
		System.out.println("====================================================");
	}
	int 사자이빨닦기알바의역경(홍길동 홍길동) {
		//1. 사자에게 물릴수 있다. 생명이 위험할 수 있다.
		int 선택;
		소리쓰레드 사자;
		소리쓰레드 양치질;
		System.out.printf("[ 근로계약서를 쓰기 무섭게... ");
		for(int i = 1 ; i <= 근무일수 ; i++) {//근무일수만큼 반복한다.
			System.out.println("점주가 바로 사자 이빨을 교육도 없이 닦으라 한다. 너무 무서운 길동이... 이때 길동이의 선택은...? ]");
			System.out.println("====================================================");
			System.out.println("|                        1. 닦아 본다.                |");
			System.out.println("|                        2. 안닦는다.                 |");
			System.out.println("====================================================");
			System.out.printf("[ 입력 ] : ");
			선택 = Integer.parseInt(스캐너.nextLine());
			if(선택 == 1) {//사자 이빨을 닦는다.
				System.out.println("[ 사자의 입 안을 관찰하니 이빨의 갯수는 다음과 같았다. ]");
				이빨갯수 = 이빨갯수();
				System.out.println("사자 이빨갯수 1개당 1번씩 닦아줘야 한다.");
				for(int count = 1 ; count <= 몇마리닦을건지 ; count ++) {//사자의 마리수만큼 반복한다.
					양치질 = new 소리쓰레드("양치질소리");
					양치질.start();
					for(int j = 1 ; j <= 이빨갯수 ; j ++) {
						//자제무게가 30키로그람이 될때까지 반복한다.
						System.out.println("====================================================");
						System.out.println("|                   1. 닦는다.                       |");
						System.out.println("|                   2. 닦지 않는다.                    |");
						System.out.println("====================================================");
						System.out.printf("[ 입력 ] : ");
						선택 = Integer.parseInt(스캐너.nextLine());
						if(선택 == 1) {//이빨을 닦는다. 자제를 한번 나를때마다 길동이의 HP가 1씩 떨어진다.
							//여기서부터 이빨을 닦다가 사자가 물어버릴 수 있다. 10퍼센트의 확률이다.
							
							사자가물었다 = (int)(Math.random() * 10);
							if(사자가물었다 == 1) {//사자가 물었다면.
								사자 = new 소리쓰레드("사자소리");
								사자.start();
								j --;
								홍길동.HP -= 200;
								System.out.println("====================================================");
								System.out.println("|             사자에게 물렸다. 길동이의 HP가 200 깎였다.       |");
								System.out.println("|                    길동이 HP : "+홍길동.HP+"                  |");
								System.out.println("====================================================");
								if(홍길동.HP <= 0) {
									System.out.println("====================================================");
									System.out.println("|      길동이가 돈독이 올라 사자에게 많이 물려서 돌아가셨다...       |");
									System.out.println("====================================================");
									return 2;
								}
							}else{//사자가 안물었다.
								홍길동.HP -= 1;
								System.out.println("======================이빨 닦기 진행 상황===================");
								System.out.println("|       다행히 사자가 물지 않았고 하나의 이빨을 간신히 닦았다.        |");
								System.out.println("|              "+이빨갯수+"개의 이빨중 "+j+"개 닦았습니다.                 |");
								System.out.println("====================================================");
								if(j >= 이빨갯수) {
									System.out.println("┌────────────────────근무 진행 상황────────────────────┓");
									System.out.println("|                  "+몇마리닦을건지+"마리중 "+count+"마리의 이빨을 닦기 성공                          |");
									System.out.println("└──────────────────────────────────────────────────┘");
									try {
										Thread.sleep(2000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								
							}
						}else if(선택 == 2) {//사자 이빨을 안닦는다.
							System.out.println("====================================================");
							System.out.println("|         사자 이빨을 닦지 않을 경우 아르바이트에서 해고되며           |");
							System.out.println("|         급여를 받을 수 없습니다. 정말 그만두시겠습니까?       |");
							System.out.println("|                       [Y/N]                      |");
							System.out.println("====================================================");
							String 선택1 = 스캐너.nextLine();
							
							if(선택1.equalsIgnoreCase("Y")) {
								return 0;
							}else if(선택1.equalsIgnoreCase("N")) {
								
							}
						}
					}//for(int j = 1 ; j <= 이빨갯수 ; j ++) {
					//길동이가 한마리 닦을때마다 3대운동 증가분이 1 떨어진다.
					홍길동.삼대중량 -= 1;
					양치질.interrupt();//
				}//for(int count = 1 ; count <= 몇마리닦을건지 ; count ++) {
				
				System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
				System.out.println("|                    "+근무일수+"일 중 "+i+"일 근무 성공!              |");
				System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			}else if(선택 == 2) {//안간다.
				return 0;
			}
		}
		if(홍길동.삼대중량 <= 0)홍길동.삼대중량 = 0;
		return 1;
	}
	int 이빨갯수() {
		이빨갯수 = (int)(Math.random() * 5 + 5);
		System.out.println("====================================================");
		System.out.println("|                   이빨갯수 : "+이빨갯수+"개                                             |");
		System.out.println("====================================================");
		return 이빨갯수;
	}
		
	
}
