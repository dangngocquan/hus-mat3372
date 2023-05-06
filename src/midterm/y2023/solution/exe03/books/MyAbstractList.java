package midterm.y2023.solution.exe03.books;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < size(); index++) {
            sb.append(String.format("[%s] ", get(index)));
        }
        if (sb.length() > 1) {
            sb.delete(sb.length()-1, sb.length());
        }
        return sb.toString();
    }
}
