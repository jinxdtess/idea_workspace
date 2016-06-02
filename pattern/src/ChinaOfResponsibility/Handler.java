package ChinaOfResponsibility;

/**
 * Created by jinxd on 2016/6/1.
 */
public interface Handler {
    void handleRequest(String number);
    void setNextHandler(Handler handler);
}
