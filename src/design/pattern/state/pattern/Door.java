package design.pattern.state.pattern;

public class Door {
	
	private abstract class DoorState {
		protected Door door;
		public DoorState(Door door) {
			this.door = door;
		}
		public abstract void click();
		public abstract void complete();
		public abstract void timeout();
		public abstract String getState();
	}
	
	private class DoorClosed extends DoorState {

		public DoorClosed(Door door) {
			super(door);
		}

		@Override
		public void click() {
			door.setState(OPENING);
		}

		@Override
		public void complete() {
			// Do nothing
		}

		@Override
		public void timeout() {
			// Do nothing
		}

		@Override
		public String getState() {
			return "CLOSED";
		}
		
	}
	
	private class DoorOpen extends DoorState {

		public DoorOpen(Door door) {
			super(door);
		}

		@Override
		public void click() {
			door.setState(STAYOPEN);
		}

		@Override
		public void complete() {
			// Do nothing
		}

		@Override
		public void timeout() {
			setState(CLOSING);	
		}
		
		@Override
		public String getState() {
			return "OPEN";
		}
		
	}
	
	private class DoorClosing extends DoorState {

		public DoorClosing(Door door) {
			super(door);
		}

		@Override
		public void click() {
			door.setState(OPENING);
		}

		@Override
		public void complete() {
			door.setState(CLOSED);
		}

		@Override
		public void timeout() {
			// Do nothing
		}
		
		@Override
		public String getState() {
			return "CLOSING";
		}
		
	}
	
	private class DoorOpening extends DoorState {

		public DoorOpening(Door door) {
			super(door);
		}

		@Override
		public void click() {
			door.setState(CLOSING);
		}

		@Override
		public void complete() {
			door.setState(OPEN);
			
		}

		@Override
		public void timeout() {
			// Do nothing
		}
		
		@Override
		public String getState() {
			return "OPENING";
		}
		
	}
	
	private class DoorStayOpen extends DoorState {

		public DoorStayOpen(Door door) {
			super(door);
		}

		@Override
		public void click() {
			door.setState(CLOSING);
		}

		@Override
		public void complete() {
			// Do nothing
		}

		@Override
		public void timeout() {
			// Do nothing
		}
		
		@Override
		public String getState() {
			return "STAYOPEN";
		}
		
	}
	private final DoorState CLOSED = new DoorClosed(this);
	private final DoorState OPEN = new DoorOpen(this);
	private final DoorState CLOSING = new DoorClosing(this);
	private final DoorState OPENING = new DoorOpening(this);
	private final DoorState STAYOPEN = new DoorStayOpen(this);
	
	private DoorState state;
	
	public Door() {
		this.state = CLOSED;
	}
	
	public void setState(DoorState state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state.getState();
	}
	
	public void click() {
		this.state.click();
	}
	
	public void complete() {
		this.state.complete();
	}
	
	public void timeout() {
		this.state.timeout();
	}
}
