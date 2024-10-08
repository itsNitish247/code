	package hasMapMethods;
	
	import java.util.HashMap;
	
	public class JavaHashMap_compute {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		map.put("Nitish", 2);
		map.put("Kumar", 1);
		map.put("Nitish", 3);
		
		System.out.println("before compute()" + map);
		
		
		//multiplying by 10
		map.compute("Nitish",(key,value) -> value*10);
		map.compute("Kumar",(key,value)-> value*10);
		
		//add a new element
		map.compute("demigod" ,  (key ,value)-> value == null ? 4 : value);
		
		
		System.out.println("after compute() "+ map);
	
		
		}
	}
	
//=============
//compute()
//=============
//	it is basically an lambda function 
