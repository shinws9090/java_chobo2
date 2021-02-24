package java_chobo2.ch12;

public enum Direction {
	EAST(1),SOUTH(5),WEST(10),NORTH(15);
	
	private final int value;
	
	private Direction(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
