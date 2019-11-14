package question1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	private List<String> list = new LinkedList<String>();

	public LinkedListOperations() {
		super();
	}

	public LinkedListOperations(LinkedList<String> list) {
		super();
		this.list = list;
	}

	public void addElements(String... strings) {

//		 for(String s:strings)
//		 list.add(s);

		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
		}
	}

	public void addElementsusingArr(String[] strings) {

		 for(String s:strings)
		 list.add(s);
	}
	public void listiterateforeach() {

		for (String s : list)
			System.out.print(" " + s);
		System.out.println();

	}

	public void iterateListUsingIterator() {

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
	}

	public void revLinkedList() {
		LinkedList<String> list1 = new LinkedList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			list1.add(this.list.get(i));

			// System.out.println(list1.get(i));
		}
		list.removeAll(list1);
		list.addAll(list1);

	}

	public void copyLinkList(LinkedList<String> list) {

		// this.list.addAll(list);
		for (int i = 0; i < list.size(); i++) {
			this.list.add(list.get(i));
		}

		for (String s : list)
			this.list.add(s);

		Iterator<String> i = list.iterator();
		while (i.hasNext())
			this.list.add(i.next());

	}

}
