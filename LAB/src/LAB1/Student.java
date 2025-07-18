package LAB1;

public class Student {
    private int studentId;
    public String studentName;
    public String city;
    public int marks1;
    public int marks2;
    public int marks3;
    public float feePerMonth;
    public boolean isEligibleForScholarship;
    //setter
    public void setStudentName(String studentName) {
        this.studentName=studentName;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setMarks1(int marks1){
        this.marks1=marks1;
    }
    public void setMarks2(int marks2){
        this.marks2=marks2;
    }
    public void setMarks3(int marks3){
        this.marks3=marks3;
    }
    public void setFeePerMonth(float feePerMonth){
        this.feePerMonth=feePerMonth;
    }
    public void setEligibleForScholarship(boolean isEligibleForScholarship){
        this.isEligibleForScholarship=isEligibleForScholarship;
    }

    //Getter
    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getCity(){
        return city;
    }

    public int getMarks1(){
        return marks1;
    }

    public int getMarks2(){
        return marks2;
    }
    public int getMarks3(){
        return marks3;
    }
    public float getFeePerMonth(){
        return feePerMonth;
    }
    public boolean getEligibleForScholarship(){
        return isEligibleForScholarship;
    }

    public float getAnnualFee(){
        return feePerMonth *12;
    }
    public int getTotalMarks(){
        return marks1+marks2+marks3;
    }
    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }
}
