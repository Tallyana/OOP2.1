package Transport;

import java.security.Key;

public  class Auto {
    public String getBodyType() {
        return bodyType;
    }

    public String getBrand() {
        return brand;
    }

    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getNumber() {
        return number;
    }

    public String getTransmission() {
        return transmission;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public int getYear() {
        return year;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void switchRubber() {
        setSummerRubber(!this.isSummerRubber);
    }

    private void setSummerRubber(boolean b) {
    }

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String color;
    private final String bodyType;
    private final double engineVolume;
    private boolean isSummerRubber;
    private static final String noInfo = "Информация не указана";

    private String transmission;
    private String number;
    private int seatCount;


    private Key key;
    private Insurance insurance;

    public Auto(String brand, String model, int year, String country, String color, String bodyType, boolean isSummerRubber,
                String transmission, String number, int seatCount, double engineVolume) {

        if (brand == null || brand.isEmpty()) this.brand = noInfo;
        else this.brand = brand;
        if (model == null || model.isEmpty()) this.model = noInfo;
        else this.model = model;
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) this.color = "белый";
        else this.color = color;
        if (year <= 0) this.year = 2000;
        else this.year = year;
        if (country == null || country.isEmpty()) this.country = noInfo;
        else this.country = country;
        if (bodyType == null || bodyType.isEmpty()) this.bodyType = noInfo;
        else this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвет кузова, объём двигателя -" + engineVolume + " л.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) return true;
            Auto auto = (Auto) obj;
            return brand.equals(((Auto) obj).brand) && engineVolume == ((Auto) obj).engineVolume && color.equals(((Auto) obj).color) && country.equals(((Auto) obj).country) && model.equals(((Auto) obj).model) && year == (((Auto) obj).year);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(brand, engineVolume, model, color, country, year);
    }

    public void setCarNumber() {
    }

    public void buyInsurance() {
    }

    public boolean getCarNumber() {
        return false;
    }

    public boolean infoAboutInsurance() {
        return false;
    }

    public boolean checkInsurance() {
        return false;
    }


}


