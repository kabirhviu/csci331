package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatistics implements Observer {
	
	
	private List<WeatherData> history;
	private Observable subject;
	
	public WeatherStatistics (Observable subject) {
		history = new ArrayList<WeatherData>();
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(Observable subject) {
		if(this.subject == subject) {
			WeatherData copy = new WeatherData(subject);
			history.add(copy);
			WeatherData average = getAverage();
			display(average);
		}
	}
	
	public WeatherData getAverage() {
		WeatherData stat = new WeatherData();
		for(WeatherData wdata: history) {
			stat.setTemperature(stat.getTemperature() + wdata.getTemperature());
			stat.setPrecipitation(stat.getPrecipitation() + wdata.getPrecipitation());
			stat.setHumidity(stat.getHumidity() + wdata.getHumidity());
			stat.setWind(stat.getWind() + wdata.getWind());
		}
		int historySize = history.size();
		stat.setTemperature(stat.getTemperature()/historySize);
		stat.setPrecipitation(stat.getPrecipitation()/historySize);
		stat.setHumidity(stat.getHumidity()/historySize);
		stat.setWind(stat.getWind()/historySize);
		
		return stat;
	}
	
	public void display(WeatherData subject) {
		System.out.println("\nCurrent Average...........................................\n");
		System.out.println("\nTemperature: " + subject.getTemperature() +
				", Precipitation: " + subject.getPrecipitation() +
				", Humidity: " + subject.getHumidity() + 
				", Wind: " + subject.getWind() + 
				"\n");
	}
		

}
