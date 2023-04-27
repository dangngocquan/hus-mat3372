package midterm.y2022.solution.exe01;

public class MyMath {
    public MyMath() {

    }

    public static double cos(double x) {
        // cos(y) == cos(x) and y in [0, 2pi]
        double y = x;
        while (y > Math.PI * 2) {
            y -= Math.PI * 2;
        }
        while (y < 0) {
            y += Math.PI * 2;
        }

        // Calculate cos(y)
        double res = 1;
        double tempValue = 1;
        for (int i = 2; i < 40; i += 2) {
            tempValue = tempValue * (-1) * y * y / (i * (i-1));
            res += tempValue;
        }
        return res;
    }

    public static String decimalTo(String number, int outRadix) {
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7',
                        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String res = "";
        int decimalNum = Integer.parseInt(number);
        while (decimalNum > 0) {
            res = chars[decimalNum % outRadix] + res;
            decimalNum /= outRadix;
        }
        return res;
    }

    public static double exp(double x) {
        double res = 1;
        double tempValue = 1;
        for (int i = 1; i < 40; i++) {
            tempValue *= x / i;
            res += tempValue;
        }
        return res;
    }

    public static String toDecimal(String number, int inRadix) {
        String chars = "0123456789ABCDEF";
        number = number.toUpperCase();
        int decimalNum = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            decimalNum = decimalNum * inRadix + chars.indexOf(c);
        }
        return decimalNum + "";
    }

    public static String toRadix(String number, int inRadix, int outRadix) {
        String decimalNum = toDecimal(number, inRadix);
        return decimalTo(decimalNum, outRadix);
    }

    public static void main(String[] args) {
        System.out.println(exp(2.2) * cos(3.3));
        System.out.println(
                toRadix("123456789123456789", 13, 8));
        // Use Java library
        System.out.println(Math.exp(2.2) * Math.cos(3.3));
    }
}
