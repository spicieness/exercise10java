import java.util.ArrayList;
import java.util.Iterator;

public class ContactBook implements Iterable<Contacts>{

    private ArrayList<Contacts> myList = new ArrayList<>();


    public ContactBook() {
    }

    public void addContact(Contacts a) {
        myList.add(a);
    }

    @Override
    public String toString() {
        return "ContactBook{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Contacts> iterator() {
        return myList.iterator();
    }
}
