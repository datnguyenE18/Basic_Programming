public class source {
	public static void main( String arg[] ) {
		BankAccount abcAccount = new BankAccount("0123456789", 50.0, "Nguyễn abc", "abc@gmil.com","987654321");
		System.out.println("THÔNG TIN ACCOUNT");
		System.out.println("Số TK: " + abcAccount.getAccountNumber());
		System.out.println("Tên chủ TK: " + abcAccount.getCustomeName());
		System.out.println("============================================");
		abcAccount.withdrawn(100.0);
		abcAccount.deposit(200.0);
		abcAccount.withdrawn(210);
	}
}
