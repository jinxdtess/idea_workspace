package ChinaOfResponsibility.impl;

import ChinaOfResponsibility.Handler;

import java.util.ArrayList;

/**
 * Created by jinxd on 2016/6/1.
 */
public class BeiJing implements Handler {
    private Handler handler;
    private ArrayList<String> numberList;
    public BeiJing(){
        numberList=new ArrayList<String>();
        numberList.add("11129812340930034");
        numberList.add("10120810340930632");
        numberList.add("22029812340930034");
        numberList.add("32620810340930632");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在北京居住");
        }else {
            System.out.println("该人不在北京居住");
            if(handler!=null){
                //将请求传递给下一个处理者
                handler.handleRequest(number);
            }
        }

    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }
}
