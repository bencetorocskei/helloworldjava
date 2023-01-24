package com.codecool.helloworld.hello.util;

public class Helloer{
	private final String msg;
	
	public Helloer(String whom){
		this.msg = "Hello " + whom + "!";
		
	}
	
	public void sayHello(){
		System.out.println(msg);
		System.out.println("and Good Bye!")
	}
	}
