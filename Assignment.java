public class Assignment extends PlanItem {

    public Assignment(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public String getUrgency() {
        if (completed) {
            return "Assignment completed";
        }
        return "Assignment urgency: " + super.getUrgency();
    }
}
