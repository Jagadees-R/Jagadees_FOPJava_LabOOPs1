package com.gl.generate;

import java.util.Scanner;

import com.gl.pattern.Employee;
import com.gl.service.CredentialService;


public class DriverClass {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee("Jagadees","R");
	
		CredentialService cs = new CredentialService();
		String generateEmail=" ";
		String generatePswd =null;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Choose Your Department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int choice=sc.nextInt();
		
		switch(choice){
		case 1:
			   generateEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"Technical");
			   generatePswd=cs.generatePassword();
			   break;
		case 2:
			   generateEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"Admin");
			   generatePswd=cs.generatePassword();
			   break;

		case 3:
			   generateEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"Human Resource");
			   generatePswd=cs.generatePassword();
			   break;

		case 4:
			   generateEmail=cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"legal");
			   generatePswd=cs.generatePassword();
			   break;

		default:	
				System.out.println("Please Enter A Valid Choice:");
			 	
		}
			cs.showCredentials(emp.getFirstName(),emp.getLastName(),generateEmail,generatePswd);
			
		
	}

}
