package design.pattern.observer;

public class WeatherObservers {

	public static void main(String[] args) {
		
		int temperature = 25;
		int precipitation = 4;
		int humidity = 50;
		int wind = 10;
		
		System.out.println("Observers responses at individual weather data change.....");
		
		ObservableWeatherData subject1 = new ObservableWeatherData(temperature, precipitation, humidity, wind);;
		CurrentWeather observer1 = new CurrentWeather(subject1);
		observer1.update(subject1);
		WeatherStatistics observer2 = new WeatherStatistics(subject1);
		observer2.update(subject1);
		
		
		
		for (int i = 0; i<5; i++) {
			temperature += 5;
			subject1.setTemperature(temperature);
			precipitation +=1;
			subject1.setPrecipitation(precipitation);
			humidity += 3;
			subject1.setHumidity(humidity);
			wind += 2;
			subject1.setWind(wind);
		}
		
		System.out.println("Observers responses at group weather data change.....");
		
		temperature = 25;
		precipitation = 4;
		humidity = 50;
		wind = 10;
		
		ObservableWeatherData subject2 = new ObservableWeatherData(temperature, precipitation, humidity, wind);;
		CurrentWeather observer3 = new CurrentWeather(subject2);
		observer1.update(subject2);
		WeatherStatistics observer4 = new WeatherStatistics(subject2);
		observer2.update(subject2);
		
		
		
		for (int i = 0; i<5; i++) {
			temperature += 5;
			precipitation +=1;
			humidity += 3;
			wind += 2;
			subject2.setWeatherData(temperature, precipitation, humidity, wind);
		}
	}

}
