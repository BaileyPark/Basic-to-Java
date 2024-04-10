package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // super(); // 기존 생성자가 없으므로 컴파일 오류
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
