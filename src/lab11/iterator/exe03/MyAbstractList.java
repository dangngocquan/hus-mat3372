package lab11.iterator.exe03;

public abstract class MyAbstractList implements MyList {
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
