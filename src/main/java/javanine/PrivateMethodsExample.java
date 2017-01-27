package javanine;

public interface PrivateMethodsExample {

    private Long getCardId(){
        return 1L;
    }

    private static String getCardName(){
        return "name";
    }

    default void cardInfo() {
        System.out.println("Card ID: " + getCardId() + ", Card Name: " + getCardName());
    }
}
