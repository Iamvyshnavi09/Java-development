package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Trywithresources {
	static int count;

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("C:\\Users\\hp\\Documents\\project for jdbc.txt");
				BufferedReader br=  new BufferedReader(fr);){
			String line;
			while((line = br.readLine())!=null) {
				StringTokenizer s = new StringTokenizer(line);
				while(s.hasMoreTokens()) {
					System.out.println(s.nextToken());
					count++;
				}
			}
			System.out.println("Number of words in file:"+ count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
