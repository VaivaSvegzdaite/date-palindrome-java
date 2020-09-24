
public class DatePalindrome {

	public static void main(String[] args) {
		printBonusDatesBetween(2010, 2015);

	}

	public static void printBonusDatesBetween(int fromYear, int toYear) {

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int year = fromYear; year <= toYear; year++) {
			String yyyy = Integer.toString(year);
			String mm = Integer.toString(year % 10) + Integer.toString((year / 10) % 10);
			String dd = Integer.toString((year / 100) % 10) + Integer.toString((year / 1000) % 10);
			int month = Integer.parseInt(mm);
			int day = Integer.parseInt(dd);

			if (month > 0 && month < 13) {
				if (day > 0 && day <= daysInMonth[month - 1]) {
					if (month == 2) {
						if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
							daysInMonth[1] = 29;
						} else {
							daysInMonth[1] = 28;
						}
					}
					System.out.println(yyyy + "-" + mm + "-" + dd);
				}

			}
		}
	}
}
