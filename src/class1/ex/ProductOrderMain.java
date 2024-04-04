package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder dubu = new ProductOrder();
        ProductOrder kimchi = new ProductOrder();
        ProductOrder cola = new ProductOrder();

        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] orders = {dubu, kimchi, cola};

        int totalPrice = 0;
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
            totalPrice += o.price * o.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
