public class Date implements Comparable<Date> {
    private final int year;
    private final int month;
    private final int day;

    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUARTERCENTENNIAL = 400;
    public static final int MAXDAYSINAMONTH = 31;
    public static final int MONTHS = 12;
    public static final int DAYSINAMONTH = 30;
    public static final int DAYSINLEAPFEB = 28;
    public static final int FEB = 2;
    public static final int[] MONTHS30DAYS = {2, 4, 5, 9, 11};

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean isValid() {
        // checking year & 16 or older
        if (year > 2026 || year <= 0) {
            return false;
        }
        //checking age > 16
        if (2026 - year < 16) {
            return false;
        }
        if (year == 2010) {
            if ((month > FEB) || (month == FEB && day > 11)) {
                return false;
            }
        }
        // checking month
        if (month > MONTHS || month <= 0) {
            return false;
        }
        // checking day
        if (day < 1 || day > MAXDAYSINAMONTH) {
            return false;
        }
        // checking feb
        if (month == FEB) {
            if (isLeap(year) && day > 29) {
                return false;
            } else {
                return day <= DAYSINLEAPFEB;
            }
        }
        // checking months w 30 days
        for (int n : MONTHS30DAYS) {
            if (n == month) {
                return day <= DAYSINAMONTH;
            }
        }
        // for months w 31 days, all other conditions checked:
        return day <= MAXDAYSINAMONTH;
    }

    public boolean isLeap ( int year){
        if (year % QUADRENNIAL == 0) {
            if (year % CENTENNIAL == 0) {
                return year % QUARTERCENTENNIAL == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public int compareTo (Date other){

        if (this.year != other.year){
            return this.year - other.year;
        }

        if (this.month != other.month){
            return this.month - other.month;
        }

        return this.day - other.day;
    }

    @Override
    public String toString () {
        return month + "/" + day + "/" + year + "/";
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) return false;

        if (! (obj instanceof Date other)) return false;

        return this.day == other.day && this.month == other.month && this.year == other.year;

    }



}