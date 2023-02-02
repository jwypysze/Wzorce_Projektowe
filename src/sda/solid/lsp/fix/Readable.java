package sda.solid.lsp.fix;

public interface Readable {

    byte[] read(String filename);

    /**
     * poniższe to prezentacja możliwości interfejsu a nie zasada Liskov
     */


    default void someNonAbstractMethod(){
        System.out.println("Non abstract method called from interface");
    }

    static void someStaticMethod(){
        System.out.println("Call static");
    }


    private void somePrivateMethod(){
        System.out.println("Private call");
    }
}
