

import Course.Course;

import java.util.ArrayList;

public class CampusLifeApp {
    public static void main(String[] args) {

        Course oop = new Course("OOP", "Dr. Lee", 6);
        Course dm = new Course("Discrete Math", "Dr. Kim", 5);
        Course eng = new Course("English", "Ms. Brown", 3);

        System.out.println("Courses:");
        System.out.println(oop);
        System.out.println(dm);
        System.out.println(eng);

        ArrayList<AssignmentTask> tasks = new ArrayList<>();

        tasks.add(new AssignmentTask("Lab 1", oop, 3,1));
        tasks.add(new AssignmentTask("HW 2", dm, 4,5));
        tasks.add(new AssignmentTask("Essay", eng, 2,2));
        tasks.add(new AssignmentTask("Project", oop, 6,7));

        System.out.println("\nAssignments:");

        for (AssignmentTask task : tasks) {
            System.out.println(task);

            if (task.isUrgent()) {
                System.out.println("Urgent!");
            }
        }

        int totalHours = 0;
        for (AssignmentTask task : tasks) {
            if (!task.isCompleted()) {
                totalHours += task.getEstimatedHours();
            }
        }
        System.out.println("\nTotal remaining hours: " + totalHours);

        ArrayList<StudySession> sessions = new ArrayList<>();

        sessions.add(new StudySession(oop, 90));
        sessions.add(new StudySession(dm, 60));
        sessions.add(new StudySession(oop, 120));

        double oopHours = 0;

        for (StudySession s : sessions) {
            if (s.getCourse().getName().equals("OOP")) {
                oopHours += s.hours();
            }
        }

        System.out.println("\nTotal OOP study hours: " + oopHours);

        tasks.get(0).markCompleted();

        totalHours = 0;

        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                totalHours += t.getEstimatedHours();
            }
        }

        System.out.println("\nNew remaining hours: " + totalHours);

    }
}
