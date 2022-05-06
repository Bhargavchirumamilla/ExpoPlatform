$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1.CreateTask.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Bhargav Chirumamilla"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: Create To Do List Task"
    },
    {
      "line": 4,
      "value": "#Scenario: Create To Do List Task with arguments."
    }
  ],
  "line": 7,
  "name": "Create To Do List Task",
  "description": "",
  "id": "create-to-do-list-task",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    },
    {
      "line": 6,
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "duration": 1355322,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify To-Do List screen",
  "description": "",
  "id": "create-to-do-list-task;verify-to-do-list-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User navigated to React-to-do-list URI",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Verify To-Do List Header",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify Add Task Tool Tip,when user dont have to do list",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify some other action To Do,Done,All Tab bar",
  "keyword": "And "
});
formatter.match({
  "location": "CreateMultipleTasks.user_navigated_to_React_to_do_list_URI()"
});
formatter.result({
  "duration": 160839149,
  "status": "passed"
});
formatter.match({
  "location": "CreateMultipleTasks.verify_To_Do_List_Header()"
});
formatter.result({
  "duration": 50587041,
  "status": "passed"
});
formatter.match({
  "location": "CreateMultipleTasks.verify_Add_Task_Tool_Tip_when_user_dont_have_to_do_list()"
});
formatter.result({
  "duration": 75435682,
  "status": "passed"
});
formatter.match({
  "location": "CreateMultipleTasks.verify_some_other_action_To_Do_Done_All_Tab_bar()"
});
formatter.result({
  "duration": 163217262,
  "status": "passed"
});
formatter.after({
  "duration": 451314383,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Create To Do List Task and verify To Do List is present",
  "description": "",
  "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Add Multiple tasks \"\u003ctaskSearches\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;",
  "rows": [
    {
      "cells": [
        "taskSearches"
      ],
      "line": 20,
      "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;1"
    },
    {
      "cells": [
        "Expo"
      ],
      "line": 21,
      "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;2"
    },
    {
      "cells": [
        "Platform"
      ],
      "line": 22,
      "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;3"
    },
    {
      "cells": [
        "React"
      ],
      "line": 23,
      "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 389017,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Create To Do List Task and verify To Do List is present",
  "description": "",
  "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@RegressionTest"
    },
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Add Multiple tasks \"Expo\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Expo",
      "offset": 20
    }
  ],
  "location": "CreateMultipleTasks.add_Multiple_tasks(String)"
});
formatter.result({
  "duration": 486140700,
  "status": "passed"
});
formatter.after({
  "duration": 661470273,
  "status": "passed"
});
formatter.before({
  "duration": 1142112,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Create To Do List Task and verify To Do List is present",
  "description": "",
  "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@RegressionTest"
    },
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Add Multiple tasks \"Platform\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Platform",
      "offset": 20
    }
  ],
  "location": "CreateMultipleTasks.add_Multiple_tasks(String)"
});
formatter.result({
  "duration": 424667233,
  "status": "passed"
});
formatter.after({
  "duration": 460045395,
  "status": "passed"
});
formatter.before({
  "duration": 786276,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Create To Do List Task and verify To Do List is present",
  "description": "",
  "id": "create-to-do-list-task;create-to-do-list-task-and-verify-to-do-list-is-present;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@RegressionTest"
    },
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Add Multiple tasks \"React\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "React",
      "offset": 20
    }
  ],
  "location": "CreateMultipleTasks.add_Multiple_tasks(String)"
});
formatter.result({
  "duration": 265524092,
  "status": "passed"
});
formatter.after({
  "duration": 459684662,
  "status": "passed"
});
formatter.before({
  "duration": 442471,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify To Do List count",
  "description": "",
  "id": "create-to-do-list-task;verify-to-do-list-count",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Verify To Do List count is 3",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 27
    }
  ],
  "location": "CreateMultipleTasks.verify_To_Do_List_count_is(int)"
});
formatter.result({
  "duration": 51819040,
  "status": "passed"
});
formatter.after({
  "duration": 374415373,
  "status": "passed"
});
formatter.uri("2.ToDoListWithDone.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Bhargav Chirumamilla"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: To Do List Task"
    },
    {
      "line": 4,
      "value": "#Scenario: To Do List Task with checkboxes."
    }
  ],
  "line": 7,
  "name": "TO DO List Task",
  "description": "",
  "id": "to-do-list-task",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    },
    {
      "line": 6,
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "duration": 269728,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify To-Do List Tasks",
  "description": "",
  "id": "to-do-list-task;verify-to-do-list-tasks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User navigated TO DO Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Verify ALL Tab with list tasks without checkboxes",
  "keyword": "When "
});
formatter.match({
  "location": "ToDoList.user_navigated_TO_DO_Tab()"
});
formatter.result({
  "duration": 73239362,
  "status": "passed"
});
formatter.match({
  "location": "ToDoList.verify_ALL_Tab_with_list_tasks_without_checkboxes()"
});
formatter.result({
  "duration": 324586570,
  "status": "passed"
});
formatter.after({
  "duration": 623169052,
  "status": "passed"
});
formatter.before({
  "duration": 530616,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify DONE List Tasks",
  "description": "",
  "id": "to-do-list-task;verify-done-list-tasks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Verify TO DO, after change from DONE Tab",
  "keyword": "And "
});
formatter.match({
  "location": "ToDoList.verify_TO_DO_after_change_from_DONE_Tab()"
});
formatter.result({
  "duration": 125451344,
  "status": "passed"
});
formatter.after({
  "duration": 563617552,
  "status": "passed"
});
formatter.uri("3.DeleteMultipeTasks.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Bhargav Chirumamilla"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: Delete List Of Task"
    },
    {
      "line": 4,
      "value": "#Scenario: Delete List Of Task"
    }
  ],
  "line": 7,
  "name": "Delete List Of Task",
  "description": "",
  "id": "delete-list-of-task",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@SanityTest"
    },
    {
      "line": 6,
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "duration": 887149,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Delete List Of Task",
  "description": "",
  "id": "delete-list-of-task;verify-delete-list-of-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User Click on Delete Button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Verify user have Delete All Tasks Button with Red colour",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Select to delete only one Task from list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify deleted task should be remove from the list of TO DO and ALL tabs",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteMultipleTasks.user_Click_on_Delete_Button()"
});
formatter.result({
  "duration": 100072981,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.verify_user_have_Delete_All_Tasks_Button_with_Red_colour()"
});
formatter.result({
  "duration": 26093531,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.select_to_delete_only_one_Task_from_list()"
});
formatter.result({
  "duration": 16046618,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.verify_deleted_task_should_be_remove_from_the_list_of_TO_DO_and_ALL_tabs()"
});
formatter.result({
  "duration": 37894439,
  "status": "passed"
});
formatter.after({
  "duration": 427787039,
  "status": "passed"
});
formatter.before({
  "duration": 234189,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Delete ALL button, user able to close the tasks",
  "description": "",
  "id": "delete-list-of-task;verify-delete-all-button,-user-able-to-close-the-tasks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Again click on delete button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User able to close the Delete All Tasks from the list",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Once again click on on Delete button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify user have Delete All Tasks button with Red colour",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteMultipleTasks.again_click_on_delete_button()"
});
formatter.result({
  "duration": 47222127,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.user_able_to_close_the_Delete_All_Tasks_from_the_list()"
});
formatter.result({
  "duration": 20681829,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.once_again_click_on_on_Delete_button()"
});
formatter.result({
  "duration": 57892105,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.verify_user_have_Delete_All_Tasks_button_with_Red_colour()"
});
formatter.result({
  "duration": 17499050,
  "status": "passed"
});
formatter.after({
  "duration": 407215636,
  "status": "passed"
});
formatter.before({
  "duration": 244013,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify Delete ALL List Of Task",
  "description": "",
  "id": "delete-list-of-task;verify-delete-all-list-of-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Click on Delete All Tasks",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "verify All tasks deleted",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteMultipleTasks.click_on_Delete_All_Tasks()"
});
formatter.result({
  "duration": 141148918,
  "status": "passed"
});
formatter.match({
  "location": "DeleteMultipleTasks.verify_All_tasks_deleted()"
});
formatter.result({
  "duration": 46006957,
  "status": "passed"
});
formatter.after({
  "duration": 626889253,
  "status": "passed"
});
});