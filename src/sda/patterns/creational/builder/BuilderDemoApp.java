package sda.patterns.creational.builder;

import java.util.List;

public class BuilderDemoApp {
    public static void main(String[] args) {
        House smallhouse = new House.HouseBuilder("bloczki","Max","Blacha")
                .build();
        House houseWithGarage = new House.HouseBuilder("bloczki", "Ytong","Dachówka")
                .withGarage("w bryle budynku")
                .build();
        House houseWithGarden = new House.HouseBuilder("wylewany", "cegła","Papodachówka")
                .withGarden("mały ogródek")
                .build();
        House houseWithGardenAndGarage = new House.HouseBuilder("bloczki", "bale","słoma")
                .withGarden("duży ogród z basenem")
                .withGarage("zewnętrzny dwustanowiskowy")
                .build();
        House houseWithGarageAndGarden = new House.HouseBuilder("wylewany", "Ytong","dachówka")
                .withGarage("w piwnicy")
                .withGarden("łąka i las")
                .build();

        List<House> houses = List.of(smallhouse,houseWithGarage,houseWithGarden,houseWithGardenAndGarage,houseWithGarageAndGarden);
        System.out.println("Lista domów");
        houses.forEach( x -> System.out.println(x.getInfo()));
    }
}
