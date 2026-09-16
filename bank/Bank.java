package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getters & Setters
    public String getPassword() {
        setPassword(randomPass);
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {

        Account account1 = new Account();

        account1.name = "SBI";
        account1.email = "sbi011@gmail.com";

        // Cannot access private variable directly
        // account1.password = "abcd";

        // Use setter instead
        account1.setPassword("abcd");

        System.out.println(account1.name);
        System.out.println(account1.email);
        System.out.println(account1.getPassword());
    }
}

