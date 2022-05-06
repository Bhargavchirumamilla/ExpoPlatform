package com.expoplatform.web.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expoplatform.web.utilities.BaseBrowserView;

public class ToDoTaskScreen extends BaseBrowserView {
	WebDriver testdriver;

	public ToDoTaskScreen(WebDriver testdriver) {
		super(testdriver);
		PageFactory.initElements(testdriver, this);

	}

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='column-list']//input")
	List<WebElement> clickonCheckBox;

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='task-done']")
	List<WebElement> alreadyChecked;

	@FindBy(xpath = "//button[1]/div/div/div")
	WebElement toDoCountValue;

	@FindBy(xpath = "//button[2]/div/div/div")
	WebElement doneCountValue;

	@FindBy(css = "button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement toDoTab;

	@FindBy(css = "button:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement doneTab;

	@FindBy(css = "button:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement allTab;

	public void clickTasks() throws InterruptedException {
		List<WebElement> tasks = clickonCheckBox;
		for (WebElement task : tasks) {
			task.click();
		}

	}

	public String verifyTasksCount() throws InterruptedException {
		List<WebElement> tasks = alreadyChecked;
		int val = tasks.size();
		String countvalue = String.valueOf(val);
		return countvalue;

	}

	public boolean verifyTasksCountReduces() throws InterruptedException {
		List<WebElement> tasks = alreadyChecked;
		boolean toDoCount = toDoCountValue.getAttribute("value") != null;
		boolean doneCount = doneCountValue.getAttribute("value") != null;

		for (WebElement task : tasks) {
			task.click();
			if (toDoCount == doneCount) {
				return true;
			} else {
				return false;
			}

		}
		return doneCount;

	}

	public void clickToDoTab() {
		tap(toDoTab);
	}

	public void doneTab() {
		tap(doneTab);
	}

}
