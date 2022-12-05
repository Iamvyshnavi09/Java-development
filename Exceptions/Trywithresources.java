package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trywithresources {

	public static void main(String[] args) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{	
		String str = "Sunshine";
		System.out.println(str);
		
		str = br.readLine();
		}
		
		}
	}


