package com.cg.annot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) {
		AnnotationRunner runner = new AnnotationRunner();
		Method[] methods = runner.getClass().getMethods();
		for (Method method : methods) {
			CanRun annos = method.getAnnotation(CanRun.class);
			if(annos != null) {
				try {
					method.invoke(runner);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}

	}

}