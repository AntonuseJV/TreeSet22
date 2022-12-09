import java.util.*;

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
        for (Person P : artPeople) {
            System.out.println(P);
        }
        System.out.println();

        System.out.println("Сортировка лямбдой:");
        Comparator <Person> artComp = (o1, o2) ->{
            if (o1.numberWords() <= 3 && o2.numberWords() <= 3) {
                if (o1.numberWords() < o2.numberWords()) {
                    return 1;
                } else if (o1.numberWords() > o2.numberWords()) {
                    return -1;
                } else {
                    return Integer.compare(o2.getAge(), o1.getAge());
                }
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
        artPeople.sort(artComp);
        for (Person P : artPeople) {
            System.out.println(P);
        }
    }
}