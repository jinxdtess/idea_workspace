package builder;

import javax.swing.*;
import java.util.Calendar;

/**
 * Created by jinxd on 2016/6/1.
 */
public class CalendarProduct {
    public Calendar calendar;
    public String title;                 //日历牌的标题
    public String[] weekTitle;           //日历牌的星期标题
    public String[][] dayOfMonth;
    public int year=2016,month=6;
    public void showCalendarPad(){
        JTable table;
        //JTable的构造方法JTable(cellData,columnNames)
        table=new JTable(dayOfMonth,weekTitle);
        JDialog dialog=new JDialog();
        dialog.setTitle(title);
        dialog.add(new JScrollPane(table));
        //前两个参数表示对话框在窗口左上角的坐标，后两个参数表示对话框的长和宽
        dialog.setBounds(130,160,220,180);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
