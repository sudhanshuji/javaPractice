/**
 * 
 */
package question1;

import java.util.LinkedList;

import entity.Student;

/**
 * @author Golu
 * 
 *         This class demonstrates various operations of list on objects
 *
 */
public class LinkedListObject {

	private LinkedList<Student> list = new LinkedList<Student>();

	/**
	 * 
	 */
	public LinkedListObject() {
		// TODO Auto-generated constructor stub
	}

	public LinkedListObject(LinkedList<Student> list) {
		super();
		this.list = list;
	}

	public void adddetails(Student... students) {
		for (Student s : students)
			this.list.add(s);

	}
	
	public void addElementsusingArr(Student[] students) {
		for (Student s : students)
			this.list.add(s);
	}

	public void listIterateForEach() {
		for (Student s : list) {
			System.out.println(s.getName() + " " + s.getDateOfBirth() + " " + s.getYear() + " " + s.getDept().getDept()
					+ " " + s.getDept().getHod());
		}
	}

	public void revStudentlist() {
		LinkedList<Student> list1 = new LinkedList<Student>();
		for (int i = list.size() - 1; i >= 0; i--)
			list1.add(this.list.get(i));
		list.removeAll(list1);
		list.addAll(list1);
		//System.out.println(list.toString());
		for (Student st : list) {
			System.out.println(st.toString());
	}

	}
}
