package mordorCrueltyPlan.factories;

import mordorCrueltyPlan.moods.*;

public class MoodFactory {

    public static Mood createMood(int happiness){
        if (happiness < -5){
            return new Angry();
        } else if (happiness >= -5 && happiness < 0){
            return new Sad();
        } else if (happiness >= 0 && happiness <= 15){
            return new Happy();
        } else {
            return new Javascrypt();
        }
    }
}
