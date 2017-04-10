package org.zeroturnaround.jf.examples;

import java.lang.reflect.Method;

public class Ex1_Basics {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = SomeClass.class;

		// check if clazz implement SomeInterface
		System.out.println("SomeInterface is assignable from SomeClass" + clazz.isAssignableFrom(SomeInterface.class)); // false
		System.out.println("SomeClass is assignable from SomeInterface" + SomeInterface.class.isAssignableFrom(clazz)); // true

		System.out.println("-------------------");

		//list all methods
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getDeclaringClass().getSimpleName() + "." + method.getName());
		}

		System.out.println("-------------------");

		//list only the methods methods that are declared by SomeClass
		Method[] declaredMethods = clazz.getMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getDeclaringClass().getSimpleName() + "." + method.getName());
		}

		System.out.println("-------------------");

		//invoke method foo()
		Method foo = clazz.getDeclaredMethod("foo");
		foo.invoke(new SomeClass());

	}
}
