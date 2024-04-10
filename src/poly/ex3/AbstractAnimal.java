package poly.ex3;

public abstract class AbstractAnimal {

    //오버라이딩 해야 되는 목적
    public abstract void sound();

    //상속받아서 사용하는 목적(반드시 오버라이딩하지 않아도 됨)
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
