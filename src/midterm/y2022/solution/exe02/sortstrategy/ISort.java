package midterm.y2022.solution.exe02.sortstrategy;

public interface ISort {

    // Phương thức sắp xếp dữ liệu data theo thứ tự tăng dần,
    // Đầu vào là mảng dữ liệu, đầu ra là số lần thực hiện đổi chỗ dữ liệu.
    public abstract int sort(int[] data);
}
