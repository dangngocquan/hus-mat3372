package midterm.y2022.solution.exe03.iterator;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {
		menuItems[numberOfItems] = name;
		numberOfItems++;
	}
 
	public String[] getMenuItems() {
		return this.menuItems;
	}
  
	public Iterator createIterator() {
		Iterator iterator = new MyArrayIterator(menuItems);
		return iterator;
	}
 
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (String element : menuItems) {
			sb.append(element).append(", ");
		}
		if (sb.length() > 1) {
			sb.delete(sb.length()-2, sb.length());
		}
		sb.append("]");
		return sb.toString();
	}
}
