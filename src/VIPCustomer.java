public class VIPCustomer {
    private String name;
    private double credit_limit;
    private String email;

    public VIPCustomer() {
        this("Nathan", 5000, "njds1676@gmail.com");
    }
// empty constructor ^ (has no parameters)

    public VIPCustomer(String name, double credit_limit) {
        this(name, credit_limit, "email@email.com");
    }
// has two parameters ^ (3rd parameter is set with this())

    public VIPCustomer(String name, double credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
// has three parameters, saves values into fields
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
