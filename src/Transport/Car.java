package Transport;

import Transport.Auto;



import static Transport.Auto.*;

public class Car {
    public static void main(String[] args) {
    Auto lada = new Auto("Lada", "Granta", 1.7,new Key("Удаленный запуск двигателя.", "Бесключевой доступ."), "жёлтый", 2015, "России","автоматическая", "хэтчбек", 5, "летняя");
    Auto audi = new Auto("Audi", "A8 L TDI quatro", 3.0,new Key("Удаленный запуск двигателя.", "Бесключевой доступ."),  "черный", 2020, "Германии", "автоматическая", "седан", 5, "летняя");
    Auto bmv = new Auto("BMV", "Z8", 3.0,new Key("Удаленный запуск двигателя.", "Бесключевой доступ."), "черный", 2021, "Германии","автоматическая", "седан", 5, "зимняя");
    Auto kia = new Auto("KIA", "Sportage", 2.4,new Key("", "Бесключевой доступ.") ,"красный", 2018, "Южной Корее","автоматическая", "универсал", 5, "зимняя");
    Auto hyundai = new Auto("Hyundai", "Avante", 1.6,new Key("", ""), "оранжевый", 2016, "Южной Корее","автоматическая", "хэтчбек", 5, "летняя");

    kia.setCarNumber();
    kia.buyInsurance();
    System.out.println(kia.getCarNumber());
    System.out.println(kia.infoAboutInsurance());
    System.out.println(kia.checkInsurance());

}
}

