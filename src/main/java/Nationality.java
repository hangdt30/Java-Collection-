import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Nationality extends Person{
    public Nationality(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public static void getNationality() {
        ArrayList<Person> people = PersonData.inputData();

        ArrayList<String> nation = new ArrayList<>();
        for (var i = 0; i < people.size(); i++) {
            var item = people.get(i).nationality ;
            nation.add(item);
        }

        ArrayList<String> countNation = new ArrayList<>();
        for (var i = 0; i < nation.size(); i++) {
            var item = nation.get(i) + ": " + Collections.frequency(nation, nation.get(i));
            countNation.add(item);
        }

        Set<String> set = new LinkedHashSet<String>(countNation);
        set.addAll(countNation);
        countNation = new ArrayList<String>(set);

        System.out.println("The number of people in each nationality:");
        countNation.forEach(System.out::println);


    }


}
