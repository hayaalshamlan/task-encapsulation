public class Students {
    private String name;
    private int age;
    private double gpa;

    public Students(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGpaStatus(double gpa) {
        this.gpa = gpa;
        if (gpa <= 4.0 && gpa >= 0.0) {
            this.gpa = gpa;
        }
    }

    public String getGpaStatus() {
        if (gpa > 3) {
            return "excellent";
        } else if (gpa <= 3) {
            return "good";
        } else
            return "needs improvment";
    }

}
