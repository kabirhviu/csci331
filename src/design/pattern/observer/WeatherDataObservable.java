package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements Observable {
	
	
	private List<Observer> observers;
	private boolean changed;
	
	private int temperature;
	private int precipitation;
	private int humidity;
	private int wind;
	
	
	public WeatherDataObservable() {
		observers = new ArrayList<Observer>();
		setChanged(false);	
		setTemperature(0);
		setPrecipitation(0);
		setHumidity(0);
		setWind(0);
	}

	@Override
	public void registerObserver(Observer observer) {
		if(observer != null) {
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer != null) {
			observers.remove(observer);
		}
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(this);
		}
	}

	@Override
	public boolean isChanged() {
		return changed;
	}

	@Override
	public int getTemperature() {
		return temperature;
	}

	@Override
	public int getPrecipitation() {
		return precipitation;
	}

	@Override
	public int getHumidity() {
		return humidity;
	}

	@Override
	public int getWind() {
		return wind;
	}

	
	public void setWeatherData(int temperature, int precipitation, int humidity, int wind) {
		setChanged(false);
		setTemperature(temperature);
		setPrecipitation(precipitation);
		setHumidity(humidity);
		setHumidity(humidity);
		setWind(wind);
		if (isChanged()) {
			notifyObservers();
		}
	}
	
	private void setChanged(boolean changed) {
		
		this.changed = changed;
		
	}
	
	private void setTemperature(int temperature) {
		if(this.temperature != temperature) {
			this.temperature = temperature;
			setChanged(true);
		}
	}
	
	private void setPrecipitation(int precipitation) {
		if(this.precipitation != precipitation) {
			this.precipitation = precipitation;
			setChanged(true);
		}	
	}
	
	private void setHumidity(int humidity) {
		if(this.humidity != humidity) {
			this.humidity =humidity;
			setChanged(true);
		}
	}
	
	private void setWind(int wind) {
		if(this.wind != wind) {
			this.wind = wind;
			setChanged(true);
		}
		
	}

}
