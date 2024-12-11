package bookExercises;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Ex92methods {

	public void date(String a) {

		String[] days = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
				"eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth",
				"eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third",
				"twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth",
				"thirtieth", "thirty-first" };

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate date = LocalDate.parse(a, formatter);

		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();

		System.out.print(days[day - 1] + " of ");

		System.out.print(months[month - 1] + " "); 

		System.out.println(year);
	}
}
