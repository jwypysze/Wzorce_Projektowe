package sda.patterns.structural.flywejght;

import sda.patterns.creational.abstractFactory.Ford;

import java.util.List;

public class FlyweightDemoApp {
    public static void main(String[] args) {
        FordMustang mustang1 = new FordMustang("MidnightSky", "4.5", "Denon");
        FordMustang mustang2 = new FordMustang("RubyRed", "4.0", "Denon");
        FordMustang mustang3 = new FordMustang("MidnightSky", "3.5", "Sony");
        FordMustang mustang4 = new FordMustang("BlackPanther", "3.5", "Embed");
        FordMustang mustang5 = new FordMustang("MidnightSky", "4.5", "Denon");

        List<FordMustang> mustangList = List.of(mustang1, mustang2, mustang3, mustang4, mustang5);

        System.out.println("========================");

        mustangList.forEach(each -> System.out.println(each.getCarInfo()));

        System.out.println("========================");
        System.out.println("Sprawdzamy elementy base:");
        System.out.println("Ilość" + MustangBaseFactory.getFordMustangBaseSet().size());
        MustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(each -> System.out.println(each.getColor() + " " + each.getEngine()));


    }
}

