package com.eculant.conn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		
		try {
			System.out.println("Connection Established");
			Socket soc = new Socket("localhost", 8989);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size");
			int number = Integer.parseInt(br.readLine());
			PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
			pw.println(number);
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
