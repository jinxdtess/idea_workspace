package factoryMethod;

/**
 * Created by jinxd on 2016/6/1.
 */
public class ParaDrugCreater implements DrugFactory {
    @Override
    public Drug getDrug() {
        int[] a={250,15,1,10};
        Drug drug=new Paracetamol("氨加黄敏胶囊",a);
        return drug;
    }
}
