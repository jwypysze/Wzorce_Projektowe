package sda.patterns.creational.singleton;

import com.sun.jdi.PrimitiveValue;

/**
 * LazySingleton czyli od słowa Lazy tworzony przy pierwszej próbie użycia obiektu
 *
 * LazySingleton nie może być używany w aplikacji wielowątkowej EGZAMIN
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;
    private LazySingleton(){
        System.out.println("Konstruktor LazySingleton");
    }
    public static LazySingleton getInstance(){
        System.out.println("Pobieramy instancję LazySingleton");
        if (INSTANCE == null){
            //dajmy na to że w tym miejscu 1 wątek został zatrzymany i uruchamia się drugi
            //no to drugi przeleci cały program, wygeneruje nową instancję
            //potem pierwszy się ponownie obudzi i kończy działanie - robi sout() i nowy obiekt

            //i tak mogą powstać 2 obiekty a chcemy tylko 1
            //dlatego LazySingleton nie używa się w wielowątkowych!!!
            System.out.println("Null więc wywołujemy konstruktor");
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
