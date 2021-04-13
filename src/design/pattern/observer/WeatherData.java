package design.pattern.observer;

public class WeatherData {
	
	private int temperature;
	private int precipitation;
	private int humidity;
	private int wind;
	
	public WeatherData() {
		setTemperature(0);
		setPrecipitation(0);
		setHumidity(0);
		setWind(0);
	}
	
	public WeatherData(int temperature, int precipitation, int humidity, int wind) {
		setTemperature(temperature);
		setPrecipitation(precipitation);
		setHumidity(humidity);
		setWind(wind);
	}
	
	public WeatherData(WeatherData weatherdata) {
		setTemperature(weatherdata.getTemperature());
		setPrecipitation(weatherdata.getPrecipitation());
		setHumidity(weatherdata.getHumidity());
		setWind(weatherdata.getWind());
	}
	

	public int getTemperature() {
		return temperature;
	}


	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	public int getPrecipitation() {
		return precipitation;
	}


	public void setPrecipitation(int precipitation) {
		this.precipitation = precipitation;
	}


	public int getHumidity() {
		return humidity;
	}


	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}


	public int getWind() {
		return wind;
	}


	public void setWind(int wind) {
		this.wind = wind;
	}

}
