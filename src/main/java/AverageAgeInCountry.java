import java.sql.SQLOutput;
import java.util.*;

public class AverageAgeInCountry extends Person {
    public AverageAgeInCountry(String name, String nationality, int age) {
        super(name, nationality, age);
    }

    public static void getAverageAge() {
        List<Person> people = PersonData.inputData();

        Map<String, List<Person>> hashMapPerson = new HashMap<String, List<Person>>();
        for (Person person : people) {
            String key = person.nationality;
            if (hashMapPerson.get(key) == null) {
                hashMapPerson.put(key, new ArrayList<Person>());
            }
            hashMapPerson.get(key).add(person);
        }

        System.out.println("The average people age in each nationality:");

        Set<String> hashKeyList = hashMapPerson.keySet();
        for (String hashValue : hashKeyList) {
            List<Person> averageAge = hashMapPerson.get(hashValue);
            Integer sum = 0;
            for (Person person : averageAge) {
                sum = sum + person.age;
            }
            System.out.println(hashValue + ": " + sum / averageAge.size());

        }

    }
}

