package factoryMethod;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Application {
    public static void main(String[] args) {
       DrugFactory factory=new ParaDrugCreater() ;
        Drug drug=factory.getDrug();
        System.out.println(drug.getName()+"的成分：");
        System.out.println(drug.getConsitute());
    }
}