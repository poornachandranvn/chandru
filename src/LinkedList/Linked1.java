 package LinkedList;

import java.util.LinkedList;

public class Linked1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list4=new LinkedList<Integer>();
		list4.add(23);
		list4.addLast(379);
		list4.add(45);
		list4.addFirst(34);
		list4.add(3,59);
		System.out.println(list4);
		list4.removeLast();
		list4.remove(2);
		System.out.println(list4);
		System.out.println(list4.getFirst());
		list4.set(0,99); 
		System.out.println(list4);
		System.out.println(list4.isEmpty());
	}

}
