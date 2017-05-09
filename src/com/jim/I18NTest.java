package com.jim;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest{
	public static void main(String[] args) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
		ResourceBundle resourceBundleEn = ResourceBundle.getBundle("message", Locale.US);
		ResourceBundle resourceBundleCn = ResourceBundle.getBundle("message", new Locale("zh", "CN"));

		printMessage(resourceBundle);
		printMessage(resourceBundleEn);
		printMessage(resourceBundleCn);
	}

	private static void printMessage(ResourceBundle message){
		System.out.println(message.getString("title"));
	}
}
