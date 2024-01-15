class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {// constructor
        this.month = month;// initilize
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;// stores the names
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;// return value

    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String displayDate() {

        return month + "/" + day + "/" + "/" + year;

    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1, 13, 2024);
        System.out.println(date.displayDate());
    }
}


