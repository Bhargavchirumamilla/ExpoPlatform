package com.expoplatform.web.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.expoplatform.web.utilities.BaseBrowserView;

public class DeleteTaskScreen extends BaseBrowserView {
	WebDriver testdriver;

	public DeleteTaskScreen(WebDriver testdriver) {
		super(testdriver);
		PageFactory.initElements(testdriver, this);

	}

	@FindBy(xpath = "//div[@class='enable-remove-mode']")
	WebElement deleteButton;

	@FindBy(xpath = "//span[normalize-space()='Delete All Tasks']")
	WebElement deleteHeader;

	@FindBy(xpath = "//button[1]/div/div/div")
	WebElement toDoCountValue;

	@FindBy(xpath = "//button[2]/div/div/div")
	WebElement doneCountValue;

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='column-list']//input[1]")
	WebElement notPresent;

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='column-list']//input[1]")
	List<WebElement> deleteOneTaskFromList;

	@FindBy(xpath = "//span[normalize-space()='Confirm']")
	WebElement deleteConfirm;

	public boolean verifyElementNotPresent() {
		boolean res = !notPresent.isDisplayed();
		return res;

	}

	public boolean verifyElementNotPresentDelete() {
		if (!deleteHeader.isDisplayed()) {
			return false;
		} else {
			return true;
		}

	}

	public void deleteOneTaskFromList() {
		deleteOneTaskFromList.get(0);
	}

	public boolean verifyTasksCountReduces() throws InterruptedException {

		String toDoCount = toDoCountValue.getAttribute("value");
		String doneCount = doneCountValue.getAttribute("value");

		if (toDoCount == doneCount) {
			return true;
		} else {
			return false;
		}
	}

	public String verifyDeleteAllTasksButtonwithRedColour() throws InterruptedException {
		return verify_element(deleteHeader);

	}

	public void clickDelete() {
		tap(deleteButton);
	}

	public void clickDeleteAllTasks() {
		tap(deleteHeader);
	}

	public void clickDeleteAllTaskPopUp() {
		tap(deleteConfirm);
	}

}
