public class SavingAccount {
	private double savingsBalance;
	private static double annualInterestRate;

	public SavingAccount(double a) {
		savingsBalance = a;
	}

	static void modifyInterestRate(double interestRate) {
		annualInterestRate = interestRate;
	}

	public double calculateMonthlyInterest() {
		double a = savingsBalance + (savingsBalance * annualInterestRate / 12);
		return a;
	}

	public static void main(String args[]) {
		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);
		SavingAccount.modifyInterestRate(.04);

		System.out.println("Saver1 balance: "
				+ saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "
				+ saver2.calculateMonthlyInterest());

		SavingAccount.modifyInterestRate(.05);

		System.out.println("Saver1 balance: "
				+ saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "
				+ saver2.calculateMonthlyInterest());
	}
}