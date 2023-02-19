package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepTwentyOneCodeCheck() {
  Column {
    Text(text = "After updating the 3 functions, the function code should now look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "/**\n" +
        "   * This function is used to mark an item in todoListItems as complete.\n" +
        "   *\n" +
        "   * The operations used here will not automatically trigger a re-render of our UI if\n" +
        "   * todoListItems is being observed on since we are only updating an element within the\n" +
        "   * list rather than updating the list itself. We need to account for that.\n" +
        "   */\n" +
        "  fun markTodoListItemComplete(id: String) {\n" +
        "    Log.d(\"TODO_LIST_TEST_TAG\", \"Item with id: \$id marked complete!\")\n" +
        "    val itemToUpdate = todoListItems.find { it.id == id }\n" +
        "    val itemToUpdateIndex = todoListItems.indexOf(itemToUpdate)\n" +
        "    itemToUpdate!!.isComplete = true\n" +
        "    todoListItems[itemToUpdateIndex] = itemToUpdate\n" +
        "  }\n" +
        "\n" +
        "  /**\n" +
        "   * This function is used to mark an item in todoListItems as complete.\n" +
        "   *\n" +
        "   * The operations used here will not automatically trigger a re-render of our UI if\n" +
        "   * todoListItems is being observed on since we are only updating an element within the\n" +
        "   * list rather than updating the list itself. We need to account for that.\n" +
        "   */\n" +
        "  fun markTodoListItemNotComplete(id: String) {\n" +
        "    Log.d(\"TODO_LIST_TEST_TAG\", \"Item with id: \$id marked not complete!\")\n" +
        "    val itemToUpdate = todoListItems.find { it.id == id }\n" +
        "    val itemToUpdateIndex = todoListItems.indexOf(itemToUpdate)\n" +
        "    itemToUpdate!!.isComplete = false\n" +
        "    todoListItems[itemToUpdateIndex] = itemToUpdate\n" +
        "  }\n" +
        "\n" +
        "  /**\n" +
        "   * This function will be used to remove items from todoListItems\n" +
        "   * SnapshotStateList has a function called `remove` that can be used to remove an item\n" +
        "   * from the list but it requires us passing in the item we want to remove.\n" +
        "   *\n" +
        "   * The `remove` operation will also trigger a re-render of our UI if todoListItems is being\n" +
        "   * observed on.\n" +
        "   */\n" +
        "  fun removeTodoListItem(id: String) {\n" +
        "    Log.d(\"TODO_LIST_TEST_TAG\", \"Item with id: \$id removed!\")\n" +
        "    val itemToUpdate = todoListItems.find { it.id == id }\n" +
        "    todoListItems.remove(itemToUpdate)\n" +
        "  }",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}