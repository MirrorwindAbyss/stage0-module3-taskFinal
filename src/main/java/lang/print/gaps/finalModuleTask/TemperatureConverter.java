package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFahrenheit;
        temperatureFahrenheit = (float) ((temperatureCelsius *1.8)+32);
        System.out.println(temperatureFahrenheit);
    }
}
