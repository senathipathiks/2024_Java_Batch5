package ExceptionHandling;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


		public class Sample4 {
		    public static boolean isValidFormat(String format, String value) {
		        SimpleDateFormat formatter = new SimpleDateFormat(format);
		        formatter.setLenient(false); // Disable lenient parsing

		        try {
		            Date date = formatter.parse(value);
		            return true; // Valid date format
		        } catch (ParseException e) {
		            return false; // Invalid date format
		        }
		    }

		    public static boolean isValidDayMonthRange(String value) {
		        String[] parts = value.split("/");
		        if (parts.length != 3) {
		            return false; // Invalid format
		        }

		        int day = Integer.parseInt(parts[0]);
		        int month = Integer.parseInt(parts[1]);

		        if (month < 1 || month > 12) {
		            return false; // Invalid month
		        }

		        // Check day based on month
		        switch (month) {
		            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		                return day >= 1 && day <= 31;
		            case 4: case 6: case 9: case 11:
		                return day >= 1 && day <= 30;
		            case 2:
		                // Leap year handling omitted for simplicity
		                return day >= 1 && day <= 28;
		            default:
		                return false; // Invalid month
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a date in the format dd/mm/yyyy: ");
		        String inputDate = scanner.nextLine();

		        boolean isValidFormat = isValidFormat("dd/MM/yyyy", inputDate);
		        boolean isValidDayMonthRange = isValidDayMonthRange(inputDate);

		        if (isValidFormat && isValidDayMonthRange) {
		            System.out.println("Valid date format and within valid day/month range: " + inputDate);
		        } else {
		            System.out.println("Invalid date format or out of valid day/month range: " + inputDate);
		        }

		        scanner.close();
		    }
		

	}


