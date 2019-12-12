import java.util.Scanner;

public class 언더아머단속반 extends Thread{
	Scanner 스캐너 = new Scanner(System.in);
	홍길동 홍길동;
	이미징 이미지;
	int 선택1;
	언더아머단속반(홍길동 홍길동){
		this.홍길동 = 홍길동;
	}
	@Override
	public void run() {
		
			int 확률 = (int)(Math.random() * 5 + 1);//20퍼센트의 확률로 등장
			if(홍길동.언더아머상의보유여부 || 홍길동.언더아머하의보유여부) {//언더아모 옷을 입고있다면
				if(확률 == 1) {//단속반 등장확률 20퍼센트
				이미지 = new 이미징("단속반");
				이미지.이미지();
					단속반의옷찢어버리기();
					System.out.println("┌────────────────────────────────────────────────┐");
					System.out.println("│      단속반에게 옷을 찢겼습니다. 옷을 어떻게 하시겠습니까?  	");
					System.out.println("│             1. 아버지의 옷을 입는다.  ");
					System.out.println("│             2. 헬스장 체육복을 구매한다.  ");
					System.out.println("└────────────────────────────────────────────────┘");
					System.out.printf("입력 : ");
					선택1 = Integer.parseInt(스캐너.nextLine());
					if(선택1 == 1	) {
						홍길동.아버지옷착용여부 = true;
					}else if(선택1 == 2) {
						홍길동.헬스장체육복여부 = true;
					}
				}
			}else {
				if(확률 == 1) {//언더아모 옷을 입고있지 않은데 단속반이 왔다면 압박감으로 인해 HP가 감소한다.
					이미지 = new 이미징("단속반");
					이미지.이미지();
					for(int i = 5 ; i >= 0 ; i --) {
						try {
							//System.out.println("sleep전");
							Thread.sleep(1000);
							//System.out.println("sleep후");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							홍길동.HP --;
							System.out.println();
							System.out.println("                                                     ┌────────────────────────────────────────────────┐");
							System.out.println("                                                     │                 단속반이 등장하였습니다                            ");
							System.out.println("                                                     │             압박감으로 인해 HP가 1씩 감소합니다.         ");
							System.out.println("                                                     └────────────────────────────────────────────────┘");
							
					}
				}
			}
	}
	
	
	void 단속반의옷찢어버리기() {
		
		if(홍길동.언더아머상의보유여부 && 홍길동.언더아머하의보유여부) {//상하의를 모두 보유한다면
			
			홍길동.언더아머상의보유여부 = false;
			홍길동.언더아머하의보유여부 = false;
			홍길동.HP -= 20;
			System.out.println();
			System.out.println(" 							┌────────────────────────────────────────────────┐");
			System.out.println(" 							│                     단속반으로부터   ");
			System.out.println(" 							│               상의 + 하의를 찢기게 되었으며,");
			System.out.println(" 							│                 HP가 20 감소하였습니다.");
			System.out.println(" 							└────────────────────────────────────────────────┘");
			//return true;
		}else if(홍길동.언더아머하의보유여부) {//하의만 보유한다면
			홍길동.언더아머하의보유여부 = false;
			홍길동.HP -= 10;
			System.out.println();
			System.out.println(" 							┌────────────────────────────────────────────────┐");
			System.out.println(" 							│                     단속반으로부터   ");
			System.out.println(" 							│                   하의를 찢기게 되었으며,");
			System.out.println(" 							│                 HP가 10 감소하였습니다.");
			System.out.println(" 							└────────────────────────────────────────────────┘");
			//return true;
		}else if(홍길동.언더아머상의보유여부) {//상의만 보유한다면
			홍길동.언더아머상의보유여부 = false;
			홍길동.HP -= 10;
			System.out.println();
			System.out.println(" 							┌────────────────────────────────────────────────┐");
			System.out.println(" 							│                     단속반으로부터   ");
			System.out.println(" 							│                   상의를 찢기게 되었으며,");
			System.out.println(" 							│                 HP가 10 감소하였습니다.");
			System.out.println(" 							└────────────────────────────────────────────────┘");
			//return true;
		}
		//return false;
	}
	
}
