/**
 * 1 task
 */
public class fclass1 extends fclass2 {
    public static void main(String[] args) {
        fclass2 classInstance = new fclass2();

        System.out.println("Main method from extended class");
        System.out.println("Show counter value: " + classInstance.getCounter());

        classInstance.setCounter(25);

        System.out.println("\nShow counter value: " + classInstance.getCounter());
    }
}

/**
 * 2 task
 */
//public class fclass1 {
//    protected int counter = 0;
//
//    public static void main(String[] args) {
//        System.out.println("Main method from extended class");
//    }
//}