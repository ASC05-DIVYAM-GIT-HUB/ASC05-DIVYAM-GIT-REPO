package LAB1;
import LAB1.Student;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStudentId(101);
        s1.setStudentName("Alice");
        s1.setCity("Delhi");
        s1.setMarks1(78);
        s1.setMarks2(82);
        s1.setMarks3(90);
        s1.setFeePerMonth(1500);
        s1.setEligibleForScholarship(true);

        s2.setStudentId(102);
        s2.setStudentName("Bob");
        s2.setCity("Mumbai");
        s2.setMarks1(65);
        s2.setMarks2(70);
        s2.setMarks3(60);
        s2.setFeePerMonth(1000);
        s2.setEligibleForScholarship(false);

        s3.setStudentId(103);
        s3.setStudentName("Charlie");
        s3.setCity("Chennai");
        s3.setMarks1(85);
        s3.setMarks2(88);
        s3.setMarks3(80);
        s3.setFeePerMonth(2000);
        s3.setEligibleForScholarship(true);

        Student[] students = {s1, s2, s3};

        Student topStudent = students[0];
        for (Student s : students) {
            if (s1.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("The student with highest marks: " + topStudent.getStudentName());


        Student leastFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = s;
            }
        }
        System.out.println("Student paying least monthly fee: " + leastFeeStudent.getStudentName()
                + ", Fee: " + leastFeeStudent.getFeePerMonth());

        // 3. Print name, total, average, result, scholarship status for all students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship: " + (s.getEligibleForScholarship() ? "Yes" : "No"));
            System.out.println("-----------------------");
        }
    }
}
