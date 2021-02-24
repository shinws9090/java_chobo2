package java_chobo2.ch12;

public class TestMain4 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println(d1 + ":" + d2 + ":" + d3);

		System.out.println("d1==d3 >" + (d1 == d3));
		System.out.println("d1.equals(d2) : " + d1.equals(d2));
		System.out.println("d1.equals(d3) : " + d1.equals(d3));

		System.out.println("d1.compareTo(d2) : " + d1.compareTo(d2)); // o1-o2 compareTo
		System.out.println("d2.compareTo(d1) : " + d2.compareTo(d1));
		System.out.println("d1.compareTo(d3) : " + d1.compareTo(d3));

		
		switch (d1) {
		case EAST:
			System.out.println("동쪽");
			break;
		case WEST:
			System.out.println("서쪽");
			break;
		case SOUTH:
			System.out.println("남쪽");
			break;
		case NORTH:
			System.out.println("북쪽");
			break;
		default:
			System.out.println("???");
		}
		
		
		Direction[] dArr = Direction.values();
		for(Direction d : dArr) {
			System.out.println(d.name()+"  :  "+d.ordinal());
			System.out.println(d.name()+"  :  "+d.getValue());
		}
		
	}

}
