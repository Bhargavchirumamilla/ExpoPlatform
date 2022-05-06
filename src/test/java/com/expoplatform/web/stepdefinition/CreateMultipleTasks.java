package com.expoplatform.web.stepdefinition;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.expoplatform.web.launcher.TestHarness;
import com.expoplatform.web.pageobjects.CreateMultipleTasksScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateMultipleTasks extends TestHarness {

	private static CreateMultipleTasksScreen multipleTasks;

	static {
		multipleTasks = new CreateMultipleTasksScreen(testdriver);
	}

	@Given("^User navigated to React-to-do-list URI$")
	public void user_navigated_to_React_to_do_list_URI() throws Throwable {

	}

	@Then("^Verify To-Do List Header$")
	public void verify_To_Do_List_Header() throws Throwable {
		Assert.assertEquals(multipleTasks.verifyToDoList(), "To-Do List", "To-Do List Header is mismatched");
	}

	@When("^Verify Add Task Tool Tip,when user dont have to do list$")
	public void verify_Add_Task_Tool_Tip_when_user_dont_have_to_do_list() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(multipleTasks.verifyAddTask(), "Add Task", "Add task is mismatched ");
		softAssert.assertEquals(multipleTasks.verifyCreate(), "CREATE", "Create is mismatched ");
		softAssert.assertAll();
	}

	@And("^Verify some other action To Do,Done,All Tab bar$")
	public void verify_some_other_action_To_Do_Done_All_Tab_bar() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(multipleTasks.verifyToDoTab(), "To Do Tab is mismatched ");
		softAssert.assertTrue(multipleTasks.verifyDoneTab(), "Done Tab is mismatched ");
		softAssert.assertTrue(multipleTasks.verifyAllTab(), "All Tab mismatched ");
		softAssert.assertTrue(multipleTasks.verifyDeleteiCon(), "Delete Icon is mismatched");
		softAssert.assertAll();
	}

	@When("^Add Multiple tasks \"([^\"]*)\"$")
	public void add_Multiple_tasks(String taskList) throws Throwable {
		Assert.assertTrue(multipleTasks.addTask(taskList), "Adding Multiple Taks failed");
	}

	@And("^Verify To Do List count is (\\d+)$")
	public void verify_To_Do_List_count_is(int taskCount) throws Throwable {
		Assert.assertTrue(multipleTasks.verifyTaskCountAfterAdding(taskCount), "Verify To Do List count is failed");
	}

}
