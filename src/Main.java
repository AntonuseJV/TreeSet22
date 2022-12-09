import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> artPeople = new ArrayList<>();

        artPeople.add(new Person("Василий", "Жуковский", 69));
        artPeople.add(new Person("Александр", "Грибоедов", 70));
        artPeople.add(new Person("Александр", "Пушкин", 37));
        artPeople.add(new Person("Михаил", "Лермонтов", 26));
        artPeople.add(new Person("Николай", "Гоголь", 42));
        artPeople.add(new Person("Иван", "Тургенев", 64));
        artPeople.add(new Person("Вася", "Иванов", 8));
        artPeople.add(new Person("Саша", "Петров", 10));
        artPeople.add(new Person("Мария", "Степанова", 8));


        System.out.println("Несортированный список:");
        for (Person P : artPeople) {
            System.out.println(P);
        }
        System.out.println();


        System.out.println("Совершеннолетние:");
        Predicate<Person> predicate = person -> person.getAge() < 18;
        artPeople.removeIf(predicate);
        for (Person P : artPeople) {
            System.out.println(P);
        }
    }
}
