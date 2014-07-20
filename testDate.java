public class testDate {
	public static void main(String[] args) {
		Date date = new Date(12, 25, 2014);
		System.out.println(date);
		for (int i = 0; i < 10; i++) {
			date.nextDay();
			date.toString();
			System.out.println(date);
		}
	}
}