
//1 Course

public class Main {
    private String name;
    private String instructor;
    private int credits;
    private String course;

    public void Course(String name, String instructor, int credits, String course) {

        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }


    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    public String getString() {
        return "Course {name =" + name + ", instructor=" + instructor + ", credits=" + credits + "}";
    }

}

