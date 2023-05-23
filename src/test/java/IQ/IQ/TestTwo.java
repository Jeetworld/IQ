package IQ.IQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestTwo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Maruti", "Baleno");
		map.put("Totyota", "fort");
		map.put("Hyundai", "i20");
		map.put("Mahindra", "THar");
		
//		for(Map.Entry m: map.entrySet()) {
//			System.out.println("Brand Name "+m.getKey()+" car name "+m.getValue());
//		}
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println("Key is "+m.getKey()+" Value is:: "+m.getValue());
		}
	
	}

}
