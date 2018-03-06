package mordorCrueltyPlan;

import mordorCrueltyPlan.factories.FoodFactory;
import mordorCrueltyPlan.food.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Gandalf gandalf = new Gandalf();

        String input = bfr.readLine();
        Pattern inputPattern = Pattern.compile("[A-Za-z]+");
        Matcher inputMatcher = inputPattern.matcher(input);

        while (inputMatcher.find()){
            String foodName = inputMatcher.group();
            Food food = FoodFactory.createFood(foodName.toLowerCase());
            gandalf.eat(food);
        }

        System.out.println(gandalf.getHappiness());
        System.out.println(gandalf.getMood().getClass().getSimpleName());
    }
}
