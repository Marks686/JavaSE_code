import java.util.Date;

public class TestDate {
    public int year;
    public int month;
    public int day;

    public void setDay(TestDate this,int y, int m, int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public void printDate(TestDate this){
        System.out.println(this.year+"-"+this.month+"-"+this.day);
    }

    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        testDate1.setDay(2022,8,18);
        testDate1.printDate();
    }


/*    public void setDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }*/
    public static void main2(String[] args) {
        TestDate testDate1 = new TestDate();
        TestDate testDate2 = new TestDate();
        TestDate testDate3 = new TestDate();

        testDate1.setDay(2022,8,16);
        testDate2.setDay(2022,8,17);
        testDate3.setDay(2022,8,18);

        testDate1.printDate();
        testDate2.printDate();
        testDate3.printDate();
    }
    public static void main1(String[] args) {
        TestDate testDate = new TestDate();
        testDate.year = 2022;
        testDate.month = 8;
        testDate.day = 4;
        testDate.printDate();

        testDate.setDay(2022,8,18);
        testDate.printDate();

    }

    public static void main2(String[] args) {

    }
}
