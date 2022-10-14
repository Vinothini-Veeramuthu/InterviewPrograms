package interviewprgrms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		int count;
		Random rn = new Random();
		for(count=1;count<7;count++)
		{
		System.out.println(rn.nextInt(50));

		}
	}

}
