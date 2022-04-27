package week4_1;

public class account {
    private long id, balance;
    account(long id, long balance)
    {
        this.id=id;
        this.balance= balance;
    }

    public long getId()
    {
        return id;
    }
    public long getbalance()
    {
        return balance;
    }
    void withdraw(int ub)
    {
        balance = balance-ub;
    }
    void diposite(int ub)
    {
        balance = balance+ub;
    }
    void display()
    {
        System.out.println("Account Id: "+id + "Acount Balnace: "+balance);
    }


    public String toString()
    {
        String str = String.format("%d%d", getId(),getbalance());
        return str;
    }


}
