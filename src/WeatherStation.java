import com.sun.org.glassfish.external.statistics.Statistic;

/**
 * Created by pc on 26.02.2017.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDIsplay statisticsDIsplay = new StatisticsDisplay(weatherData)
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(801,65,30.4f);
    }
}
