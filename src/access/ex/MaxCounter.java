package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증부
        if (maxValid(count)) {
            System.out.println("더 이상 올릴 수 없습니다.");
            return;
        }

        // 실행부
        count++;
    }

    private boolean maxValid(int count) {
        return count >= max;
    }

    public int getCount() {
        return count;
    }
}
