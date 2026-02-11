public class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;

    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUARTERCENTENNIAL = 400;
    //public static final int JAN = Calendar.JANUARY + 1;//Calendar.JANUARY is 0
    public static final int MAXDAYSINAMONTH = 31;
    public static final int MONTHS = 12;
    public static final int DAYSINAMONTH = 30;
    public static final int DAYSINLEAPFEB = 28;
    public static final int FEB = 2;
    public static final int[] MONTHS30DAYS = {2,4,5,9,11};
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean isValid() {
        // checking year
        if (year > 2026 || year <= 0) {
            return false;
        }
        // checking month
        if (month > 12 || month <= 0) {
            return false;
        }
        // checking day
        if (day < 1 || day > 31) {
            return false;
        }
        // checking feb
        if (month == 2) {
            if (isLeap(year) && day > 29) {
                return false;
            } else {
                return day <= 28;
            }
        }
        // checking months w 30 days
        for (int n : MONTHS30DAYS) {
            if (n == month) {
                return day <= 30;
            }
        }
        // for months w 31 days, all other conditions checked:
        return day <= 31;

    }

    public boolean isLeap(int year){
        if (year % QUADRENNIAL == 0){
            if(year % CENTENNIAL == 0){
                if(year % QUARTERCENTENNIAL == 0){
                    return true;
                } else { return false; }
            } else { return true; }
        } else { return false; }
    }
}
