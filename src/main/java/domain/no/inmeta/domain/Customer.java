package domain.no.inmeta.domain;

public class Customer {
    private final String name;
    private final int accountId;

    public Customer(String name, int accountId) {
        this.name = name;
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public int getAccountId() {
        return accountId;
    }
}
