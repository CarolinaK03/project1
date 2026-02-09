public class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;

    public boolean isValid(){

    }

    public boolean isLeap(int year){
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else { return false; }
            } else { return true; }
        } else { return false; }
    }

}
