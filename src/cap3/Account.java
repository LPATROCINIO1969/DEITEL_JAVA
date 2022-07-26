package cap3;

public class Account {
    private String name;
    private double balance;


    public Account(String name, double balance)
    {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double valor){
        if (valor > 0.0)
            this.balance += valor;
    }

    public double getBalance() {
        return balance;
    }



}
