package HashMap_Demo;

import java.util.HashMap;
import java.util.Map;

public class Demo {
public static void main(String[] args) {
	HashMap<Integer, String> ColorsMap =new HashMap<Integer, String>();
	System.out.println("Initial Map"+ColorsMap);
	ColorsMap.put(100, "Green");
	ColorsMap.put(101, "Blue");
	ColorsMap.put(102, "Yellow");
	//System.out.println("After adding elements:"+ColorsMap);
	
	for(Map.Entry m:ColorsMap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
