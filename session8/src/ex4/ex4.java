package ex4;

public class ex4 {
    public static void main(String[] args){
        BankAccount accA = new BankAccount("A01","nguyen van a","0123456");
        BankAccount accB = new BankAccount("A02","nguyen van b","09090909");

        accA.deposit(1000);

        accA.withdraw(300);
        accB.deposit(300);

        accA.getBalance();
        accB.getBalance();
    }
}
