// 2 AssignmentTask

import Course.Course;

public class AssignmentTask {
    private String title;
    private Course course;
    private int estimatedHours;
    private int daysUntilDue;
    private boolean completed;

    public AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue) {
        this.title = title;
        this.course = course;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }
    public Course getCourse() {
        return course;
    }
    public int getEstimatedHours() {
        return estimatedHours;
    }
    public int getDaysUntilDue() {
        return daysUntilDue;
    }
    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    public boolean isUrgent() {
        return daysUntilDue <= 2 && !completed;
    }

    public String toString() {
        return "AssihnmentTask{title='" + title + "', course='" + course.getName() + "'estHourse=" + estimatedHours + "'dueIn" + daysUntilDue + "'completed=" + completed + "}";
    }

}
