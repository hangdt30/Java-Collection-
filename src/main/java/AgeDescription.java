import java.util.ArrayList;
import java.util.Collections;

public class AgeDescription extends Person {
    public AgeDescription(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public static void getAgeDescription() {
        ArrayList<Person> people = PersonData.inputData();

        ArrayList<String> age = new ArrayList<>();
        for (var i = 0; i < people.size(); i++) {
            String description;
            if (people.get(i).age < 20) description = "Nổi loạn";
            else if (people.get(i).age >= 20 && people.get(i).age <= 30) description = "Việc làm";
            else if (people.get(i).age >= 31 && people.get(i).age <= 40) description = "Sự nghiệp";
            else description = "Hưởng thụ";

            var item = people.get(i).name + " - " + people.get(i).nationality + " - " + people.get(i).age + " - " + description;
            age.add(item);
        }
        Collections.sort(age);
        System.out.println("The description of age for each level:");
        age.forEach(System.out::println);

    }
}
