package com.courseit.throwAndError;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowTest {
	
	public static void main(String[] args) 
	{
		try
		{
			//divideMethod();
			fileReadMethod();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

	private static void fileReadMethod() throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		br.close();
		
	}

	private static void divideMethod() throws Exception{
		// TODO Auto-generated method stub
		int i = 5;
		int j=0;
		int k =i/j;
		System.out.println(k);
		
	}

}
