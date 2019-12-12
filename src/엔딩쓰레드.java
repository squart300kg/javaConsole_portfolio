import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class 엔딩쓰레드 extends Thread {
	int time = 1000;
	Clip clip;
	
	@Override
	public void run() {
		골든벨엔딩();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						┌──────────────────────────엔딩──────────────────────┐");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│        길동이는 그렇게 삼대500을 찍어 행복하게 살았다고 한다.");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						└───────────────────────────────────────────────────┘");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						┌─────────────────────사용한 쓰레드─────────────────────┐");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 1.배경음 쓰레드 ");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  1.1.헬스장 등록 음악");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  1.2.헬스장 운동 음악");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  1.3.엔딩 음악");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  1.4.빗소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 2. 효과음 쓰레드");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.1.고기집 알바(설거지 할 때)");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.2.고기집 알바(고기 구울 때)");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.3.알바 끝나고 수당 받을 때");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.4.사자 이빨 닦는 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.5.사자가 무는 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.6.도박 결과 기다리는 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.7.도박 꽝 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.8.도박 당첨 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  2.9.단백질 먹은 감탄사 소리");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 3. 시간 쓰레드");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  3.1.헬스장 기간을 차감");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  3.2.날씨 쓰레드로 우산을 사야함");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 4. 트레이너 쓰레드");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  4.1.50%확률로 운동을 도와준다");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  4.2.50%확률로 영업을 한다");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 5. 언더아머 단속반 쓰레드");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  5.1. 언더아머 옷을 입고 있을 시 찢어버린다");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  5.2. 옷을 입고 있지 않을시엔 일정확률로 헬스장을 어슬렁 거리며 위압감을 준다(HP 소량 감소)");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  5.3. 단속반의 예상치 못한 친절(HP와 돈이 극소량일 때 도와줌)");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						├ 6. 이미지 쓰레드");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  6.1. 스쿼트 시작할 때");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  6.2. 데드리프트 시작할 때");
		try {Thread.sleep(time);} catch (InterruptedException e) {}	System.out.println("						│  6.3. 벤치프레스 시작할 때");
		try {Thread.sleep(time);} catch (InterruptedException e) {} System.out.println("						└───────────────────────────────────────────────────┘");
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println();
		try {Thread.sleep(time);} catch (InterruptedException e) {}System.out.println("												감사합니다!");
		
	}
	public void 골든벨엔딩() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\골든벨엔딩.wav");
         
         
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
