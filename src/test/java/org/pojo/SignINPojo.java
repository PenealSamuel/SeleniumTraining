package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPojo extends BaseClass {

	public SignINPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createNewAcc;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstNameTxtBox;

	@FindBy(name = "lastname")
	private WebElement secondNameTxtBox;

	@FindBy(name = "reg_email__")
	private WebElement mobileorEmailTextBox;

	@FindBy(name = "reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getMobileorEmailTextBox() {
		return mobileorEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

}
