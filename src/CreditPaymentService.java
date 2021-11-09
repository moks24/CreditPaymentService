public class CreditPaymentService {
    public int calculate (float creditAmount, float creditTerm){
        float percent = (float) 9.99;
        float IFTP = (percent/100)/12;
        //InterestForThePeriod = IFTP
        int payment;
        float anannuity;
        anannuity = (float) (IFTP * Math.pow((1 + IFTP), creditTerm) / (Math.pow((1 + IFTP), creditTerm) - 1));
        payment = (int) (creditAmount *anannuity);
        return payment;

    }
}
