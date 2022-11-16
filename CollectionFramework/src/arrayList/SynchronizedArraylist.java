package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArraylist {
	
	public static void main(String[] args) {
		
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		
		nameslist.add("java");
		nameslist.add("python");
		nameslist.add("ruby");
		
		//add remove - we dont need explicit synchronization
		
		//to fetch/traverse the value from this list -- we have to use synchronized
		synchronized(nameslist) {
			Iterator<String> itr = nameslist.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		//2. copyonwritearraylist -- its a class -- thread safe/synchronized
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("laxman");
		emplist.add("narendra");
		emplist.add("rajat");
		
		//wwe dont need explicit synchronization for any operation : add/remove/traverse
		Iterator<String> itr = emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
