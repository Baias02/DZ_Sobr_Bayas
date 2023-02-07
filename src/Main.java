import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {-1.2,2.3,-3.5,7.3,-21.2,11.4,23.6,-23.8,8.4,-3.34,18.5,91.2,-19.7,-9.1,11.2};
        Arrays.sort(arr);
        for (double row:arr) {
            System.out.print(row + ",");

        }
    }
}