public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        float payment = service.calculate(1_000_000, 12);
        System.out.println(payment);

        payment = service.calculate(1_000_000, 24);
        System.out.println(payment);

        payment = service.calculate(1_000_000, 36);
        System.out.println(payment);

    }
}