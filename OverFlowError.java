package com.onesoft.Exeptions;

public class OverFlowError {
	public void findA() {
		findB();
	}
	public void findB() {
	findA();
	}
	public static void main(String[] args) {
		OverFlowError of = new OverFlowError();
		of.findB();
	}

}
