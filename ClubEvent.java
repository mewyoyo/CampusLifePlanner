public class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public String getUrgency() {
        if (completed) {
            return "Event finished";
        }
        return "Event coming soon!";
    }
}
