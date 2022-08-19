package com.properties;

import java.io.IOException;

public class Sigleton_Design_Pattern {
	private Sigleton_Design_Pattern() {

	}

	public static Sigleton_Design_Pattern get_Sdp() {
		// TODO Auto-generated method stub
		Sigleton_Design_Pattern pattern = new Sigleton_Design_Pattern();
		return pattern;
	}

	public Test_Data get_Instance_Test_Data() throws IOException {
		Test_Data data = new Test_Data();
		return data;
	}

}
