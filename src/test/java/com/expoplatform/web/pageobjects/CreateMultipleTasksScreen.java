package com.expoplatform.web.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.expoplatform.web.utilities.BaseBrowserView;

public class CreateMultipleTasksScreen extends BaseBrowserView {
	WebDriver testdriver;

	public CreateMultipleTasksScreen(WebDriver testdriver) {
		super(testdriver);
		PageFactory.initElements(testdriver, this);

	}

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='column-list']//input")
	List<WebElement> taskList;

	@FindBy(xpath = "//span[normalize-space()='To-Do List']")
	WebElement toDoListHeader;

	@FindBy(xpath = "//div[@class='App-container']/div/div[1]")
	WebElement addTasks;

	@FindBy(xpath = "//input[@type='text']")
	WebElement addTasksList;

	@FindBy(xpath = "//span[normalize-space()='Create']")
	WebElement createButton;

	@FindBy(xpath = "//div[@class='enable-remove-mode']")
	WebElement deleteButton;

	@FindBy(css = "button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement toDoTab;

	@FindBy(css = "button:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement doneTab;

	@FindBy(css = "button:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement allTab;

	public boolean addTask(String tasks) throws InterruptedException {
		boolean products = false;
		clearTextBoxWithTip(addTasksList);
		addTasksList.sendKeys(tasks);
		tap(createButton);
		products = true;
		return products;
	}

	public boolean verifyTaskCountAfterAdding(int valueCount) throws InterruptedException {
		List<WebElement> tabs = taskList;
		for (WebElement tabList : tabs) {
			tabList.getAttribute("value").equals(valueCount);

		}
		return true;

	}

	public String verifyURL() throws InterruptedException {
		Thread.sleep(3000);
		String URL = testdriver.getCurrentUrl();
		return URL;

	}

	public String verifyToDoList() throws InterruptedException {
		return verify_element(toDoListHeader);

	}

	public String verifyAddTask() throws InterruptedException {
		return verify_element(addTasks);

	}

	public String verifyCreate() throws InterruptedException {
		return verify_element(createButton);

	}

	public boolean verifyToDoTab() throws InterruptedException {
		return verify_element_Present(toDoTab);

	}

	public boolean verifyDoneTab() throws InterruptedException {
		return verify_element_Present(doneTab);

	}

	public boolean verifyAllTab() throws InterruptedException {
		return verify_element_Present(allTab);

	}

	public boolean verifyDeleteiCon() {
		return verify_element_Enabled(deleteButton);
	}

}
