import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PeopleAbove25 extends Person {
    public PeopleAbove25(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public static void getPeopleUnder25() {
        ArrayList<Person> people = PersonData.inputData();

        ArrayList<String> age = new ArrayList<>();
        for (var i = 0; i < people.size(); i++) {
            if (people.get(i).age > 25) {
                var item = people.get(i).name + " - " +people.get(i).nationality + " - " + people.get(i).age;
                age.add(item);
            }
        }
        Collections.sort(age);
        System.out.println("The list of people above 25:");
        age.forEach(System.out::println);

    }
}
