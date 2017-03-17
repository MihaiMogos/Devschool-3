public enum ATM_StringConstants {

    HELLO("Welcome.Please insert account number and pin \n"),
    INVALID_USER("Incorrect account number or pin"),
    TRY_AGAIN("Try again with your account number and pin"),
    SHOW_OPTIONS("Please select a option:\n 1.View my balance\n 2.Deposit \n 3.Withdrawal \n 4. Exit\n"),
    DEPOSIT_VALUE("How much?"),
    WITHDRAWAL("Please select a value:\n 1. $20 \n 2. $40 \n 3. $60 \n 4. $100 \n 5. $200\n 6. Cancel transaction"),
    GOOD_BYE("Have a good day. Good bye!");

    private final String text;

    private ATM_StringConstants(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
