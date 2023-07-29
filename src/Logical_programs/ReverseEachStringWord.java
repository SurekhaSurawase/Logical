package Logical_programs;

public class ReverseEachStringWord {

	public static void main(String[] args) {

		String Str = "Good Morning Everyone";
		
		
		String [] word = Str.split(" ");
		String Reverse = "";

		for (String W: word) {
			String Strword = "";
			for(int i = W.length()-1; i>=0; i--) {
				Strword = Strword + W.charAt(i);
			}
			Reverse = Reverse + Strword+" ";
		}
		System.out.println(Reverse);
	}

}
