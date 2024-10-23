package newissues;

import java.sql.Date;
import java.util.Collections;
import java.util.Comparator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<MyArrayList> logs = new LinkedList<>();

        // Example data
        MyArrayList list1 = new MyArrayList();
        list1.addDate(new Date(1622505600000L)); // Example date
        logs.add(list1);

        MyArrayList list2 = new MyArrayList();
        list2.addDate(new Date(1640995200000L)); // Example date
        logs.add(list2);

        MyArrayList list3 = new MyArrayList();
        list3.addDate(new Date(1633046400000L)); // Example date
        logs.add(list3);

        // Sort the LinkedList
        Collections.sort(logs, new Comparator<MyArrayList>() {
            @Override
            public int compare(MyArrayList o1, MyArrayList o2) {
                // Assuming we want to compare based on the first date in each MyArrayList
                if (o1.getDates().isEmpty() || o2.getDates().isEmpty()) {
                    return 0;
                }
                return o1.getDates().get(0).compareTo(o2.getDates().get(0));
            }
        });

        // Print sorted LinkedList
        for (MyArrayList log : logs) {
            System.out.println(log.getDates());
        }
    }
}
