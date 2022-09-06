package entities.enums;

public enum WorkerLevel {
	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3);
	
	private final int value;
	
	WorkerLevel(int i) {
		this.value = i;
	}

	public int getValue() {
		return this.value;
	}
	
	
}
