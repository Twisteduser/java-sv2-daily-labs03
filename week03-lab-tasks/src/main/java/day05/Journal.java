package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> names = new ArrayList<>();

    public List<String> getNames() {
        return names;
    }

    public boolean addStudent (String studentName){
        if (studentName.contains(" ")){
            names.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("Peti"));
        System.out.println(journal.addStudent("Laci"));
        System.out.println(journal.addStudent("Kis Peti"));
        System.out.println(journal.addStudent("Nagy Ferenc"));
        System.out.println(journal.getNames());
    }
}