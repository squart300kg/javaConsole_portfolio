
public class 헬스장등록 {
	
	String 이름;
	int 등록기간;
	boolean 체육복여부;
	int 체육복가격;
	boolean 락커여부;
	int 락커가격;
	int 가격 = 0;
	홍길동 홍길동;
	
	헬스장등록(){}
	
	헬스장등록(홍길동 홍길동){
		this.홍길동 = 홍길동;
	}
	//헬스장에 오면 가장 처음으로 등록기간을 먼저 생각하므로 먼저 호출
	void 등록기간설정(int 등록기간) {
		 this.등록기간 = 등록기간;
		 if(등록기간 >= 1 && 등록기간 < 7) {
				가격 = 10000 * 등록기간;
			}else if(등록기간 >= 7 && 등록기간 < 30) {
				가격 = 50000 + 10000 * (등록기간 - 3);
			}else if(등록기간 >= 30) {
				가격 = 200000 + 10000 * (등록기간 - 30);
			}else if(등록기간 == 12){
				가격 = 600000;
			}
	}
	void 체육복여부설정(String 체육복여부) {
		if(체육복여부.equalsIgnoreCase("Y")) {
			this.체육복여부 = true;
			체육복가격 = 5000 * 등록기간;
		}else if(체육복여부.equalsIgnoreCase("N")) {
			this.체육복여부 = false;
		}
	}
	void 락커여부설정(String 락커여부설정) {
		if(락커여부설정.equalsIgnoreCase("Y")) {
			this.락커여부 = true;
			락커가격 = 5000 * 등록기간;
		}else if(락커여부설정.equalsIgnoreCase("N")) {
			this.락커여부 = false;
		}
	}
	void 헬스장가격표() {
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
		System.out.println("====================================================");
		System.out.println("| 헬스장을 등록하러 온 길동이. 기분이 너무 좋아 흥이 절로 난다~     |");
		System.out.println("====================================================");
		System.out.println("=========================가격표======================");
		System.out.println("|               헬스 1일 이용   : 10,000원                         |");
		System.out.println("|               헬스 7일 이용   : 50,000원                         |");
		System.out.println("|               헬스 30일 이용 : 200,000원                       |");
		System.out.println("|             락커         :   5,000원   per Day         |");		
		System.out.println("|             체육복      :   5,000원   per Day         |");	
		System.out.println("|                                                 |");
		System.out.println("|           기간, 락카, 체육복 여부를 선택해 주세요                 |");
		System.out.println("====================================================");
	}
	
	public void 헬스장입장() {
		System.out.println("====================================================");
		System.out.println("|                      헬스장에 갔다                                  |");
		System.out.println("====================================================");
	}
	int 헬스장총견적() {
		return 가격+락커가격+체육복가격;
	}
	
	void 헬스장영수증() {
		System.out.println("========================영수증====================");
		System.out.println("|                    헬스 "+등록기간+"일 : "+가격+"원                         |");
		System.out.println("|               락커 "+등록기간+"일       :    "+락커가격+"원                         |");		
		System.out.println("|               체육복 "+등록기간+"일       :  "+체육복가격+"원                          |");		
		System.out.println("|               총 견적       : "+(가격+락커가격+체육복가격)+"원                                 |");		
		System.out.println("====================================================");
	}
	
	void 체육복만구매(홍길동 홍길동) {
		체육복여부설정("Y");
		System.out.println("[ 옷을 찢겨 결국.. 헬스장에서 체육복을 결제하고 말았다.. T.T ]");
		System.out.println("====================================================");
		System.out.println("|                 체육복 "+등록기간+"개월 : "+체육복가격+"원                                    |");
		System.out.println("====================================================");
		홍길동.지출(체육복가격);
		홍길동.길동이의보유머니();
	}
}
