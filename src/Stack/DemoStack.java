     package Stack;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack hai=new Stack();//generic
		hai.push("Poornachandran");
		hai.push('A');
		hai.push(9585469110L);
		hai.push(10);
		hai.push(true);
		hai.push(7.9);
		hai.push("Poornachandran");
		System.out.println(hai);
		
		Iterator as=hai.iterator();
		while(as.hasNext())//bollean true OR flase
		{
			System.out.println(as.next());// one by one element iterator
		}
		System.out.println("search" +hai.search("Poornachandran"));
		System.out.println("To empty"+hai.empty());
		System.out.println("Top Element"+hai.peek());
		System.out.println("poping:"+hai.pop());
		System.out.println(hai);
			
		

	}

}
