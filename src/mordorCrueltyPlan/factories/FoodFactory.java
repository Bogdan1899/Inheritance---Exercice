package mordorCrueltyPlan.factories;

import mordorCrueltyPlan.food.*;

public class FoodFactory {

    public static Food createFood(String food){

        switch (food){
            case "apple":
                return new Apple();
            case "cram":
                return new Cram();
            case "honeycake":
                return new HoneyCake();
            case "lembas":
                return new Lembas();
            case "melon":
                return new Melon();
            case "mushrooms":
                return new Mushrooms();
                default:
                    return new AnyOtherFood();
        }
    }
}
