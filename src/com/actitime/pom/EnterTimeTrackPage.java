package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
@FindBy(id="container_tasks")
private WebElement tasktab;


@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement creatcusbtn;

@FindBy(xpath="//input[@type='text'and @class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement custnamebx;

@FindBy(xpath="//textarea[@class='textarea'and @placeholder='Enter Customer Description']")
private WebElement custdscbx;

@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
private WebElement selcusdrop;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourcopbtn;

@FindBy(xpath="//div[text()='Create Customer' and@class='components_button_label']")
private WebElement svcut;

@FindBy(xpath="(//div[@class='titleEditButtonContainer'])/div")
private WebElement createdcus;


public WebElement getCreatcusbtn() {
	return creatcusbtn;
}
public WebElement getCreatedcus() {
	return createdcus;
}
public EnterTimeTrackPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getCustnamebx() {
	return custnamebx;
}
public WebElement getCustdscbx() {
	return custdscbx;
}
public WebElement getSelcusdrop() {
	return selcusdrop;
}
public WebElement getOurcopbtn() {
	return ourcopbtn;
}
public WebElement getSvcut() {
	return svcut;
}
public void setaddCust()
{
	tasktab.click();
	addnewbtn.click();
	creatcusbtn.click();
	
}


}
