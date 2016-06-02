package ChinaOfResponsibility.impl;

import ChinaOfResponsibility.Handler;

import java.util.ArrayList;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Shanghai implements Handler {
    private Handler handler;
    private ArrayList<String> numberList;
    public Shanghai(){
        numberList=new ArrayList<String>();
        numberList.add("34529812340930034");
        numberList.add("98720810340430632");
        numberList.add("36529812340930034");
        numberList.add("77720810340930632");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在上海居住");
        }else{
            System.out.println("该人不在上海居住");
            if(handler!=null){
               handler.handleRequest(number);
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
           this.handler=handler;
    }
}
