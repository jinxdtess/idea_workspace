package ChinaOfResponsibility.impl;

import ChinaOfResponsibility.Handler;

import java.util.ArrayList;

/**
 * Created by jinxd on 2016/6/1.
 */
public class TianJin implements Handler {
    private Handler handler;
    private ArrayList<String> numberList;
    public TianJin(){
        numberList=new ArrayList<String>();
        numberList.add("10029812340930034");
        numberList.add("20020810340430632");
        numberList.add("30029812340930034");
        numberList.add("50020810340930632");
    }
    @Override
    public void handleRequest(String number) {
        if(numberList.contains(number)){
            System.out.println("该人在天津居住");
        }else{
            System.out.println("该人不在天津居住");
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
