package VehicleDemo;

public class Engin {
    private final String number_of_stroke;
    private final String enginNumber;

    public Engin(String enginNumber, String number_of_stroke) {
        this.number_of_stroke = number_of_stroke;
        this.enginNumber = enginNumber;
    }

    public String getNumber_of_stroke() {
        return number_of_stroke;
    }

    public String getEnginNumber() {
        return enginNumber;
    }
}
