import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> artPeople = new ArrayList<>();

        artPeople.add(new Person("Василий", "Жуковский", 69));
        artPeople.add(new Person("Александр", "Грибоедов", 70));
        artPeople.add(new Person("Александр", "Пушкин", 37));
        artPeople.add(new Person("Михаил", "Лермонтов", 26));
        artPeople.add(new Person("Николай", "Гоголь", 42));
        artPeople.add(new Person("Иван", "Тургенев", 64));


        System.out.println("Несортированный список:");
        for (Person artPerson : artPeople) {
            System.out.println(artPerson);
        }
        System.out.println();
        System.out.println("Сортировка компоратором:");
        Collections.sort(artPeople, new PersonComparator(3));
        for (Person artPerson : artPeople) {
            System.out.println(artPerson);
        }
    }
}
