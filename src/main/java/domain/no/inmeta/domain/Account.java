package domain.no.inmeta.domain;

public class Account {
    private final Customer customer;
    private final int balanse;

    public Account(Customer customer, int balance) {
        this.customer = customer;
        this.balanse = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance() {
        return balanse;
    }
}
