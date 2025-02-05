public class HW_20250204 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("pavel", 14),
                new Person("sergey", 34),
                new Person("olja", 21),
                new Person("john", 18),
                new Person("jack", 45),
                new Person("oleg", 41),
                new Person("misha", 37),
                new Person("lena", 45),
                new Person("lolita", 22),
                new Person("kiril", 86),
                new Person("zhenya", 45)
        };
        PersonArrayHandler handler = new PersonArrayHandler(people);
        System.out.println(handler);

        System.out.println("Самый старший человек: " + handler.get(handler.indexOfMaxAgePerson()));
        System.out.println("Самый старший, поиск от индекса: " + handler.get(handler.indexOfMaxAgePerson(3)));
        System.out.println("Существует ли: " + handler.isPersonExists("john"));
    }
}