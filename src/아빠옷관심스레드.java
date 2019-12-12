
public class 아빠옷관심스레드 extends Thread{

	@Override
	public void run() {
		while(true) {
			if(!isInterrupted()) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}System.out.println();
				System.out.println("							┌───────────────────────────────────────────────────┐");
				System.out.println("							│ (어머... 저사람 봐.. 패션 정말....... 수근수근수근수근....)");
				System.out.println("							│         아버지의 메리야스와 야자수 바지를 입고 운동하여");
				System.out.println("							│               사람들의 관심을 받고 있습니다.");
				System.out.println("							└───────────────────────────────────────────────────┘");
			}
				
			}
	}
}
