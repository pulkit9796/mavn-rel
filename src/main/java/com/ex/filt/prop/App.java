package com.ex.filt.prop;

import org.springframework.beans.factory.annotation.Value;

/**
 * Hello world!
 *
 */class Cll {
		@Value("${c}")
		String s;
		public void f() {
			System.out.println(s);
		}
 }
public  class App 
{
	 
    public static void main( String[] args )
    {
    	
        System.out.println( "Helllllo World!");
        Cll cc=new Cll();
        cc.f();
    }
}
