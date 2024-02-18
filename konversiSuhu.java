public class konversiSuhu {
    public static void main(String[] args) {
        double suhuReamur = 22;

        double suhuCelcius = reamurToCelcius(suhuReamur);
        double suhuFahrenheit = reamurToFahrenheit(suhuReamur);
        double suhuKelvin = reamurToKelvin(suhuReamur);

        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);

    }
    public static double reamurToCelcius(double suhuReamur){
        return suhuReamur * 5 / 4;
    }

    public static double reamurToFahrenheit(double suhuReamur){
        return suhuReamur * 9 / 4 + 32;    
    }
    public static double reamurToKelvin(double suhuReamur){
        return suhuReamur * 5 / 4 + 273.15;
    }
}