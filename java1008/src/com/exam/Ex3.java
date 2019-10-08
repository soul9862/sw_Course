package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ex3 {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try {
			URL url = new URL("https://www.daum.net/");
			
			// URL 객체로부터 URLConnection 객체 생성
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			// HttpURLConnection는 GET POST 방식 지정 등 메소드 보유함
			
			reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // main method

}
