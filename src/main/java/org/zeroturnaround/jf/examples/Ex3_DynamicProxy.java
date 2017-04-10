package org.zeroturnaround.jf.examples;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Ex3_DynamicProxy {

	public static void main(String[] args) {
		V8 v8 = new V8();

		Engine engine = (Engine) Proxy.newProxyInstance(v8.getClass().getClassLoader(), new Class[] { Engine.class },
				(proxy, method, arguments) -> method.invoke(v8, arguments));

		engine.start();
		engine.wroom();
		engine.stop();
	}

}

interface Engine {
	void start();

	void wroom();

	void stop();
}

class V8 implements Engine {

	@Override
	public void start() {
		System.out.println("V8.start");
	}

	@Override
	public void wroom() {
		System.out.println("V8.wroom");
	}

	@Override
	public void stop() {
		System.out.println("V8.stop");
	}
}

class V12 {

	public void wroom() {
		System.out.println("V12.wroom");
	}

}
