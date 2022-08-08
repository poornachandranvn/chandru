 package MAP;

import java.util.Hashtable;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> channel =new Hashtable<String, Integer>();
		channel.put("poorna",1234);
		channel.put("chadran",4567);
		channel.put("Pavithra",9897);
		System.out.println(channel);
		channel.remove("pavithra");
		System.out.println(channel);
		System.out.println(channel.contains("poorna"));
		System.out.println(9897);
		
		

	}

}
