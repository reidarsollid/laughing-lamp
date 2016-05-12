package no.inmeta.domain;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        return balanse == account.balanse && customer.equals(account.customer);

    }

    @Override
    public int hashCode() {
        int result = customer.hashCode();
        result = 31 * result + balanse;
        return result;
    }

}
