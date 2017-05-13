package com.ne.jp;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import jdk.nashorn.internal.parser.JSONParser;

public class Hige {

	public static void main(String[] args) {
//		new Hige().optional(Optional.ofNullable("abc"));
//		new Hige().count(2, 2);
		new Hige().sampleStream();
	}
	public int count(int i, int i2) {
//		aa(a -> a.length());
		return i + i2;
	}

	private void aa(Function<String, Integer> fa) {
		Function<String, File> f = s -> new File("/tmp2", s);
		File file = f.apply("test2.txt");
		System.out.println(file);
		System.out.println(fa.apply("teststr"));
		System.out.println("master mod3");
	}

	private void optional(Optional<String> o) {
		System.out.println(o.isPresent());
		System.out.println(o.get());
		o.ifPresent(s -> System.out.println(s));
		System.out.println(o.orElseGet(() -> "ooo"));
		o.orElseThrow(() -> new RuntimeException());
		System.out.println(o.map(a -> "else").get());
		System.out.println("optional test");
	}
	
	private void sampleStream() {
		IntStream.range(0, 10).mapToObj(i -> "str").forEach(System.out::println);
		Stream.generate(() -> "abc").limit(10).forEach(System.out::println);
		System.out.println(Arrays.asList(Stream.generate(() -> "@@@").limit(10).toArray(String[]::new)));
		System.out.println(Stream.of("a", "b", "c").collect(Collectors.joining(", ")));
		Stream<String> s = Stream.of("a", "b", "c");
		Stream.builder().add("aa").build();
	}

}
