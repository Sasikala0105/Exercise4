package Abstractques;

abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks{
    double subject1 , subject2, subject3;
    
    StudentA (double s1, double s2, double s3) {
       this.subject1 = s1;
       this.subject2 = s2;
       this.subject3 = s3;
    }
    
    double getPercentage() {
    	double percentageofstudent;
    	percentageofstudent = (subject1 + subject2 + subject3) / 300 * 100;
    	System.out.println("Student A overall percentage in 3 subjects : " +percentageofstudent + " %");
	return percentageofstudent;
	
    }
}

class StudentB extends Marks{
    double subject1, subject2, subject3, subject4;

    StudentB (double s1, double s2, double s3, double s4) {
    	this.subject1 = s1;
    	this.subject2 = s2;
    	this.subject3 = s3;
    	this.subject4 = s4;
    }
    
    double getPercentage() {
    	double percentageofstudent;
	percentageofstudent = (subject1 + subject2 + subject3 + subject4) / 400 * 100;
	System.out.println("Student B overall percentage in 4 subjects : " +percentageofstudent + " %");
	return percentageofstudent;
    }
}

public class Exerciseques3{
	
    public static void main(String[] args) {
        
        StudentA A = new StudentA(80,85,60);
        StudentB B = new StudentB(78,66,100,93);
        
        A.getPercentage();
        B.getPercentage();        
    }
    
}

