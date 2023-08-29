package com.eculant.conn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
		try {
			System.out.println("Waiting for clients");
			ServerSocket ss = new ServerSocket(8989);
			Socket soc = ss.accept();
			System.out.println("Connection established");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int number = Integer.parseInt(br.readLine());
			PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);
			System.out.println(calculateFibonacii(number));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static String calculateFibonacii(int number) {
		
		int a,b,c;
		a=0;b=1;

		System.out.print(a + "," + b);
		for(int i = 0;i<=number;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print("," + c);
		}
		return " is the factorial of size " + number;
	}
		
}
