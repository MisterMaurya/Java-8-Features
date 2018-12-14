package com.feature.java8new.functionalInterface;

public class MainFunctionClass {

	public static void main(String[] args) {

		DisplayFI displayFI = () -> System.out.println("Display Anything");
		displayFI.disp();

		FuncionReturnSomething funcionReturnSomething = () -> "Hi There";

		System.out.println(funcionReturnSomething.returnSomething());

		TakeOneArgument takeOneArgument = name -> System.out.println(name);
		takeOneArgument.printName("Mister ...");

		// Another way

		TakeOneArgument t1 = (name) -> System.out.println(name);
		t1.printName("Mister ...");

		TakeTwoArgument t2 = (name, salary) -> System.out.println(name + " " + salary);
		t2.dispInfo("Tarun", "20000");

	}

}
