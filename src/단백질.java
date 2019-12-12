import java.util.HashMap;

public class 단백질 extends Thread{
	int 닭가슴살재고수량;//5 ~ 10 개 사이
	int 프로틴재고수량;//5 ~ 10 개 사이
	int 세트메뉴재고수량;
	
	int 가격;
	int 갯수;
	int 상품번호;
	//HP회복량과 삼대운동증가량 두가지 Key와 Value로 담을 변수
	HashMap<String, Integer> 회복량 = new HashMap();
	
	@Override
	public void run() {
		
	}
	
	
	//닭가슴살의 구매과정은 
		//처음으로 갯수를 선택 후,
		//구매를 한다.
	
	void 상품선택(int 상품번호) {
		if(상품번호 == 1) {
			this.상품번호 = 상품번호;
			가격 = 3000;
		}else if(상품번호 == 2) {
			this.상품번호 = 상품번호;
			가격 = 3000;
		}else if(상품번호 == 3) {
			this.상품번호 = 상품번호;
			가격 = 5000;
		}else {
			System.out.println("올바른 값을 입력해 주세여");
		}
	}
		
		//구매를 하면 가격이 반환되어서 '홍길동'객체의 보유금액 매개변수가
		//이를 뺴는 구조이다.
	void 갯수선택(int 갯수) {
		
		회복량.put("삼대운동증가량", 1 * 갯수);
		회복량.put("HP회복량", 10 * 갯수);
		this.갯수 = 갯수;
	}
	int 구매하기() {
		return 갯수 * 가격;
	}
	void 구매에따른능력치증가량(홍길동 홍길동) {
		System.out.println("[ 여윽시 단백질을 먹으니 기운으 뽀충된 느낌이다. ]");
		홍길동.스쿼트1RM += 회복량.get("삼대운동증가량");
		홍길동.삼대중량 += 회복량.get("삼대운동증가량");
		홍길동.HP += 회복량.get("HP회복량");
		if(홍길동.HP > 1000)홍길동.HP = 1000;
		System.out.println("====================================================");
		System.out.println("|                    삼대운동 증가량 : +"+회복량.get("삼대운동증가량")+"                |");
		System.out.println("|                    HP 증가량        : +"+회복량.get("HP회복량")+"              |");
		System.out.println("|                                                 |");
		System.out.println("|                    길동이의 HP : "+홍길동.HP+"               |");
		System.out.println("|                    길동이의 3대중량 : "+홍길동.삼대중량+"            |");
		System.out.println("====================================================");
		
	}
	static void 단백질리스트() {
		System.out.println("┌───────────────────────메뉴 선택─────────────────────┐");
		System.out.println("│                HP 10회복, 3대운동 1 증가(1개당)         ");
		System.out.println("│              1. 닭가슴살        : 3,000 원                          ");
		System.out.println("│              2. 보충제  : 3,000원                                    ");
		System.out.println("│                                                  ");
		System.out.println("│                  ***두개 구매시 세일!***              ");
		System.out.println("│              3. 닭가슴살 + 보충제 : 5,000원                      ");
		System.out.println("│              4. 우산    :  5,000원                      ");
		System.out.println("│              5. 나가기");
		System.out.println("└───────────────────────────────────────────────────┘");
	}
}
