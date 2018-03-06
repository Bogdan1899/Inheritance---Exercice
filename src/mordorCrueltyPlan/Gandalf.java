package mordorCrueltyPlan;

import mordorCrueltyPlan.factories.MoodFactory;
import mordorCrueltyPlan.food.Food;
import mordorCrueltyPlan.moods.Mood;

public class Gandalf {

    private int happiness;

    private Mood mood;

    public Gandalf() {
        this.setHappiness(0);
    }

    public int getHappiness() {
        return this.happiness;
    }

    private void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public Mood getMood() {
        this.setMood();
        return mood;
    }

    private void setMood() {
        this.mood = MoodFactory.createMood(this.getHappiness());
    }

    public void eat(Food food){
        this.setHappiness(food.getHappiness() + this.getHappiness());
    }
}
