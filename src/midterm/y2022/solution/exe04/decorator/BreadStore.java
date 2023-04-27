package midterm.y2022.solution.exe04.decorator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		// 5 ThickCrustBread cheese
		for (int count = 0; count < 5; count++) {
			Bread thickCrustBread = new ThickcrustBread();
			Cheese thickCrustBreadCheese = new Cheese(thickCrustBread);
			add(thickCrustBreadCheese);
		}

		// 5 ThickCrustBread olives
		for (int count = 0; count < 5; count++) {
			Bread thickCrustBread = new ThickcrustBread();
			Olives thickCrustBreadOlives = new Olives(thickCrustBread);
			add(thickCrustBreadOlives);
		}

		// 5 ThickCrustBread cheese olives
		for (int count = 0; count < 5; count++) {
			Bread thickCrustBread = new ThickcrustBread();
			Cheese thickCrustBreadCheese = new Cheese(thickCrustBread);
			Olives thickCrustBreadCheeseOlives = new Olives(thickCrustBreadCheese);
			add(thickCrustBreadCheeseOlives);
		}

		// 5 ThinCrustBread cheese
		for (int count = 0; count < 5; count++) {
			Bread thinCrustBread = new ThincrustBread();
			Cheese thinCrustBreadCheese = new Cheese(thinCrustBread);
			add(thinCrustBreadCheese);
		}

		// 5 ThinCrustBread olives
		for (int count = 0; count < 5; count++) {
			Bread thinCrustBread = new ThincrustBread();
			Olives thinCrustBreadOlives = new Olives(thinCrustBread);
			add(thinCrustBreadOlives);
		}

		// 5 ThinCrustBread cheese olives
		for (int count = 0; count < 5; count++) {
			Bread thinCrustBread = new ThincrustBread();
			Cheese thinCrustBreadCheese = new Cheese(thinCrustBread);
			Olives thinCrustBreadCheeseOlives = new Olives(thinCrustBreadCheese);
			add(thinCrustBreadCheeseOlives);
		}

	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		for (Bread bread0 : breads) {
			if (Double.compare(bread.cost(), bread0.cost()) == 0) {
				breads.remove(bread0);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		printListBread(breads);
	}

	public void printListBread(List<Bread> list) {
		System.out.println("[");
		for (Bread bread : list) {
			System.out.println("\t" + bread.getDescription());
		}
		System.out.println("]");
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> list = new LinkedList<>(breads);
		for (int index = 1; index < list.size() - 1; index++) {
			int tempIndex = index;
			while (tempIndex > 0 &&
					(order? list.get(index-1).cost() > list.get(index).cost()
							: list.get(index-1).cost() < list.get(index).cost())) {
				// Swap
				Bread bread = list.get(index-1);
				list.set(index-1, list.get(index));
				list.set(index, bread);
			}
		}
		return list;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		List<Bread> list = sort(order);
		return list.subList(0, Math.min(howMany, breads.size()));
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		System.out.println("Init");
		breadStore.print();

		System.out.println("\nAdd some breads:");
		breadStore.add(new ThickcrustBread());
		breadStore.add(new ThincrustBread());
		breadStore.print();

		System.out.println("\nSell some breads: ");
		breadStore.sell(new ThincrustBread());
		breadStore.sell(new ThincrustBread());
		breadStore.printListBread(breadStore.sort(true));

		System.out.println("\n10 breads (or less) has min cost: ");
		breadStore.printListBread(breadStore.filter(10, true));

	}
}
