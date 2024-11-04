package Tasks.Store;

public class Main {
    public static void main(String[] args) {

        ElecGoods el = new ElecGoods("НоутБук", 2500.0, 2);
        Cloth cl = new Cloth("Куртка", 2500.00, "M");


        System.out.println("Электронные товары:");
         el.displayInfo();
        System.out.println("Одежда:");
        cl.displayInfo();
    }
}
