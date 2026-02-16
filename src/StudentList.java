public class StudentList {
    private static final int NOT_FOUND = -1;
    private final static int CAPACITY = 4;
    private Student[] list;
    private int size;


    public StudentList(){
        list = new Student[CAPACITY];
        size = 0;
    }

    private int find (Student student){
        for(int i = 0;i <size; i ++){
            if(list[i].equals(student)){
                return i;
            }
        }
        return NOT_FOUND;
    }

    private void grow() {
        Student[] tempList = new Student[list.length * 2];
        for (int i= 0; i < size; i++){
           tempList[i] = list[i];
        }

        list = tempList;
    } //resize the array

    public void add(Student student) {
        if (size == list.length) {
            grow();
        }
        list[size] = student;
        size++;
    }


    //add to end of array
    public void remove(Student student) {
        int ind = find(student);
        if (ind == NOT_FOUND) { return; }

        list[ind] = list[size - 1];
        list[size-1] = null;
        size--;


    } //replace with last one

    public boolean contains(Student student) {
        if (find(student) == NOT_FOUND){ return false;}
        else { return true; }
    }

    public void print() {
        if (size == 0) {
            System.out.print("Empty list.");
        } else {
            for (int i = 0; i  < size - 1; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (list[j].compareTo(list[j+1]) > 0) {
                        Student temp = list[j];
                        list[j] = list[j+1];
                        list[j+1] = temp;
                    }
                }
            }
        }

        for( int i = 0; i < size; i ++){
            System.out.print(list[i]);
        }
    } //sort by last/first name, then dob
}