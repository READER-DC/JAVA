
public class Date {
    
    private int day;
    private int month;
    private int year;

    public Date( int day, int month, int year) throws InvalidDate {
        this.day = day;
        this.month = month;
        this.year = year;

        this.validate(day, month, year);
    }

    public Date () {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public void validate (int day, int month, int year) throws InvalidDate {

        int daysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ( this.month <= 0 || this.month > 12 ) {
            throw new InvalidDate("value Invalid  'Month' ");
        }

        if ( day > daysInMonth[month-1] || day <= 0) {
            throw new InvalidDate("value Invalid  'Day' ");
        }

        if ( this.year <= 0 ) {
            throw new InvalidDate("value Invalid  'Year' ");
        }

        if ( this.year % 4 == 0 && ( this.year % 100 != 0 || this.year % 400 == 0)) {
            daysInMonth[1] += 1;
        } else {
            daysInMonth[1] = 28;
        }
    }

    public String toString(){
        return day + "." + month + "." + year;

    }

    int getDay() {
        return day;
    }
    int getMonth() {
        return month;
    }
    int getYear() {
        return year;
    }
}