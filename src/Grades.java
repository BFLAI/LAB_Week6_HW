public class Grades {
    private double Totalpoint; //variables part
    private double Earnedpoints;
    private double percentage;
    private double Grade;

    Grades() { // constructors part
        Totalpoint = 0;
        Earnedpoints = 0;
        percentage = 0;
        getWeightedGrade();
    }
    Grades(double cal1, double cal2, double cal3) {
        Totalpoint = cal1;
        Earnedpoints = cal2;
        percentage = cal3;
        getWeightedGrade();
    }

    public void setWeightedGrade(double cal1, double cal2, double cal3) {
        Totalpoint = cal1;
        Earnedpoints = cal2;
        percentage = cal3;
    }
    public double getWeightedGrade() {  //get and set part
        Grade = Earnedpoints / Totalpoint * percentage;
        return Grade;
    }

    public double getPointTotal() {
        return Totalpoint;
    }

    public void setPointTotal(double pointTotal) {
        this.Totalpoint = pointTotal;
    }

    public double getEarnedPoints() {
        return Earnedpoints;
    }

    public void setEarnedPoints(double earnedPoints) {
        this.Earnedpoints = earnedPoints;
    }

    public double getAssignmentPercentage() {
        return percentage;
    }

    public void setAssignmentPercentage(double assignmentPercentage) {
        this.percentage = assignmentPercentage;
    }
}