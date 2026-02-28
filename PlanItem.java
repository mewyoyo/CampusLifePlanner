public class PlanItem {

    protected String title;
    protected int daysUntil;
    protected int estimatedHours;
    protected boolean completed;

    public PlanItem(String title, int daysUntil, int estimatedHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }

    public void markCompleted() {
        completed = true;
    }

    public String getUrgency() {
        if (completed) {
            return "Completed";
        }
        if (daysUntil <= 1) {
            return "High urgency";
        } else if (daysUntil <= 3) {
            return "Medium urgency";
        } else {
            return "Low urgency";
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Days until: " + daysUntil);
        System.out.println("Estimated hours: " + estimatedHours);
        System.out.println("Status: " + (completed ? "Done" : "Not done"));
        System.out.println("Urgency: " + getUrgency());
        System.out.println("---------------------");
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }
}
