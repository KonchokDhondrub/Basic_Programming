import java.util.Arrays;

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

        System.out.println("----- Is Names Matches ------");
        Person[] peopleCopy = Arrays.copyOf(people, people.length);
        PersonArrayHandler handlerCopy = new PersonArrayHandler(peopleCopy);
        isPersonsExists(handler, handlerCopy);

        System.out.println("----- Merging All Arrays ------");
        PersonArrayHandler handlerAll = new PersonArrayHandler(retainAll(handler, handlerCopy));
        System.out.println(handlerAll);
    }

    public static boolean isPersonsExists(PersonArrayHandler handler, PersonArrayHandler handlerCopy) {
        boolean result = false;
        for (int i = 0; i < handler.getArray().length; i++) {
            String resultStr = handlerCopy.get(i).getName() + " == " + handler.get(i).getName() + " = ";
            String search = handler.get(i).getName();
            if (handlerCopy.get(i).getName().contains(search)) {
                System.out.println(resultStr + true);
                result = true;
            } else {
                System.out.println(resultStr + false);
            }
        }
    return result;
    }

    public static Person[] retainAll(PersonArrayHandler handler, PersonArrayHandler handlerCopy){
        int newArraySize = handler.getArray().length+handlerCopy.getArray().length;
        Person[] peopleAll = new Person[newArraySize];
        for (int i = 0; i < handler.getArray().length; i++) {
            peopleAll[i] = handler.get(i);
        }
        for (int i = handler.getArray().length; i < newArraySize; i++) {
            peopleAll[i] = handlerCopy.get(i-handlerCopy.getArray().length);
        }
        return peopleAll;
    }
}