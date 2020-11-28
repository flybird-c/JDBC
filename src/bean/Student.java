package bean;
public class Student {
    private int stuId;
    private String stuName;
    private String stuBirthday;
    private String stuGender;

    public Student(int stuId, String stuName, String stuBirthday, String stuGender) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuBirthday = stuBirthday;
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "bean.student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuBirthday='" + stuBirthday + '\'' +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

}
