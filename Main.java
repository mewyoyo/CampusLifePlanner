
//1 Course

import java.util.ArrayList;

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


public static void main(String[] args) {
        ArrayList<PlanItem> items = new ArrayList<>();

        items.add(new Assignment("Math Homework", 2, 3));
        items.add(new ExamPreparation("Physics Exam", 1, 5));
        items.add(new ClubEvent("Debate Club", 4, 2));

        // вывод всех элементов
        for (PlanItem item : items) {
            item.displayInfo();
        }

        // отметить первый как выполненный
        items.get(0).markCompleted();

        System.out.println("After marking first item completed:");
        System.out.println();

        for (PlanItem item : items) {
            item.displayInfo();
        }

        // подсчёт общего времени
        int totalHours = 0;
        for (PlanItem item : items) {
            if (!item.completed) {
                totalHours += item.getEstimatedHours();
            }
        }

        System.out.println("Total remaining hours: " + totalHours);
    }
}


