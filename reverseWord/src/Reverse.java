import java.util.Scanner;

public class Reverse
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input a random word.");
				
				String word = userInput.nextLine();
				
				String[] array = word.split("");
				for (int i = array.length - 1; i >= 0; i--)
					{
						System.out.print(array[i]);
					}
			}
	}
//github