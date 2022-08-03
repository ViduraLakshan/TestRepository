package VehicleDemo;

public class Engin {
    private String number_of_stroke;
    private String enginNumber;

    public Engin(String number_of_stroke, String enginNumber) {
        this.number_of_stroke = number_of_stroke;
        this.enginNumber = enginNumber;
    }

    public String getNumber_of_stroke() {
        return number_of_stroke;
    }

    public String getEmginNumber() {
        return enginNumber;
    }
}
