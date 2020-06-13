package week1.day2;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a Software Tester";
		String[] splitString = input.split(" ");
		String finalString = "";
		for (int i = 0; i < splitString.length; i++) {
			if (i % 2 != 0) {
				String actual = splitString[i];
				// System.out.println("actual==>"+actual);
				String rev = "";
				for (int j = actual.length() - 1; j >= 0; j--) {
					rev += actual.charAt(j);

				}
				finalString += rev + " ";

			} else {
				finalString += splitString[i] + " ";
				

			}

		
		}
		System.out.print("finalString=>" + finalString);

	}
}
