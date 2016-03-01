package com.lime.test;

//import org.junit.Test;

//import org.testng.annotations.Test;

//import org.junit.Test;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LimeOneClass extends UiAutomatorTestCase{
	//@Test
	public void testLime() throws UiObjectNotFoundException
	{
		getUiDevice().pressHome();
		UiObject apps=new UiObject(new UiSelector().description("Apps"));
		apps.clickAndWaitForNewWindow();
		UiScrollable listofapps=new UiScrollable(new UiSelector().scrollable(true));
		listofapps.setAsHorizontalList();
		listofapps.scrollForward();
		
		UiObject lime=listofapps.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()),"Lime");
		lime.clickAndWaitForNewWindow();
		UiObject ele=new UiObject(new UiSelector().resourceId("com.app.lime:id/anrecem_mpin_et"));
		ele.setText("1234");
		UiObject ele2=new UiObject(new UiSelector().resourceId("com.app.lime:id/anrecem_ok_tv"));
		ele2.click();
	
	}
	public void testRecharge() throws UiObjectNotFoundException
	{
		UiObject ele3=new UiObject(new UiSelector().resourceId("com.app.lime:id/linear_layout_sell_item"));
		ele3.click();
		UiObject ele5=new UiObject(new UiSelector().resourceId("com.app.lime:id/bpmr_proceed_btn"));
		if(ele5.getText().equalsIgnoreCase("Proceed"))
		{
			
		}
		else
		{
			
		}
		assertEquals("Unable to find out proceed button ","Proceeeeeeeeed",ele5.getText());
		getUiDevice().pressBack();
	}
	public void testZPay() throws UiObjectNotFoundException
	{
		UiObject pay_obj=new UiObject(new UiSelector().text("Pay"));
		pay_obj.click();
		
		UiObject ele4=new UiObject(new UiSelector().resourceId("com.app.lime:id/bg_image_color"));
		ele4.click();
		UiObject ele7=new UiObject(new UiSelector().resourceId("com.app.lime:id/aptm_enter_amount_et"));
		assertEquals("Unable to find out enter amount","Enter amount",ele7.getText());
		getUiDevice().pressBack();
	}	
	/*
		pay_obj.click();
		UiObject ele8=new UiObject(new UiSelector().text("Bill Pay"));
		ele8.click();
		UiObject ele9=new UiObject(new UiSelector().text("DTH"));
		assertEquals("Unable to find out DTH","DTH",ele9.getText());
		getUiDevice().pressBack();
		pay_obj.click();
		UiObject ele10=new UiObject(new UiSelector().text("Sound Pay"));
		ele10.click();
		UiObject ele11=new UiObject(new UiSelector().text("Sound Pay"));
		assertEquals("Unable to find out sound pay","Sound Pay",ele11.getText());
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		
		pay_obj.click();
		UiObject ele12=new UiObject(new UiSelector().text("ATM cash-out"));
		ele12.click();
		UiObject ele13=new UiObject(new UiSelector().text("Transfer Money"));
		assertEquals("Unable to find out ATM cash out","Transfer Money",ele13.getText());
		getUiDevice().pressBack();
		UiObject shop_obj=new UiObject(new UiSelector().text("Shop"));
		shop_obj.click();
		UiObject ele14=new UiObject(new UiSelector().text("Shopping"));
		ele14.click();
		UiObject ele15=new UiObject(new UiSelector().text("Buy"));
		assertEquals("Unable to find out shopping","Buy",ele15.getText());
		getUiDevice().pressBack();
		shop_obj.click();
		UiObject ele16=new UiObject(new UiSelector().text("Book Hotel"));
		ele16.click();
		UiObject ele17=new UiObject(new UiSelector().text("Hotels"));
		assertEquals("Unable to find out book hotel","Hotels",ele17.getText());
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		shop_obj.click();
		UiObject ele18=new UiObject(new UiSelector().text("Bus Tickets"));
		ele18.click();
		UiObject ele19=new UiObject(new UiSelector().text("Bus Tickets"));
		assertEquals("Unable to find out bus tickets","Bus Tickets",ele19.getText());
		getUiDevice().pressBack();
		shop_obj.click();
		UiObject ele20=new UiObject(new UiSelector().text("Flight Tickets"));
		ele20.click();
		UiObject ele21=new UiObject(new UiSelector().text("Flight Tickets"));
		assertEquals("Unable to find out flight tckets","Flight Tickets",ele21.getText());
		getUiDevice().pressBack();
		UiObject wal_obj=new UiObject(new UiSelector().text("Wallets"));
		wal_obj.click();
		UiObject ele22=new UiObject(new UiSelector().text("Split Bill"));
		ele22.click();
		UiObject ele23=new UiObject(new UiSelector().text("Split Bill"));
		assertEquals("Unable to find out split bills","Split Bills",ele23.getText());
		getUiDevice().pressBack();
		wal_obj.click();
		UiObject ele24=new UiObject(new UiSelector().text("Split Bill"));
		ele2.click();
		UiObject ele23=new UiObject(new UiSelector().text("Split Bill"));
		assertEquals("Unable to find out split bills","Split Bills",ele23.getText());
		getUiDevice().pressBack();
		
		
		
		
		
		
*/
}


