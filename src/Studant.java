public class Studant {

    private String name ;
    private double grade1;
    private double grade2;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double finalGrade(){
        return grade1 + grade2;
    }
    public double missingPoints(){
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }

}