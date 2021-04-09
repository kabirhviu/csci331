package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableWeatherData extends WeatherData implements Subject {
	
	
	private List<Observer> observers;
	private boolean changed;
	
	private int temperature;
	private int precipitation;
	private int humidity;
	private int wind;
	
	
	public ObservableWeatherData() {
		super();
		observers = new ArrayList<Observer>();
		setChanged(false);	
		
	}
	
	public ObservableWeatherData(int temperature, int precipitation, int humidity, int wind) {
		super.setTemperature(temperature);
		super.setPrecipitation(precipitation);
		super.setHumidity(humidity);
		super.setHumidity(humidity);
		super.setWind(wind);
		observers = new ArrayList<Observer>();
		setChanged(false);	
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

	
	
	private void setChanged(boolean changed) {
		
		this.changed = changed;
		
	}
	
	@Override
	public void setTemperature(int temperature) {
		if(this.temperature != temperature) {
			super.setTemperature(temperature);
			setChanged(true);
			notifyObservers();
		}
	}
	
	@Override
	public void setPrecipitation(int precipitation) {
		if(this.precipitation != precipitation) {
			super.setPrecipitation(precipitation);
			setChanged(true);
			notifyObservers();
		}	
	}
	
	@Override
	public void setHumidity(int humidity) {
		if(this.humidity != humidity) {
			super.setHumidity(humidity);
			setChanged(true);
			notifyObservers();
		}
	}
	
	@Override
	public void setWind(int wind) {
		if(this.wind != wind) {
			super.setWind(wind);
			setChanged(true);
			notifyObservers();
		}
		
	}
	
	public void setWeatherData(int temperature, int precipitation, int humidity, int wind) {
		if(this.temperature != temperature) {
			super.setTemperature(temperature);
			setChanged(true);
		}
		if(this.precipitation != precipitation) {
			super.setPrecipitation(precipitation);
			setChanged(true);
		}	
		if(this.humidity != humidity) {
			super.setHumidity(humidity);
			setChanged(true);
		}
		if(this.wind != wind) {
			super.setWind(wind);
			setChanged(true);
		}
		if(isChanged() == true) {
			notifyObservers();
		}
		
	}
	

}
