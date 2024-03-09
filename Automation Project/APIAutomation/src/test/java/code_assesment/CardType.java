package code_assesment;

public class CardType {

    public static final String PREMIUM = "Premium";
    public static final String MASTER = "Master";
    public static final String YOUTH = "Youth";

     public static void main(String[] args) {
         String cardType = "Master";

         switch (cardType) {
             case CardType.PREMIUM:
             case CardType.YOUTH:
                 System.out.println("Transaction not accepted");
                 break;
             case CardType.MASTER:
                 System.out.println("Transaction accepted");
                 break;
             default:
                 System.out.println("Invalid card type");
         }
     }
}
