package visitor.base;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Application {
    public static void main(String[] args) {
        Visitor visitor=new Company();
        ArrayList<Student> list=new ArrayList<Student>();
        Student student=null;
        list.add(student=new Undergraduate(88,67,"jinxd"));
        list.add(student=new Undergraduate(89,97,"jinry"));
        list.add(student=new Graduatestudent(100,100,100,"jinyc"));
        Iterator<Student> it=list.iterator();
        while(it.hasNext()){
            Student stu=it.next();
            stu.accept(visitor);
        }
    }
}
