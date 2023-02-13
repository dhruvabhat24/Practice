// write a java program to fill a letter templete which looks like below
// letters="Dear<|name|>,Thaks a lot"
//replace <|name|> with a String(some name)
public class Templete {

	public static void main(String[] args) {

		String letter= "Dear<|name|> ,Thanks a lot!";
		letter= letter.replace("<|name|>","Dhruva");
		System.out.println(letter);
	}

}
