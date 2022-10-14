package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genric.Base;
import com.actitime.pom.EnterTimeTrackPage;
//@Listeners(com.actitime.genric.Listner.class)
public class CreatCustomer extends Base {
	@Test
	public void testcreatcust() throws InterruptedException
	{
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.setaddCust();
        e.getCustnamebx().sendKeys("hdg4hg4");
        e.getCustdscbx().sendKeys("f48hy");
        e.getSelcusdrop().click();
   
        e.getOurcopbtn().click();
        e.getSvcut().click();
        String d = e.getCreatedcus().getText();
        Reporter.log(d,true);
        
     
	}

}
