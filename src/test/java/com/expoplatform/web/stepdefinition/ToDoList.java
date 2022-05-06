package com.expoplatform.web.stepdefinition;

import org.testng.Assert;

import com.expoplatform.web.launcher.TestHarness;

import com.expoplatform.web.pageobjects.ToDoTaskScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ToDoList extends TestHarness {

	private static ToDoTaskScreen toDoTasks;

	static {
		toDoTasks = new ToDoTaskScreen(testdriver);
	}

	@Given("^User navigated TO DO Tab$")
	public void user_navigated_TO_DO_Tab() throws Throwable {
		toDoTasks.clickToDoTab();
	}

	@When("^Verify ALL Tab with list tasks without checkboxes$")
	public void verify_ALL_Tab_with_list_tasks_without_checkboxes() throws Throwable {
		toDoTasks.clickTasks();
		toDoTasks.doneTab();
		Assert.assertEquals(toDoTasks.verifyTasksCount(), "3", "To-Do List Header is mismatched");

	}

	@And("^Verify TO DO, after change from DONE Tab$")
	public void verify_TO_DO_after_change_from_DONE_Tab() throws Throwable {
		Assert.assertTrue(toDoTasks.verifyTasksCountReduces(), "Verify TO DO, after change from DONE is mismatched ");

	}

}
