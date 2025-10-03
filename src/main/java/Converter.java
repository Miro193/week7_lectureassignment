
//Fahrenheit to Celsius
//Kelvin to Celsius
//Celsius to Kelvin
public class Converter {
    private double fahrenheit;
    private double celsius;
    private double kelvin;

    public Converter (double fahrenheit, double celsius, double kelvin) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return kelvin;
    }
}
