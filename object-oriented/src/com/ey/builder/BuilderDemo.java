package com.ey.builder;

import com.ey.builder.Computer.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		Computer pc1 = new Computer.Builder().build();
        System.out.println("Default Computer: " + pc1);

        // Create a custom computer
        Builder pc2 = new Computer.Builder().cpu("i7").gpu("Randon Vega Mobile 8");
        System.out.println("Custom Computer: " + pc2);
	}
}
