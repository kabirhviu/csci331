package design.pattern.state.nopattern;

public class Door {
	public static enum State{
		CLOSED,
		OPENING,
		OPEN,
		CLOSING,
		STAYOPEN
	}
	
	private State state;
	
	public Door(State state) {
		setState(state);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void click() {
		switch(this.state) {
		case CLOSED:
			setState(State.OPENING);
			break;
		case OPENING:
		case STAYOPEN:
			setState(State.CLOSING);
			break;
		case OPEN:
			setState(State.STAYOPEN);
			break;
		case CLOSING:
			setState(State.OPENING);
		}
	}
	
	public void complete() {
		if(this.state == State.OPENING) {
			setState(State.OPEN);
		}
		else if(this.state == State.CLOSING) {
			setState(State.CLOSED);
		}
	}
	
	public void timeout() {
		if(this.state == State.OPEN) {
			setState(State.CLOSING);
		}
	}
}
