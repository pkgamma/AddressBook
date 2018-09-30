import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// testing if git is still working after changing the name on github

public class AddressBook {
    private Map<String, Person> people;
    private String name;

    public AddressBook(String name) {
        this.name = name;
        this.people = new HashMap<>();
    }

    public void add(Person person) {
        people.put(person.getName(), person);
    }

    public boolean remove(Person person) {
        return people.remove(person.getName()) != null;
    }

//    public void replace(Person old, Person replacement) {
//        remove(old);
//        add(replacement);
//    }

    public boolean contains(Person person) {
        return people.containsValue(person);
    }
}
