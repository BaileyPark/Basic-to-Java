package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // pravate 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {

        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minNum = values[0];
        for (int value : values) {
            if (minNum > value) minNum = value;
        }
        return minNum;
    }

    public static int max(int[] values) {
        int maxNum = values[0];
        for (int value : values) {
            if (maxNum < value) maxNum = value;
        }
        return maxNum;
    }
}
