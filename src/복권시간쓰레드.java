
public class 복권시간쓰레드 extends Thread{

	복권 복권;
	int day = 0;
	
	복권시간쓰레드(복권 복권){
		this.복권 = 복권;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000 * 20);
				복권.구매일 = day;
				day ++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
