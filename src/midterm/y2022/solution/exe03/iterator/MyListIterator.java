package midterm.y2022.solution.exe03.iterator;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
	private ArrayList<String> items;
	private int position;
 
	public MyListIterator(ArrayList<String> items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		String res = null;
		if (hasNext()) {
			res = items.get(position);
			position++;
		}
		return res;
	}
 
	public boolean hasNext() {
		return position < items.size();
	}
}
