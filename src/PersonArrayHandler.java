public class PersonArrayHandler{
    private Person[] array;

    public PersonArrayHandler(Person[] array) {
        this.array = array;
    }
    public Person get(int index){
            if (index<0 || index >= array.length){
                return null;
            } else {
                return array[index];
            }
    }
    public Person[] getArray() {
        return array;
    }

    public int indexOfMaxAgePerson() {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].getAge() > array[maxIndex].getAge()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int indexOfMaxAgePerson(int index) {
        int maxIndex = Math.max(index,0);
        for (int i = 1; i < index; i++) {
            if (array[i].getAge() > array[maxIndex].getAge()) {
                maxIndex = i;
            }
        }
        for (int i = index; i < array.length; i++) {
            if (array[i].getAge() > array[maxIndex].getAge()) {
                maxIndex = i;
            }
        }
        return maxIndex>=array.length?-1:maxIndex;
    }

    public boolean isPersonExists(String searchName) {
        for (Person array : array) {
            if (array.getName().contains(searchName))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person person: array) {
             result+=person+System.lineSeparator();
        }
        return result;
    }
}