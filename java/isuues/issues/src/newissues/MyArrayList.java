package newissues;
import java.util.ArrayList;
import java.util.Date;

public class MyArrayList {
    private ArrayList<Date> dates;

    public MyArrayList() {
        this.dates = new ArrayList<>();
    }

    public void addDate(Date date) {
        dates.add(date);
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyArrayList)) return false;

        MyArrayList other = (MyArrayList) obj;
        return this.dates.equals(other.dates);
    }
}
