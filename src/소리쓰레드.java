import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class 소리쓰레드 extends Thread{
	
//	private boolean stop;
	String 쓰레드선택 = null;
	Clip clip;
	
	
	//헬스장, 돈버는소리, 동전소리, 설거지소리, 사자소리, 양치질소리, 도박 꽝소리, 도박 당첨소리, 도박 결과 기다리는소리, 고기굽는소리, 감탄사
	소리쓰레드(String 쓰레드선택){
		this.쓰레드선택 = 쓰레드선택;
	}
	
//	public void setter(boolean stop) {
//		this.stop = stop;
//	}


	public void 헬스장음악() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\Alan Walker-01-Spectre (online-audio-converter.com).wav");
         
         
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
	public void 복권추첨() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\복권추첨.wav");
         
         
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
	
	public void 비오는소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\");
         
         
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
	
	public void 고기굽는소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\고기굽는소리.wav");
         
         
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
	public void 도박결과기다리는소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\도박결과기다리는소리.wav");
         
         
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
	

	public void 도박꽝소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\도박꽝소리.wav");
         
         
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
	
	
	public void 도박당첨소리() {
		File bgm;
		 AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;
         
         bgm = new File("C:\\music\\도박당첨소리1.wav");
         
         
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
	
	public void 돈버는소리() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\돈버는소리.wav");
        
        
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
	
	public void 사자소리() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\lion.wav");
        
        
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
	public void 설거지소리() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\설거지.wav");
        
        
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
	public void 양치질소리() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\양치질소리.wav");
        
        
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
	public void 헬스장등록음악() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\헬스장등록음악.wav");
        
        
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
	
	public void 감탄사() {
		File bgm;
		 AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:\\music\\감탄사.wav");
        
        
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
	@Override
	public void run() {
		//System.out.println("1차");
		if(쓰레드선택.equals("헬스장음악")) {
			//System.out.println("2차");
			헬스장음악();
			//System.out.println("3차");
			while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}
		}else if(쓰레드선택.equals("동전소리")) {
			돈버는소리();
		}else if(쓰레드선택.equals("사자소리")) {
			사자소리();
		}else if(쓰레드선택.equals("설거지소리")) {
			설거지소리();
			while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}//while
		}else if(쓰레드선택.equals("양치질소리")) {
			양치질소리();
			while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}//while
		}else if(쓰레드선택.equals("헬스장등록음악")) {
			헬스장등록음악();
			//왜냐하면 인터럽트는 쓰레드가 sleep상태여야 적용되기 떄문이다.
			while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}//while
		}else if(쓰레드선택.equals("도박결과기다리는소리")) {
			도박결과기다리는소리();
		}else if(쓰레드선택.equals("도박꽝소리")) {
			도박꽝소리();
	    }else if(쓰레드선택.equals("도박당첨소리")) {
	    	도박당첨소리();
	    }else if(쓰레드선택.equals("감탄사")) {
	    	감탄사();
	    }else if(쓰레드선택.equals("고기굽는소리")) {
	    	고기굽는소리();
	    	while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}//while
	    }else if(쓰레드선택.equals("비오는소리")) {
	    	비오는소리();
	    	while(true) {
				if(isInterrupted()) {
					clip.close();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}//while
	    }else if(쓰레드선택.equals("복권추첨")) {
	    	복권추첨();
	    }
	}
	
}
