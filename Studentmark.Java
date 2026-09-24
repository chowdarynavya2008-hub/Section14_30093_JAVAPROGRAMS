import java.util.Scanner;

public class Studentmark {

public static void main(String []args) {

	int[] marks = {70, 45, 80, 35, 90};
	    //1. Travel - print all marks

	System.out.println("Student Marks:");
	for (int i = 0; i < marks.lenghth; i++) {

	System.out.println(marks[i]);
	}
	   //2. Search - find 80
	int search = 80;
	for (int i = 0; i < marks.length; i++) {
	    if (marks[i] == search) {
		System.out.println("80 found at index " + i);
	}
}
	   //3. Counting - count students who passes
	 int count = 0; 
	 for (int i = 0; i < marks.length; i++) {

	      if (marks[i] >=40) {
		count++;
	}
}
	System.out.println("Number of students passes: " + count);
	   //4. Extremes - find the highest and lowest
	
	  int highest = marks[0];
	  int lowest =marks[0];
	  for (int i = 1; i < marks.length; i++) {
		if (marks[i] > highest) {
		  highest = marks[i];
	}
	if (marks[i] < lowest) {
		lowest = marks[i];
		}
}

	System.out.println("Highest mark: " + highest);
	System.out.println("lowest mark: " + lowest)


