package StudentGrade;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name- > ");
		s1.name=sc.next();
		System.out.println("Enter the age -> ");
		s1.age=sc.nextInt();
		System.out.println("enter Roll_No");
		s1.Roll_No=sc.nextInt();
		System.out.println("Enter 5 subjects marks -> ");
		s1.m1=sc.nextInt();
		s1.m2=sc.nextInt();
		s1.m3=sc.nextInt();
		s1.m4=sc.nextInt();
		s1.m5=sc.nextInt();
		s1.total=s1.m1+s1.m2+s1.m3+s1.m4+s1.m5;
		s1.percentage=s1.total*100/500;
		
		System.out.println("Name -> "+s1.name);
		System.out.println("Age -> "+s1.age);
		System.out.println("Roll_No->"+s1.Roll_No);
		System.out.println("Total -> "+s1.total);
		System.out.println("Percentage -> "+s1.percentage+"%");
		
		if(s1.percentage>=75) {
			
			System.out.println("Grade A");	
		}
		else if(s1.percentage>=65&&s1.percentage<75) {
			System.out.println("Grade A1");
		}
		else if(s1.percentage>=55&&s1.percentage<65) {
		System.out.println("Grade B");
		}
		else if(s1.percentage>=45&&s1.percentage<55) 
		{
			System.out.println("Grade B1");
			}
		else if(s1.percentage>=35){
			System.out.println("Grade C");
		}
		else {
			System.out.println("FAIL !");
			}
	
	}
	
	}
	
	
	
	
