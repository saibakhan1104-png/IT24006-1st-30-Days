Date:20=04=2026
Day:2
Video number:4
Video Link: https://youtu.be/HZUUYnIZO_0?si=_NVivki_f3S8cnsc
Topic:Using Encapsulation in JAVA.

Example-1: Encapsulation.java
   class Encapsulation {
     private String name;
     private String id;
       public void setName(String name) {
         this.name = name;
     }
       public String getName() {
         return name;
     }
    public void setID(String id) {
         this.id = id;
     }
   public String getID() {
         return id;
     }
 }

//MainEncap.java 
public class MainEncap {
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation();
        student.setName("Saiba Khan");
        student.setID("06");
       System.out.println(student.getName());
        System.out.println(student.getID());
    }

}



Example-2: BankAccount.java
 class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    public void setAccountHolderName(String accountHolderName) {
         this.accountHolderName = accountHolderName;
     }

   public String getAccountHolderName() {
         return accountHolderName;
     }
     public void setAccountNumber(String accountNumber){
         this.accountNumber=accountNumber;
     }

   public String getAccountNumber() {
         return accountNumber;
     }
     public void deposit(double amount){
         if (amount>0) {
             balance = balance + amount;
         }
            else
             {
                 System.out.println("No Deposit");
             }
         }
     public void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
         } else {
             System.out.println("Insufficient Balance");
         }
     }
     public double getBalance() {
         return balance;
     }
}

//MainAccount.java
public class MainAccount {
    public static void main(String[] args) {
        BankAccount Account = new BankAccount();
        Account.setAccountHolderName("Saiba Khan");
        Account.setAccountNumber("9328423742478");
        System.out.println(Account.getAccountHolderName());
        System.out.println(Account.getAccountNumber());
         Account.deposit(10000);
        Account.withdraw(450);
        System.out.println("Balance: " + Account.getBalance());
    }
}
