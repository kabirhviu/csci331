package design.pattern.observer;

public interface Observable {
	
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
	boolean isChanged();
	int getTemperature();
	int getPrecipitation();
	int getHumidity();
	int getWind();

}
