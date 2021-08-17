package jvprj;

public class JvPrj {

    public static void main( String args[] ) {
        BankAccount abcAccount = new BankAccount("0123456789", 50.0, "Nguyễn abc", "abc@gmail.com", "987654321");
        System.out.println("THÔNG TIN ACCOUNT");
        System.out.println("Số TK: " + abcAccount.getAccountNumber());
        System.out.println("Tên chủ TK: " + abcAccount.getCustomeName());
        System.out.println("============================================");
        abcAccount.withdrawn(100.0);
        abcAccount.deposit(200.0);
        abcAccount.withdrawn(210);
    }

}

/*
run:
THÔNG TIN ACCOUNT
Số TK: 0123456789
Tên chủ TK: Nguyễn abc
============================================
Không thể rút được 100.0
Bạn chỉ được rút tối đa 50.0
-----------------------------------------------------
Bạn đã gửi tiền thành công! 200.0
Số dư hiện tại: 250.0
-----------------------------------------------------
Rút tiền thành công, số lượng: 210.0
Số dư tài khoản hiện tại là: 40.0
-----------------------------------------------------
*/
