package Creational.Singleton;

//Initialization Demand Holder (IoDH)
public class Method5 {

    private Method5() {
    }

    private static class HolderClass {
        private final static Method5 singeInstance = new Method5();
    }

    public static Method5 getInstance() {
        return HolderClass.singeInstance;
    }

    public static void main(String[] args) {
        Method5 m1, m2;
        m1 = Method5.getInstance();
        m2 = Method5.getInstance();
        System.out.println(m1 == m2);
    }
}
