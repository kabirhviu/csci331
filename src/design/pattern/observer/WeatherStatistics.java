package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatistics implements Observer {
	
	
	private Subject subject;
	private List<WeatherData> history;
	
	
	public WeatherStatistics (Subject subject) {
		this.subject = subject;
		history = new ArrayList<WeatherData>();
		this.subject.registerObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if(this.subject == subject) {
			WeatherData copy = new WeatherData(subject);
			history.add(copy);
			WeatherData average = getAverage();
			display(average);
		}
	}
	
	public WeatherData getAverage() {
		WeatherData statistics = new WeatherData();
		for(WeatherData wdata: history) {
			statistics.setTemperature(statistics.getTemperature() + wdata.getTemperature());
			statistics.setPrecipitation(statistics.getPrecipitation() + wdata.getPrecipitation());
			statistics.setHumidity(statistics.getHumidity() + wdata.getHumidity());
			statistics.setWind(statistics.getWind() + wdata.getWind());
		}
		int historySize = history.size();
		statistics.setTemperature(statistics.getTemperature()/historySize);
		statistics.setPrecipitation(statistics.getPrecipitation()/historySize);
		statistics.setHumidity(statistics.getHumidity()/historySize);
		statistics.setWind(statistics.getWind()/historySize);
		
		return statistics;
	}
	
	public void display(WeatherData statistics) {
		System.out.println("\nCurrent Average...........................................\n");
		System.out.println("\nTemperature: " + statistics.getTemperature() +
				", Precipitation: " + statistics.getPrecipitation() +
				", Humidity: " + statistics.getHumidity() + 
				", Wind: " + statistics.getWind() + 
				"\n");
	}
		

}
