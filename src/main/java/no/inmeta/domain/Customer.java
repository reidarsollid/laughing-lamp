package no.inmeta.domain;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Customer customer = (Customer) o;

        return accountId == customer.accountId && name.equals(customer.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + accountId;
        return result;
    }
}
