
public class 이미지쓰레드 extends Thread{

	이미징 이미징;
	String 이미지이름 = null;
	
	이미지쓰레드(String 이미지이름){
		this.이미지이름 = 이미지이름;
	}
	@Override
	public void run() {
		
		if(이미지이름.equals("스쿼트")) {
			이미징 = new 이미징("스쿼트");
			이미징.이미지();
		}else if(이미지이름.equals("데드리프트")) {
			이미징 = new 이미징("데드리프트");
			이미징.이미지();
		}else if(이미지이름.equals("벤치프레스")) {
			이미징 = new 이미징("벤치프레스");
			이미징.이미지();
		}
	}
}
