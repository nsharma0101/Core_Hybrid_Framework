package com.selenium.hybrid;

import java.io.IOException;

public class Keywords {

	
public static void main(String[] args) {

	GenericKeywords app = new GenericKeywords();
	app.openBrowser("Mozilla");
	app.navigate("url");
	app.click("gmaillink_xpath");
	app.input("email_id", "neerajvsharma@gmail.com");
	app.click("nextbutton_id");

	}

}

