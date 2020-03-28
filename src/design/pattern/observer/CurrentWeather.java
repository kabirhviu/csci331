package design.pattern.observer;

public class CurrentWeather implements Observer {
	
	private Observable subject;
	
	public CurrentWeather(Observable subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(Observable subject) {
		if(this.subject == subject) {
			display(subject);
		}	
	}
	
	public void display(Observable subject) {
		System.out.println("\nCurrent Weather...........................................\n");
		System.out.println("\nTemperature: " + subject.getTemperature() +
				", Precipitation: " + subject.getPrecipitation() +
				", Humidity: " + subject.getHumidity() + 
				", Wind: " + subject.getWind() + 
				"\n");
	}

}
