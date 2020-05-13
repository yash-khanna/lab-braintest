package service;

public class PersonalityCalculator{
	public String findYourBrainType(String input){
		String output="";
		int x=findAnswers(input);
		if(x>=20 && x<=55) {
			output="leftbrained";
		}else if(x>=56 && x<=64) {
			output="noclearpreference";
		}else if (x>=65 && x<=100) {
			output="rightbrained";
		}else {
			;
		}
		System.out.println("You are "+"/*"+output+"*/");
		return output;
	}
	
	public static int findAnswers(String str) {
		String values[]=str.split(",");
		int a[]=new int[values.length];
		for(int i=0;i<values.length;i++) {
			a[i]=Integer.parseInt(values[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("The answer for the Question - "+i+1+" "+a[i]+".");
		}
		int A=0;int B=0;
		A=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
		B=a[4]+a[5]+a[6]+a[8]+a[12]+a[14]+a[15]+a[16]+a[18];
		int value=66-A+B;
		System.out.println("Your total score is "+value+".");
		return value;
	}
}