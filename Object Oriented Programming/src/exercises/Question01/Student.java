package exercises.Question01;

public class Student {
	
	private String name;
	private int enrollment;
	
	private double testScore1;
	private double testScore2;
	private double workScore;
	
	public Student(double testScore1, double testScore2, double workScore) {
		this.testScore1 = testScore1;
		this.testScore2 = testScore2;
		this.workScore = workScore;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEnrollment() {
		return enrollment;
	}
	
	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}
	
	public double average() {
		return ((this.testScore1+this.testScore2)/2.5) + (this.workScore/2); 
	}

	public double finalExam() {
		var average = this.average();
		return average >=10 ? 0 : 10 - average;
	}
}
