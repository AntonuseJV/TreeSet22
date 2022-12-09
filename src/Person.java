public class Person {
    private String name;
    private String surname;
    private int age;
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int numberWords() {
        int count = 0;
        if (surname.length() != 0) {
            count++;
            for (int i = 0; i < surname.length(); i++) {
                if (surname.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
