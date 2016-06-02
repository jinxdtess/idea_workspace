package ChinaOfResponsibility.test;

import ChinaOfResponsibility.Handler;
import ChinaOfResponsibility.impl.BeiJing;
import ChinaOfResponsibility.impl.Shanghai;
import ChinaOfResponsibility.impl.TianJin;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Application {
    private Handler beijing,shanghai,tianjin;
    //创建责任链
    public void createChain(){
        beijing=new BeiJing();
        shanghai=new Shanghai();
        tianjin=new TianJin();
        beijing.setNextHandler(shanghai);
        shanghai.setNextHandler(tianjin);
    }
    public void reponseClient(String number){
        beijing.handleRequest(number);
    }

    public static void main(String[] args) {
        Application app=new Application();
        app.createChain();
        app.reponseClient("77720810340930632");
    }
}
