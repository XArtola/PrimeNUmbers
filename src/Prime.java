
/**
 * 
 */
import java.util.Scanner;

/**
 * @author ik013043z1
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean finish = false;
		while (!finish) {

			System.out.println("Enter a number to know if it is a prime number");

			boolean isNumber = false;

			int numberInt = 0;

			while (!isNumber) {

				String number = sc.next();

				if (!(number.matches("^[0-9]+"))) {

					System.out.println("error\nEnter only a number\n");

				}

				else {

					isNumber = true;

					numberInt = Integer.parseInt(number);

				}

			}

			boolean prime = true;

			for (int a = numberInt - 1; a > 1; a--) {

				if (numberInt % a == 0) {

					prime = false;

				}

			}

			if (prime)
				System.out.println("The number " + numberInt + " is a prime number");

			else
				System.out.println("The number " + numberInt + " is a not prime number");

			System.out.println("Do you want to continue?[y/n] \n");

			char option = sc.next().charAt(0);

			while (option != 'y' && option != 'n') {

				System.out.println("This is not a valid option, please enter y or n\n");

				option = sc.next().charAt(0);
			}

			if (option == 'n') {

				finish = true;

				System.out.println("Bye bye");

			}

		}
	}

}
