package January.Assignment1;
public class Time
{
    private int hr;
    private int min;

    public Time()
    {
        this.hr = 0;
        this.min = 0;
    }

    public Time(int h, int m) {
        if ((h >= 0) && (h <= 23))
            this.hr = h;
        else {
            this.hr = 0;
        }
        if ((m >= 0) && (m <= 59))
            this.min = m;
        else
            this.min = 0;
    }

    public String toString()
    {
        if ((this.hr >= 0) && (this.hr <= 9) && (this.min >= 0) && (this.min <= 9))
            return "0" + this.hr + "0" + this.min;
        if ((this.hr >= 0) && (this.hr <= 9) && ((this.min < 0) || (this.min > 9)))
            return "0" + this.hr + this.min;
        if (((this.hr < 0) || (this.hr > 9)) && (this.min >= 0) && (this.min <= 9)) {
            return this.hr + "0" + this.min;
        }
        return "" + this.hr + this.min;
    }

    public String convert()
    {
        if ((this.hr >= 13) && (this.hr <= 23))
        {
            if ((this.min >= 0) && (this.min <= 9)) {
                return "" + (this.hr - 12) + ":" + "0" + this.min + " PM";
            }
            return "" + (this.hr - 12) + ":" + this.min + " PM";
        }
        if (this.hr == 0)
        {
            if ((this.min >= 0) && (this.min <= 9)) {
                return "12:0" + this.min + " AM";
            }
            return "12:" + this.min + " AM";
        }
        if (this.hr == 12)
        {
            if ((this.min >= 0) && (this.min <= 9)) {
                return "12:0" + this.min + " PM";
            }
            return "12:" + this.min + " PM";
        }

        if ((this.min >= 0) && (this.min <= 9)) {
            return "" + this.hr + ":" + "0" + this.min + " AM";
        }
        return "" + this.hr + ":" + this.min + " AM";
    }

    public void increment()
    {
        if ((this.hr == 23) && (this.min == 59))
        {
            this.hr = 0;
            this.min = 0;
        }
        else if (this.min == 59)
        {
            this.hr += 1;
            this.min = 0;
        }
        else {
            this.min += 1;
        }
    }
}