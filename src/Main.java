
public class Main {
    public static void main(String[] args) {

        Contacts contact1 = new Contacts("dyl", "emailemial@email");
        Contacts contact2 = new Contacts("gryl", "emaial@email");
        Contacts contact3 = new Contacts("byl", "eml@email");

        ContactBook book1 = new ContactBook();
        ContactBook book2 = new ContactBook();

        book1.addContact(contact1);
        book1.addContact(contact3);

        book2.addContact(contact2);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println();

        for (Contacts a : book1) {
            System.out.println(a);
        }

        for (Contacts a : book2) {
            System.out.println(a.getName() + "--" + a.getEmail());
        }


    }
}