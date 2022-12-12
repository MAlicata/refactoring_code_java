package magicnumbers.bad;

public class Main {
    private static final double ENVIO_GRATIS = 0;
    private static final double DESCUENTO = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price){
        return price < 100 ? 4.99 : ENVIO_GRATIS; // hard coded
    }

    private static double calculateDiscount(double price){
        return price * DESCUENTO;
    }

}
