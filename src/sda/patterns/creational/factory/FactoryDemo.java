package sda.patterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {

        /**
         * Factory polega na tym, że rodzina obiektów jest tworzona w ramach jednego wspólnego
         * punktu wejścia - zamiast tworzyć obiekt w "main" zlecamy jego utworzenie
         * do metody, która "wie" jak to zrobić
         */

        MacBook mac1 = MacBookFactory.getMack("Air", 256,512,13);
        MacBook mac2 = MacBookFactory.getMack("pro", 512,1024,13);
        MacBook mac3 = MacBookFactory.getMack("Classic", 128,512,14);

    }
}
