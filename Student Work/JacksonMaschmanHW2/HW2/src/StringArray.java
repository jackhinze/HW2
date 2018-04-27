public class StringArray {

    public String[] array;
    public int size;

    public StringArray() {
        size = 0;
        array = new String[size];
    }

    public void add(String value) {
        size = size + 1;
        String[] tempArray;
        tempArray = new String[size];

        for(int i=0; i< size - 1; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
        array[size - 1] = value;
    }
}
