package Collections;

public class MyArrayList {
    private String[] array = new String[5];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(String s){
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length*2];
            for (int i = 0; i < array.length; i++ ){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size-1; i++) {
                array[i] = array[i+1];
            }
            size--;
        } else {
            System.out.println("Element does not exist!");
        }
    }

    public void remove (String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        remove(index);
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Element does not exist!";
        }
    }
}