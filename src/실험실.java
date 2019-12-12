import java.util.ArrayList;
import java.util.HashMap;

public class 실험실 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String ,ArrayList>> hash = new HashMap();
		HashMap<String, ArrayList> hash_2 = new HashMap();
		ArrayList array = new ArrayList();
		array.add("array_one");
		array.add("array_two");
		array.add("array_three");
		array.add("array_fore");
		
		hash_2.put("2019-07-07", array);
		
		hash.put("사용자 아이디", hash_2);
	
		System.out.println(hash);
		
	
	}
		
	
}
