import java.util.Timer;
import java.util.TimerTask;

public class 도박 extends 돈구하기종류{
	
	홍길동  홍길동;
	int 배팅금;
	int 당첨확률;//도깨비도박의 경우 1/20, 중간도박의 경우 10/1, 쉬운도박의 경우 1/5
	소리쓰레드 도박;
	
	도박(홍길동 홍길동){
		this.홍길동 = 홍길동;
	}
	void 도박장경고문구() {
		System.out.println("┌───────────────────────────────────────────────────┐");
		System.out.println("│           *주의* 도박은 인생을 날려먹을 수도 있습니다.         ");
		System.out.println("│            이로 인해 마이너스 잔고의 위험이 있습니다.");
		System.out.println("│");
		System.out.println("│              그래도 입장하시겠습니까? [ Y/N ]            ");
		System.out.println("└───────────────────────────────────────────────────┘");
	}
	
	void 도박장입장() {
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("|                                                  |");
		System.out.println("|          강원랜드에 오신 것을 열렬히 환영합니다!^.^           |");
		System.out.println("|                                                  |");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
	}
	void 도박종류() {
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("|            1. 도깨비도박 - [20배 / 5%확률]             |");
		System.out.println("|            2. 무난쓰도박 - [10배 / 10%확률]            |");
		System.out.println("|            3. 깨갱이도박 - [5배 / 20%확률]             |");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		
	}
	void 도깨비도박() {
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("|                 도깨비도박을 선택하셨습니다!              |");
		System.out.println("|                  금액을 배팅해 주세요!^.^*              |");
		System.out.println("|                                                   |");
		System.out.println("|             길동이 보유 금액 : "+홍길동.보유금액+"원              |");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.printf("[ 배팅금 입력] : ");
		배팅금 = Integer.parseInt(스캐너.nextLine());
		홍길동.지출(배팅금);
		
		도박 = new 소리쓰레드("도박결과기다리는소리");
		도박.start();
		int count = 5;
		while(count-- != 0) {
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 도깨비도박을 선택하셨습니다!              |");
			System.out.println("|               "+(count+1)+"초 후에 결과가 공개됩니다!^.^*             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		당첨확률 = (int)(Math.random() * 10 + 1);
		if(당첨확률 == 1) {//당첨됨
			도박 = new 소리쓰레드("도박당첨소리");
			도박.start();
			
			배팅금 = 배팅금 * 20;
			홍길동.보유금액 += 배팅금;
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 축하드립니다! 당첨되셨습니다!^.^*        |");
			System.out.println("|             당첨금액은 20배인 "+배팅금+"원입니다!          |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}else {//당첨안됨
			도박 = new 소리쓰레드("도박꽝소리");
			도박.start();
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                    아쉽습니다.. 꽝입니다                                |");
			System.out.println("|                   다음 기회를 노려보세요 T.T             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}
	}
	void 무난쓰도박() {
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("|                 무난쓰도박을 선택하셨습니다!              |");
		System.out.println("|                  금액을 배팅해 주세요!^.^*              |");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.printf("[ 배팅금 입력] : ");
		배팅금 = Integer.parseInt(스캐너.nextLine());
		홍길동.지출(배팅금);
		
		도박 = new 소리쓰레드("도박결과기다리는소리");
		도박.start();
		int count = 5;
		while(count-- != 0) {
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 무난쓰도박을 선택하셨습니다!              |");
			System.out.println("|               "+(count+1)+"초 후에 결과가 공개됩니다!^.^*             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		당첨확률 = (int)(Math.random() * 10 + 1);
		if(당첨확률 == 1) {//당첨됨
			도박 = new 소리쓰레드("도박당첨소리");
			도박.start();
			배팅금 = 배팅금 * 10;
			홍길동.보유금액 += 배팅금;
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 축하드립니다! 당첨되셨습니다!^.^*        |");
			System.out.println("|             당첨금액은 10배인 "+배팅금+"원입니다!!         |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}else {//당첨안됨
			도박 = new 소리쓰레드("도박꽝소리");
			도박.start();
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                    아쉽습니다.. 꽝입니다                                |");
			System.out.println("|                   다음 기회를 노려보세요 T.T             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}
	}
	void 깨갱이도박() {
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("|                 깨갱이도박을 선택하셨습니다!              |");
		System.out.println("|                  금액을 배팅해 주세요!^.^*              |");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.printf("[ 배팅금 입력] : ");
		배팅금 = Integer.parseInt(스캐너.nextLine());
		홍길동.지출(배팅금);
		
		int count = 5;
		도박 = new 소리쓰레드("도박결과기다리는소리");
		도박.start();
		while(count-- != 0) {
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 깨갱이도박을 선택하셨습니다!              |");
			System.out.println("|               "+(count+1)+"초 후에 결과가 공개됩니다!^.^*             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("");
		당첨확률 = 1;
		if(당첨확률 == 1) {//당첨됨
			배팅금 = 배팅금 * 5;
			홍길동.보유금액 += 배팅금;
			도박 = new 소리쓰레드("도박당첨소리");
			도박.start();
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                 축하드립니다! 당첨되셨습니다!^.^*        |");
			System.out.println("|             당첨금액은 5배인 "+배팅금+"원입니다!          |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}else {//당첨안됨
			도박 = new 소리쓰레드("도박꽝소리");
			도박.start();
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("|                    아쉽습니다.. 꽝입니다                                |");
			System.out.println("|                   다음 기회를 노려보세요 T.T             |");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		}
	}
	
	
	
	
}
