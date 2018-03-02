package animals;

public class Tomcat extends Cat{

    private static final String KIND = "Tomcat";

    public Tomcat(String name, int age, String gender) {
        super(KIND, name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }
}
