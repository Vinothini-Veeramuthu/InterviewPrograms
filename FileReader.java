package interviewprgrms;

import java.io.BufferedReader;

public class FileReader {

	public static void main(String[] args) {
		FileReader fr = new FileReader();
		BufferedReader br = new BufferedReader(fr);
		boolean str;
		while(str=br.readLine()!=null)
		{
			System.out.println(str);
		}
		br.close();

	}

}
