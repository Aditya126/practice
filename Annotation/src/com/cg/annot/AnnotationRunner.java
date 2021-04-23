package com.cg.annot;

public class AnnotationRunner {
	public void method1() {
		System.out.println("method1 invoked");
	}
	@CanRun
	public void method2() {
		System.out.println("method2 invoked");
	}
	@CanRun
	public void method3() {
		System.out.println("method3 invoked");
	}
	public void method4() {
		System.out.println("method4 invoked");
	}
	public void method5() {
		System.out.println("method5 invoked");
	}
}
