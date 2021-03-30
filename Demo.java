package com.cmru.java.lab.Lab5;

public class Demo {
	public void header(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|                   JAVA PROGRAM BY KRITIK AGARWAL 19BBTCS067                 |");
        System.out.println("-------------------------------------------------------------------------------");
    }

	public static void main(String[] args) {
		Demo d = new Demo();
		d.header();
		try {
			throw new UDE("I have created this exception.");
		} catch(UDE e) {
			System.out.println(e.getMessage());
		}
	}

}
