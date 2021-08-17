package jvprj;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customeName;
    private String email;
    private String phone;

    public void withdrawn( double amount ) {
        if ( this.balance < amount ) {
            System.out.println("Không thể rút được " + amount);
            System.out.println("Bạn chỉ được rút tối đa " + this.balance);
            System.out.println("-----------------------------------------------------");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Rút tiền thành công, số lượng: " + amount);
            System.out.println("Số dư tài khoản hiện tại là: " + this.balance);
            System.out.println("-----------------------------------------------------");
        }
    }

    public void deposit( double amount ) {
        this.balance += amount;
        System.out.println("Bạn đã gửi tiền thành công! " + amount);
        System.out.println("Số dư hiện tại: " + this.balance);
        System.out.println("-----------------------------------------------------");
    }

    public BankAccount( String accountNumber, double balance, String customeName, String email, String phone ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customeName = customeName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount( String s ) {
        //Hàm contructer mặc định
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber( String accountNumber ) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance( double balance ) {
        this.balance = balance;
    }

    public String getCustomeName() {
        return customeName;
    }

    public void setCustomeName( String customeName ) {
        this.customeName = customeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }
}
