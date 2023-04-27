package midterm.y2022.solution.exe03.iterator;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		String res = null;
		if (hasNext()) {
			res = items[position];
			position++;
		}
		return res;
	}
 
	public boolean hasNext() {
		return position < items.length;
	}
}
