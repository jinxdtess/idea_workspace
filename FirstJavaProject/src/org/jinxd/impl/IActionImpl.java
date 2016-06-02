package org.jinxd.impl;

import org.jinxd.demo.IAction;

public class IActionImpl implements IAction {
    @Override
    public void say(String name) {
        System.out.println("hello "+name);
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
