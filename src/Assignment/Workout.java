package Assignment;

class Workout {
    private String type;
    private int caloriesBurned;
    public Workout(String type, int caloriesBurned) {
        this.type = type;
        this.caloriesBurned = caloriesBurned;
    }
    public String getType() {
        return type;
    }
    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
class FitnessTracker {
    private Workout workout1;
    private Workout workout2;
    public void addWorkout(Workout workout) {
        if (workout1 == null) {
            workout1 = workout;
            System.out.println("Added workout: " + workout.getType());
        } else if (workout2 == null) {
            workout2 = workout;
            System.out.println("Added workout: " + workout.getType());
        } else {
            System.out.println("Workout log is full. Cannot add more workouts.");
        }
    }
    public int calculateTotalCalories() {
        int totalCalories = 0;
        if (workout1 != null) totalCalories += workout1.getCaloriesBurned();
        if (workout2 != null) totalCalories += workout2.getCaloriesBurned();
        return totalCalories;
    }
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        Workout workout1 = new Workout("Running", 300);
        Workout workout2 = new Workout("Cycling", 400);

        tracker.addWorkout(workout1);
        tracker.addWorkout(workout2);
        System.out.println("Total Calories Burned: " + tracker.calculateTotalCalories());
    }
}
