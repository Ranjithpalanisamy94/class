package clss;

import java.util.Scanner;

public class Scannerwrkout {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("studentid");
		int num =sc.nextInt();
		System.out.println("student id : "+num);
	
		System.out.println("student name");
		String name = sc.next();
		System.out.println("student name:"+name);
		
		System.out.println("studentdetails");
		String details = sc.nextLine();
		System.out.println("student details:"+details);
		
}
}
      