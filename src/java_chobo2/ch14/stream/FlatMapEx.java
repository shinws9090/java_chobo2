package java_chobo2.ch14.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapEx {
	public static void main(String[] args) {
		String[][] strArrs = {{"abc","def","jkl"},{"ABC","GHI","JKL"}};
		Stream<String[]> strArrStream = Stream.of(strArrs);
		Stream<Stream<String>> strStreamStream = strArrStream.map(Arrays::stream);
		strStreamStream.forEach(a->System.out.println(a));
		
		strArrStream = Stream.of(strArrs);
		Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
		System.out.println();
		
		strStream.map(String::toLowerCase).distinct().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		
	}
}
