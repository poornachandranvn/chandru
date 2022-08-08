package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class setlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> hash=new HashSet<Character>();
	TreeSet<Character> tree=new TreeSet<Character>();
		hash.add('A');
		hash.add('B');
		hash.add('C');
		hash.add('D');
		hash.add('E');
		hash.add('F');
		hash.add('G');
		System.out.println(hash);
		
//		Iterator it=hash.iterator();
//		
//		while(it.hasNext());
//		{
//			System.out.println(it.next());
//		}
		tree.addAll(hash);
		tree.add('Z');
		System.out.println(tree+"This values is treeset value");
		hash.remove('A');
		System.out.println("remove the particular item,show only way of item"+hash);
		System.out.println(tree.contains('M'));
		tree.retainAll(hash);
		System.out.println(tree);
		System.out.println(hash);
	}
}
