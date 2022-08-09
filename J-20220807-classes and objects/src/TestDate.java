public class TestDate {
    public int year;//年
    public int month;//月
    public int day;//日

   public void setDay(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
/*    public void setDay(int y,int m, int d){
        year = y;
        month = m;
        day = d;
    }*/
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }

    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        TestDate testDate2 = new TestDate();
        TestDate testDate3 = new TestDate();

        testDate1.setDay(2022,8,4);
        testDate2.setDay(2023,8,4);
        testDate3.setDay(2024,8,4);

        testDate1.printDate();
        testDate2.printDate();
        testDate3.printDate();
    }


    public static void main1(String[] args) {
        TestDate testDate = new TestDate();

        testDate.setDay(2022,8,4);
        /*testDate.year = 2022;
        testDate.month = 8;
        testDate.day = 4;*/

        testDate.printDate();
        //System.out.println("fda");
    }
}
