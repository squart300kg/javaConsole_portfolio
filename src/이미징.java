import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 이미징 extends JFrame {

	String 이미지이름 = null;
	Image img = null;
	
	public static void main(String[] args) {}
	이미징(String 이미지){
		this.이미지이름 = 이미지;
	}
	
	이미징(){}
	
	void 이미지() {
		
		if(이미지이름.equals("스쿼트")) {
			try {
				File file = new File("C:\\image\\squart2.jpg");
				img = ImageIO.read(file);
			}catch(IOException e) {
				System.out.println("이미지 파일이 없습니다");
			}
			init();
			
			setTitle("스쿼트");
			setSize(500, 500);
			setLocation(800,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(true);
			
			try {
				Thread.sleep(2000);
				setVisible(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(이미지이름.equals("데드리프트")) {
			try {
				File file = new File("C:\\image\\deadlift2.jpg");
				img = ImageIO.read(file);
			}catch(IOException e) {
				System.out.println("이미지 파일이 없습니다");
			}
			init();
			
			setTitle("데드리프트");
			setSize(500, 500);
			setLocation(800,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(true);
			
			try {
				Thread.sleep(2000);
				setVisible(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(이미지이름.equals("벤치프레스")) {
			try {
				File file = new File("C:\\image\\benchpress.jpg");
				img = ImageIO.read(file);
			}catch(IOException e) {
				System.out.println("이미지 파일이 없습니다");
			}
			init();
			
			setTitle("벤치프레스");
			setSize(500, 500);
			setLocation(800,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(true);
			
			try {
				Thread.sleep(2000);
				setVisible(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(이미지이름.equals("단속반")) {
			try {
				File file = new File("C:\\image\\단속반.jpg");
				img = ImageIO.read(file);
			}catch(IOException e) {
				System.out.println("이미지 파일이 없습니다");
			}
			init();
			
			setTitle("벤치프레스");
			setSize(500, 500);setLocation(1000,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(true);
			
			try {
				Thread.sleep(2000);
				setVisible(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void init() {
		
		JLabel label = new JLabel(new ImageIcon(img));
		
		add(label);
	}
}
