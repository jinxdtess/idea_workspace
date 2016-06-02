package builder;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Director {
    private Builder builder;
    private int year,month;
    public  Director(Builder builder,int year,int month){
        this.builder=builder;
        this.year=year;
        this.month=month;
    }
    public void constructProduct(){
        boolean ok=false;
        ok=builder.buildWeekTitle();
        if(ok){
            ok=builder.buildCalendar(year,month);
        }
        if(ok){
            builder.buildTitle();
            builder.buildDayOfMonth();
        }
        if(ok){
           CalendarProduct product=builder.getCalendarProduct();
            product.showCalendarPad();
        }
    }
}
