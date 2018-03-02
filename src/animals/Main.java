package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        AnimalFactory animalFactory = new AnimalFactory();
        List<Animal> animals = new ArrayList<>();

        String input = bfr.readLine();

        while (!input.equals("Beast!")){
            String[] inputArgs = bfr.readLine().split(" ");
            String name = inputArgs[0];
            int age = Integer.parseInt(inputArgs[1]);
            String gender = inputArgs[2];

            try {
                Animal animal = animalFactory.createAnimal(input, name, age, gender);
                animals.add(animal);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            input = bfr.readLine();
        }

        for (Animal animal : animals) {
            System.out.printf("%s %s %d %s\n", animal.getKind(), animal.getName(), animal.getAge(), animal.getGender());
            System.out.println(animal.produceSound());
        }
    }
}
