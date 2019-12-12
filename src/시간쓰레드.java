import java.io.File;
import java.util.Hashtable;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

//우선 시간쓰레드는 길동이의 헬스장 이용일수를 차감시켜준다.
public class 시간쓰레드 extends Thread {
	int hour = 0;
	int day = 0;
	int 날씨; // 1 - 맑음 2 - 흐림 3 - 비
	boolean flag = false;
	Clip clip;
	홍길동 홍길동;
	Hashtable<String, Integer> 기간 = new Hashtable();
	
	시간쓰레드(홍길동 홍길동){
		this.홍길동 = 홍길동;
	}
	
	@Override
	public void run() {
		 //24시간이 지나면 하루를 증가시킨다.
		날씨  = 3;
		
		if(날씨 == 3 && !홍길동.우산보유여부) {
			//System.out.println("ㅎㅇ1");
			비오는소리();
			
		}
		while(true) {
			//10초에 1시간이 흐른다.
			//게임속의 24시간 => 현실세계의 4분 
			//System.out.println("바깥쪽 인터럽트 상황 : " + isInterrupted());
			if(isInterrupted()) {
				try {
					if(clip.isRunning() || 홍길동.우산보유여부) {
						clip.close();
					}
				}catch(NullPointerException ne) {}
			}
			기간.put("운동기간",홍길동.운동기간);
			try {
				Thread.sleep(1000 * 2);
				hour ++;
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
			if(hour >= 25) {
				try {
					if(clip.isRunning() || 홍길동.우산보유여부) {
						clip.close();
					}					
				}catch(NullPointerException ne) {}
				hour = 0;
				//25시간이 지나면 하루가 지난다.
				day ++;
				기간.put("날짜",day);
				//하루가 지나고 길동이의 운동 기간이 남아있다면 감소시킨다.
				//하루가 지나면 날씨도 바뀐다.
				날씨  = (int)(Math.random() * 3 + 1);
				if(날씨 == 3 && !홍길동.우산보유여부) {
						비오는소리();						
						//System.out.println("ㅎㅇ2");
				}
				if(홍길동.운동기간 > 0) {
					홍길동.운동기간 --;
					//System.out.println("홍길동.운동기간 : " + 홍길동.운동기간);
				}
			}
		}
	}
	
	public void 비오는소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\비오는소리.wav");
         
         
         try {
             stream = AudioSystem.getAudioInputStream(bgm);
             format = stream.getFormat();
             info = new DataLine.Info(Clip.class, format);
             clip = (Clip)AudioSystem.getLine(info);
             clip.open(stream);
             clip.start();
             
             //clip.close();
      } catch (Exception e) {
             System.out.println("err : " + e);
             }

	}
	
}
