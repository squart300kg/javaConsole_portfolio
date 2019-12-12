import java.util.Hashtable;
import java.util.Scanner;

public class 트레이너쓰레드 extends Thread {
	
	//트레이너가 하는 역할
	String 역할;
	홍길동 홍길동;
	//1.운동을 도와준다.
	//2.영업을 한다.
	트레이너쓰레드(String 역할,홍길동 홍길동){
		this.역할 = 역할;
		this.홍길동 = 홍길동;
	}
	
	트레이너쓰레드(){}
	
	@Override
	public void run() {
		
		if(역할.equals("운동을도와줌")) {
			for(int i = 1 ; i <= 10 ; i ++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				홍길동.HP++;
				홍길동.삼대중량++;
				if(홍길동.HP > 1000)홍길동.HP = 1000;
				System.out.println();
				System.out.println("							┌────────────────────────────────────────────────┐");
				System.out.println(" 							│          길동이HP : "+홍길동.HP+", 길동이 3대중량 : "+홍길동.삼대중량);
				System.out.println("							│    트레이너 버프!!! 길동이 HP : 1증가, 3대중량 1증가");
				System.out.println("							└────────────────────────────────────────────────┘");				
			}
		}else if(역할.equals("영업")) {
			for(int i = 1 ; i <= 20 ; i ++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("							┌────────────────────────────────────────────────┐");
				System.out.println("							│   그러한 과잉 친절의 이유는 다름 아닌 PT영업 때문이었다.... ");
				System.out.println(" 							│                 주저리 주저리....");
				System.out.println("							└────────────────────────────────────────────────┘");				
			}
		}
		
		
	}
}