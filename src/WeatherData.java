import java.util.ArrayList;

/**
* Created by pc on 25.02.2017.
*/
public class WeatherData implements Subject {
    private ArrayList observers;
    private float humidity;
    private float pressure;
    private float temperature;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i =0; i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }


    public void measurementsChanged()
    {
       notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
