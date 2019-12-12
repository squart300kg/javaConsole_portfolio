import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class 복권 extends 돈구하기종류 {
	int 가격 = 1000;
	int 갯수;
	//ArrayList<int []> 복권저장소 = new ArrayList<int []>(갯수);
	int 복권한장[][];
	String 복권한장_test[] = null;
	int 복권갯수인덱스 = 0;
	int 구매일=0;
	int 추첨일=0;
	int 당첨번호[];
	Scanner 스캐너 = new Scanner(System.in);
	
	//몇개의 복권을 구입한지 입력
	
	public void 갯수입력(int 갯수) {
		this.갯수 = 갯수;
		복권한장 = new int[갯수][6];
		for(int row = 1 ; row <= 갯수 ; row ++) {
			for(int col = 1 ; col <= 6 ; col ++) {
				복권한장[row - 1][col - 1] = 0;
			}
		}
	}
	//복권번호를 입력. 이때, 구입개수만큼만 입력한다. 한번 입력할때마다 메소드를 새로 만들어 시행한다.
	void 복권번호입력() {
		for(int row = 1 ; row <= 갯수 ; row ++) {
			System.out.printf("[ %d번째 복권 ] : ", row);
			복권한장_test = 스캐너.nextLine().split(",");
			for(int col = 1 ; col <= 6 ; col ++) {
				복권한장[row - 1][col - 1] = Integer.parseInt(복권한장_test[col - 1]);
			}
		}
		
		
	}
	//복권 한개의 금액 출력
	int 복권금액() {
		return 가격;
	}
	//내가 구입한 복권이 당첨됐는지 확인. 당첨금을 반환
	void 복권추첨() {
		if(갯수 == 0) {
			System.out.println("복권을 구입해 주세요");
		}
		int 맞은번호갯수 = 0;
		당첨번호 = new int[6];
		//당첨번호 초기화
		for(int row = 1 ; row <= 6 ; row ++	) {
			당첨번호[row - 1] = (int) (Math.random() * 45 + 1);
			for(int col = 1 ; col <= row - 1 ; col ++) {
				if(당첨번호[row - 1] == 당첨번호[col - 1]) {
					당첨번호[row - 1] = (int) (Math.random() * 45 + 1);
					col = 0;
				}
			}
		}//당첨번호 초기화
		Arrays.sort(당첨번호);//당첨번호 정렬
		
		//당첨번호와 내가 기재한 번호를 비교하여 당첨금액 초기화
		for(int row = 1 ; row <= 갯수 ; row ++) {//구입한 복권 갯수만큼 반복
			for(int col = 1 ; col <= 6 ; col ++) {//개별적인 복권 당첨 비교
				if(복권한장[row - 1][col - 1] == 당첨번호[col - 1]) {
					맞은번호갯수++;
				}
			}
			if(맞은번호갯수 >= 3) {
				수익금 += 5000;
			}
			if(맞은번호갯수 >= 4) {
				수익금 += 50000;
			}
			if(맞은번호갯수 >= 5) {
				수익금 += 1500000;
			}
			if(맞은번호갯수 >= 6) {
				수익금 += 2000000000;
			}else {
				수익금 += 0;
			}
			맞은번호갯수 = 0;
		}
		//복권저장소.clear();
	}
	int 당첨금액() {
		return 수익금;
	}
}
