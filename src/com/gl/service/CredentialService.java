package com.gl.service;

import java.util.Random; 

import com.gl.pattern.Employee;

  
public class CredentialService {

	public String generatePassword() {             
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxys";
		String number = "0123456789";
		String special="!@#$%^&*()_+"; 

		String bigString = upper+lowerCase+number+special;
		Random random = new Random();
		char [] password = new char[8];
		for(int i=0;i<8;i++) {

			password[i]=bigString.charAt(random.nextInt(bigString.length()));

	}


	return new String (password);  

	}

	public String generateEmailAddress(String firstName,String lastName,String department) {  
		return firstName+lastName+"@"+department+".greatlearning.com";


	}

	
	

	public void showCredentials(String firstName, String lastName, String generateEmail, String generatePswd) {
		System.out.println("Dear " +firstName+lastName+ " your generated credentials are as follows");
		System.out.println("Email:"+generateEmail);
		System.out.println("Password :"+generatePswd);		
	}


}