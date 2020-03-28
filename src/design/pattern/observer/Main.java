package design.pattern.observer;

public class Main {

	public static void main(String[] args) {
		
		WeatherDataObservable subject = new WeatherDataObservable();
		CurrentWeather observer1 = new CurrentWeather(subject);
		WeatherStatistics observer2 = new WeatherStatistics(subject);
		
		int temperature = 25;
		int precipitation = 4;
		int humidity = 50;
		int wind = 10;
		
		for (int i = 0; i<5; i++) {
			subject.setWeatherData(temperature, precipitation, humidity, wind);
			temperature += 5;
			precipitation +=1;
			humidity += 3;
			wind += 2;
		}
	}

}
