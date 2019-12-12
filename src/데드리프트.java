
public class 데드리프트 extends 삼대운동 {
	홍길동 홍길동;
	
	데드리프트(홍길동 홍길동){
		this.홍길동 = 홍길동;
	}
	int 중량_반복수_세트수_설정(int one_RM) {
		System.out.println("===================================================");
		System.out.println("|                     1. 중량을 설정하기                                 |");
		System.out.println("|                     2. 반복수를 설정하기                              |");
		System.out.println("|                     3. 세트수를 설정하기                              |");
		System.out.println("===================================================");
		
		
		System.out.printf("[ 1. 중량 설정 - 최소 100] : ");
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
		System.out.println("|           "+중량+"KG의 중량으로 "+반복수+"회씩 "+세트수+"세트 반복한다.          |");
		System.out.println("|                                                 |");
		System.out.println("|                길동이의 현재 HP : "+홍길동.HP+"               |");
		System.out.println("|                                                 |");
		System.out.println("|          1회 반복할때마다 HP가 "+(중량/10)+"씩 감소합니다.           |");
		System.out.println("===================================================");
		return 2;
	}
	void 데드리프트수행하기(int 경고메시지무시여부) {
		if(홍길동.아버지옷착용여부) {
			아빠옷 = new 아빠옷관심스레드();
			아빠옷.start();			
		}
		
		for(int 세트수반복변수 = 1 ; 세트수반복변수 <= 세트수 ; 세트수반복변수 ++) {//세트를 반복한다.
			for(int 횟수반복변수 = 1 ; 횟수반복변수 <= 반복수 ; 횟수반복변수 ++) {//1회씩 운동을 반복한다.
				//운동을 반복하며 
				//1. HP는 떨어지고 
				//2. 데드리프트 중량은 증가한다.
				if(경고메시지무시여부 == 1) {
					부상확률 = (int)(Math.random() * 2 + 1);
				}
				
				System.out.println("[ 데드리프트를 진행해 보자 ]");
				System.out.println("===================================================");
				System.out.println("|                    1. 수행한다.                   |");				
				System.out.println("|                    2. 수행하지 않는다.               |");
				System.out.println("===================================================");
				System.out.printf("[ 선택 ] :");
				운동수행여부 = Integer.parseInt(스캐너.nextLine());
				
				if(운동수행여부 == 1) {//운동을 수행한다면!
					if(부상확률 == 1) {//1RM보다 높은 중량을 설정한 후, 경고메시지를 무시하고 운동을 수행할 시 50퍼센트의 확률로 부상을 초래한다.
						break;
					}
					//데드리프트를 수행함에 따라 중량설정값을 디폴트 비율로 하여 횟수와 셋트수를 반복할 때마다 HP가 떨어진다.
					홍길동.HP -= 중량/10;//데드리프트 1회를 반복할 때마다 중량의 1/10배씩 HP가 감소한다.
					System.out.println("┌────────────────────────────────────────────────┐");
					System.out.println("                          데드리프트 - "+세트수반복변수+"세트/"+세트수+"세트,  "+횟수반복변수+"회/"+반복수+"회              ");
					System.out.println("                                        뽑아 올리기 성공!!                 ");
					System.out.println("                                  길동이의 현재 HP : "+홍길동.HP+"              ");
					System.out.println("└────────────────────────────────────────────────┘");					
					홍길동.데드리프트1RM += 중량/50 * (반복수/2 * 세트수/2);//중량의 1퍼센트 비율로 반복수 세트수만큼 오른다.
					홍길동.삼대중량 += 중량/50 * (반복수/2 + 세트수/2);
				}else if(운동수행여부 == 2) {//운동을 수행하지 않는고 포기한다면
					System.out.println("[ 운동하는데 HP도 깎이고... 너무너무 힘들다 포기할래 T.T ]");
					break;
				}
				
			}
			System.out.println("====================================================");
			System.out.println("|         "+세트수반복변수+"번째 세트가 끝났습니다. 몇초 쉬시겠습니까?         |");
			System.out.println("|                 1초당 HP 1씩 회복                                    |");
			System.out.println("====================================================");
			System.out.printf("휴식시간 입력[초단위] : ");
			쉬는시간 = Integer.parseInt(스캐너.nextLine());
			
			for(int 초 = 1 ; 초 <= 쉬는시간 ; 초 ++) {
				try {
					Thread.sleep(쉬는시간 * 100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(홍길동.HP >= 1000) {
					홍길동.HP = 1000;
					break;
				}
				System.out.println("====================================================");
				System.out.println("|                   길동이 HP : "+(++홍길동.HP)+"                 |");
				System.out.println("====================================================");
			}
			System.out.println("[ 다음 세트를 진행합니다! ]");
			if(운동수행여부 == 1 && 부상확률 == 1) {
				System.out.println("부상당함");
				break;
			}
			
			if(세트수반복변수 == 세트수 && 횟수반복변수 == 0) {//데드리프트의 반복수와 세트수를 모두 채웠을 때
				System.out.println("[ 데드리프트는 성공적으로 클리어 했다!! ]");
				홍길동.길동이의신체상황();
			}
			
			
		}
		//해당 조건이 성립하지 않다는 것은 부상을 당했다는 것이다.
		if(세트수반복변수 != 세트수 && 횟수반복변수 != 반복수 && 운동수행여부 == 1 && 부상확률 == 1) {
			System.out.println("[ 너무 욕심부리다 그만... 허리를 접질러 버려 앞으론 운동을 못한다... ]");
			System.exit(0);
		}
		if(홍길동.아버지옷착용여부) {
			아빠옷.interrupt();			
		}
	}
}
