package UniqueCouponCodeGenerator;

public class Coupon {

    private static int nextCode = 1011;
    private String code;
    private double discount;

    public Coupon( double discount) {
        this.code = "DISC" + nextCode;
        this.discount = discount;
    }

    public void displayCoupon(){

        System.out.println("Coupon Code: " + code + " | Discount: " + discount + "%");
    }


}
