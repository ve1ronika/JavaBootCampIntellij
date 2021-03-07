package activity;

public class Students {

    private String schoolName;

    public Students(){
        this.schoolName = "Unknown";
    }

    public Students(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
