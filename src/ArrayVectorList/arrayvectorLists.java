package ArrayVectorList;

import java.util.ArrayList;
import java.util.Vector;

public class arrayvectorLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> list1=new Vector<Double>();       //non genertic
		
		ArrayList<Double> list2=new ArrayList<Double>();  //genertic
		
		list1.add(4.2);
		list1.add(11.4);
		
		list2.add(22.2);
		list2.add(45.5);
		
		System.out.println(list2+"arraylist");
		System.out.println("vector:"+list1);;
		
		list1.remove(1);
		System.out.println("original display:"+list1);
		
		list1.removeAll(list1);
		System.out.println(list1);
		
		
		
		
		
		
		

	}

}
