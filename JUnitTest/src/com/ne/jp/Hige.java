package com.ne.jp;

import java.io.File;
import java.util.Optional;
import java.util.function.Function;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Hige {

	public static void main(String[] args) {
		new Hige().optional(Optional.ofNullable("abc"));
//		new Hige().count(2, 2);
	}
	public int count(int i, int i2) {
		aa(a -> a.length());
		return i + i2;
	}

	private void aa(Function<String, Integer> fa) {
		Function<String, File> f = s -> new File("/tmp2", s);
		File file = f.apply("test2.txt");
		System.out.println(file);
		System.out.println(fa.apply("teststr"));
		System.out.println("master mod2");
	}

	private void optional(Optional<String> o) {
		System.out.println(o.isPresent());
		System.out.println(o.get());
		o.ifPresent(s -> System.out.println(s));
		System.out.println(o.orElseGet(() -> "ooo"));
		o.orElseThrow(() -> new RuntimeException());
		System.out.println(o.map(a -> a).get());
	}
}
