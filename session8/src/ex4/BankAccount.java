package ex4;

public class BankAccount implements IBank{
    private String accId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount(String accId, String userName, String phoneNumber) {
        this.accId = accId;
        this.balance = 0.0;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.println("da rut tien: "+amount);
        }
        else System.out.println("so du tai khoan khong du");
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("da nhan tien: "+amount);
    }

    public void getBalance(){
        System.out.println("so du tai khoan: "+ balance);
    }

    public String getAccId(){
        return accId;
    }
}
