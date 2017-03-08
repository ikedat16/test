package com.ne.jp;

import java.io.File;
import java.util.function.Function;

public class Hige {

	public static void main(String[] args) {

	}
	public int count(int i, int i2) {
		aa(a -> 1);
		return i + i2;
	}

	private void aa(Function<String, Integer> fa) {
		Function<String, File> f = s -> new File("/tmp", s);
		File file = f.apply("test2.txt");
		System.out.println(file);
	}
}
