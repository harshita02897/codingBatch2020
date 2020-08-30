package codingBatch2020_Assignments;

import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new assignment1();
	}
	assignment1() throws InterruptedException{
		for(int i=3;i>0;i--) {
			System.out.print(i+" ");
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("GO !!");
		new sentenceTimeTaken();
	}
	
	private class sentenceTimeTaken{
		sentenceTimeTaken() throws InterruptedException{
			String[] sentence = {"Isn’t it crazy how we just went from the most basic sentence, to a complex one with plenty of detail?",
					"Even the most complicated sentences start with a simple structure.",
					"I like cats of the Turkish Van breed.",
					"If you want to build a solid structure, you need to put down the first few blocks in the right place.",
					"That's why learning basic English sentences is so important!",
					"In this practice session we will be typing the given sentences on the java console"};
			Random ran = new Random();
			String sentenceStr = sentence[ran.nextInt(6)];
			System.out.println(sentenceStr);
			System.out.println("length of random string is : "+sentenceStr.length());
			System.out.println("Now it's your turn to master on your writing practice, write the above sentence as fast as you can");
			Scanner sc=new Scanner(System.in);
			TimeUnit.SECONDS.sleep(1);
			double start=LocalTime.now().toSecondOfDay();
			String str=sc.nextLine();
			System.out.println("length of your string is : "+str.length());
			double end=LocalTime.now().toSecondOfDay();
			double elapsedTime=end-start;
			System.out.println("Total time taken by you to write is : "+elapsedTime+" seconds");
		}
		
	}
}
