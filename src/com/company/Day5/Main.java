package com.company.Day5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jack", 12, "Chicago");
        person.printPerson();
        Employee employee1 = new Employee(11111L, "Mary", "2 stage 5 floor", 20, Gender.Female);
        Employee employee2 = new Employee(2222222L, "Ann", "2 stage 5 floor", 25, Gender.Female);
        Employee employee3 = new Employee(1351L, "RobertDeNiro", "2 stage 5 floor", 77, Gender.Male);
        Employee employee4 = new Employee(111155311L, "AlPacino", "9 stage 1 floor", 78, Gender.Male);
        Employee employee5 = new Employee(154481111L, "MarlonBrando", "9 stage 1 floor", 79, Gender.Male);
        Author author = new Author("Mario Puzo", "mariopuso@gmail.com", Gender.Male);
        Book book1 = new Book("Animals",author,120);
        Book book2 = new Book("Wild",author,200);

        System.out.println(employee2);

    }
}
