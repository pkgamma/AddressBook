import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {

    private AddressBook addressBook;

    @Before
    public void setUp() {
        addressBook = new AddressBook("test book");
    }

    @Test
    public void findsAddedPerson() {
        Person person = new Person("Philip", 20);

        assertFalse(addressBook.contains(person));

        addressBook.add(person);

        assertTrue(addressBook.contains(person));
    }

    @Test
    public void doesntFindNotAddedPerson() {
        Person person = new Person("Philip", 20);
        Person notAdded = new Person("Ben", 19);

        addressBook.add(person);

        assertFalse(addressBook.contains(notAdded));
    }

    @Test
    public void removesAddedPerson() {
        Person person = new Person("Philip", 20);
        addressBook.add(person);

        assertTrue(addressBook.contains(person));
        assertTrue(addressBook.remove(person));
        assertFalse(addressBook.contains(person));
    }

    @Test
    public void doesntRemoveNotAddedPerson() {
        Person person = new Person("Philip", 20);

        assertFalse(addressBook.contains(person));
        assertFalse(addressBook.remove(person));
    }

}