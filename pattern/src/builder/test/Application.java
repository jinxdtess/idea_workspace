package builder.test;

import builder.Builder;
import builder.Director;
import builder.impl.AmericanCalendarBuilder;
import builder.impl.ChineseCalendar;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Application {
    public static void main(String[] args) {
        Builder builder=new ChineseCalendar();
        Director director=new Director(builder,2016,6);
        director.constructProduct();

        builder=new AmericanCalendarBuilder();
        director=new Director(builder,2006,6);
        director.constructProduct();
    }
}
