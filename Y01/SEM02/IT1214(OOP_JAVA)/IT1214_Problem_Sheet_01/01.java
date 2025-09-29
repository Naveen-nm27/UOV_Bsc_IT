class Student {
    private int studentId;
    private String name;
    private int daysAttended;
    
    Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDaysAttended() {
        return daysAttended;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDaysAttended(int days) {
        this.daysAttended = days;
    }
}

class Classroom {
    Student[] students = new Student[10];
    int numberOfStudents = 0;
    
    public void addStudent(String name, int id, int daysAttended) {
        if (numberOfStudents <= 9) {
            students[numberOfStudents] = new Student(id, name, daysAttended);
            numberOfStudents++;
        } else {
            System.out.println("Maximum Number of Students are added");
        }
    }
    
    public boolean validateID(int id) {
        for (Student student : students) {
            if (student != null && student.getStudentId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void stDetails(int id) {
        if (validateID(id)) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (id == students[i].getStudentId()) {
                    System.out.println("Student Id - " + students[i].getStudentId());
                    System.out.println("+----------------+");
                    System.out.println("Student Name: " + students[i].getName());
                    System.out.println("Attendance: " + students[i].getDaysAttended() + " Days");
                    System.out.println("+----------------+");
                    System.out.println();
                }
            }
        } else {
            System.out.println("Student is not Enrolled in this class");
        }
    }
    
    public void editAttendance(int id, int newDays) {
        if (validateID(id)) {
            for (int i = 0; i < numberOfStudents; i++) {
                if (id == students[i].getStudentId()) {
                    students[i].setDaysAttended(newDays);
                }
            }
        } else {
            System.out.println("Student " + id + " is not enrolled in this class");
        }
    }
    
    public void printClass() {
        System.out.println("Student ID | \tStudent Name | \tAttendance");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("-" + students[i].getStudentId() + "\t\t" + students[i].getName() + "\t" + students[i].getDaysAttended());
        }
    }
}

class Problem01 {
    public static void main(String[] args) {
        Classroom class01 = new Classroom();
        
        // Add students directly in one line each
        class01.addStudent("Alice Smith", 101, 12);
        class01.addStudent("Bob Jones", 102, 15);
        class01.addStudent("Carol Lee", 103, 10);
        
        class01.editAttendance(102, 16);
        class01.printClass();
    }
}