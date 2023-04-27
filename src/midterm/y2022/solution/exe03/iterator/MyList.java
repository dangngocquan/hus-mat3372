package midterm.y2022.solution.exe03.iterator;

import java.util.ArrayList;

public class MyList implements MyIterable {
	private ArrayList<String> menuItems;
 
	public MyList() {
		menuItems = new ArrayList<String>();
	}

	public void addItem(String name) {
		menuItems.add(name);
	}
 
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		Iterator iterator = new MyListIterator(menuItems);
		return iterator;
	}
  
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (String element : menuItems) {
			sb.append(element).append(", ");
		}
		if (sb.length() > 1) {
			sb.delete(sb.length()-2, sb.length());
		}
		sb.append("}");
		return sb.toString();
	}
}
