package bookExercises;

import javax.swing.JOptionPane;

public class Ex92 {

	public static void main(String[] args) {

		Ex92methods ex = new Ex92methods();

		String userAnswer;

		String dateInput;

		do {

			dateInput = JOptionPane.showInputDialog(null, "Input date -> format dd/mm/yyyy");

			ex.date(dateInput);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "End of Application!");
	}

}
