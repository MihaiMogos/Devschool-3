public enum TransactionType {
    VIEW_BALANCE(1),
    DEPOSIT(2),
    WITHDRAWAL(3);

    private final int id;

    private TransactionType(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public TransactionType getTransactionId(int id) {
        switch (id){
            case 1:
                return VIEW_BALANCE;
            case 2:
                return DEPOSIT;
            case 3:
                return WITHDRAWAL;
            default:
                return null;
        }
    }
}
