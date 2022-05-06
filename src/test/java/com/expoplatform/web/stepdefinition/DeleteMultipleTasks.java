package com.expoplatform.web.stepdefinition;

import org.testng.Assert;

import com.expoplatform.web.launcher.TestHarness;
import com.expoplatform.web.pageobjects.DeleteTaskScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteMultipleTasks extends TestHarness {

	private static DeleteTaskScreen deleteTasks;

	static {
		deleteTasks = new DeleteTaskScreen(testdriver);
	}

	@Given("^User Click on Delete Button$")
	public void user_Click_on_Delete_Button() throws Throwable {
		deleteTasks.clickDelete();
	}

	@When("^Verify user have Delete All Tasks Button with Red colour$")
	public void verify_user_have_Delete_All_Tasks_Button_with_Red_colour() throws Throwable {
		Assert.assertEquals(deleteTasks.verifyDeleteAllTasksButtonwithRedColour(), "DELETE ALL TASKS",
				"Delete All Tasks Header is mismatched");

	}

	@Then("^Select to delete only one Task from list$")
	public void select_to_delete_only_one_Task_from_list() throws Throwable {
		deleteTasks.deleteOneTaskFromList();
	}

	@And("^Verify deleted task should be remove from the list of TO DO and ALL tabs$")
	public void verify_deleted_task_should_be_remove_from_the_list_of_TO_DO_and_ALL_tabs() throws Throwable {
		Assert.assertTrue(deleteTasks.verifyTasksCountReduces(), "Deleted task should be remove is mismatched ");

	}

	@When("^Again click on delete button$")
	public void again_click_on_delete_button() throws Throwable {
		deleteTasks.clickDelete();
	}

	@And("^User able to close the Delete All Tasks from the list$")
	public void user_able_to_close_the_Delete_All_Tasks_from_the_list() throws Throwable {
		Assert.assertTrue(deleteTasks.verifyElementNotPresentDelete(), "Deleted task should be remove is mismatched ");
	}

	@Then("^Once again click on on Delete button$")
	public void once_again_click_on_on_Delete_button() throws Throwable {
		deleteTasks.clickDelete();
	}

	@And("^Verify user have Delete All Tasks button with Red colour$")
	public void verify_user_have_Delete_All_Tasks_button_with_Red_colour() throws Throwable {
		Assert.assertEquals(deleteTasks.verifyDeleteAllTasksButtonwithRedColour(), "DELETE ALL TASKS",
				"Delete All Tasks Header is mismatched");
	}

	@Then("^Click on Delete All Tasks$")
	public void click_on_Delete_All_Tasks() throws Throwable {
		deleteTasks.clickDeleteAllTasks();
		deleteTasks.clickDeleteAllTaskPopUp();
	}

	@And("^verify All tasks deleted$")
	public void verify_All_tasks_deleted() throws Throwable {
		Assert.assertTrue(deleteTasks.verifyElementNotPresent(), "Deleted task should be remove is mismatched ");

	}

}
