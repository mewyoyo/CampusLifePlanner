public class ExamPreparation extends PlanItem {

    public ExamPreparation(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public String getUrgency() {
        if (completed) {
            return "Exam preparation completed";
        }
        if (daysUntil <= 2) {
            return "Exam VERY urgent!";
        }
        return "Exam urgency: " + super.getUrgency();
    }
}
