package poly.ex.pay2;

public abstract class PayOption {

    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else {
            return new DefaultPay();
        }
    }
}
