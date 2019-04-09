package design.pattern.state.pattern;

public class Main {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println("Door State: " + door.getState());
		door.click();
		System.out.println("Door State: " + door.getState());
		door.complete();
		System.out.println("Door State: " + door.getState());
		door.timeout();
		System.out.println("Door State: " + door.getState());
		door.complete();
		System.out.println("Door State: " + door.getState());
	}

}
