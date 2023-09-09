package web.model;

public class Car {
    int data;
    String model;
    double prise;

    public Car(int data, String model, double prise) {
        this.data = data;
        this.model = model;
        this.prise = prise;
    }
    //public record Car (int data, String model, double prise){}
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
