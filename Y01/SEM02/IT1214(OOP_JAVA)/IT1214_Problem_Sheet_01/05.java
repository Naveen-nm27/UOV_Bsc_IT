class Students{
	private String name;
	private int exam1;
	private int exam3;
	private int exam2;
	
	boolean validateMarks(int marks) {
		if(marks<=100 && marks>=0){
			return true;
			}
		return false;
	}
	
  public Students(String name, int exam1, int exam2, int exam3) throws Exception {
        if (validateMarks(exam1) && validateMarks(exam2) && validateMarks(exam3)) {
            this.name = name;
            this.exam1 = exam1;
            this.exam2 = exam2;
            this.exam3 = exam3;
        } else {
            throw new Exception("Exam scores must be between 0 and 100.");
        }
    }
	
	public static void setScores(int e1,int e2,int e3){

	}
	
	public String getName(){
		return name;
	}
	
	public int getScoreE1(){
		return exam1;
	}
	
	public int getScoreE2(){
		return exam2;
	}
	
	public int getScoreE3(){
		return exam3;
	}
	
	public int getAvarage(){
		int avg = (exam1 + exam2 + exam3)/3;
		return avg;
	}
	
	Students(){
		
	}

}

class Problem05{
	public static void main(String[] args){
    try {
            Students st01 = new Students("John", 75, 110, 90);
            System.out.println("Name: " + st01.getName());
            System.out.println("Exam 1: " + st01.getScoreE1());
            System.out.println("Exam 2: " + st01.getScoreE2());
            System.out.println("Exam 3: " + st01.getScoreE3());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Student data not displayed due to validation error.");
        }
}
}