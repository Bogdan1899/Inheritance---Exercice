package mordorCrueltyPlan.food;

public abstract class Food {

    private int happiness;

    public Food(int happiness) {
        this.setHappiness(happiness);
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
