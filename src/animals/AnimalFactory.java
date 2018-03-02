package animals;

public class AnimalFactory {

    public Animal createAnimal(String species, String name, int age, String gender){
        switch (species.toLowerCase()){
            case "cat":
                return new Cat(name, age, gender);
//                if (gender.toLowerCase().equals("male")){
//                    return new Tomcat(name, age, gender);
//                } else {
//                    return new Kitten(name, age, gender);
//                }
            case "dog":
                return new Dog(name, age, gender);
            case "frog":
                return new Frog(name, age, gender);
            case "tomcat":
                return new Tomcat(name, age, gender);
            case "kitten":
                return new Kitten(name, age, gender);
                default:
                    throw new IllegalArgumentException();
        }
    }
}
