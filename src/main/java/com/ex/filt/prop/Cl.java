package com.ex.filt.prop;

import org.springframework.beans.factory.annotation.Value;

public class Cl {
	@Value("${c}")
	String s;
	public void f() {
		System.out.println(s);
	}

}
