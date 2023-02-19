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
fun StepNineteenCheckCode() {
  Column {
    Text(text = "You should have found that you needed to add one new function in your TodoListViewModel that looks like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "// Add a method for deleting a todo list item here vvv\n" +
        "  // name the method removeTodoListItem\n" +
        "  fun removeTodoListItem(id: String) {\n" +
        "    Log.d(\"TODO_LIST_TEST_TAG\", \"Item with id: \$id removed!\")\n" +
        "  }\n" +
        "  // Add method above ^^^",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Don't worry that it doesn't do anything yet, you will get to that next.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Your updated TodoListRow should now look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoListRow(\n" +
        "  todoItem: TodoListItem,\n" +
        "  viewModel: TodoListViewModel,\n" +
        ") {\n" +
        "  var isComplete = remember { mutableStateOf(todoItem.isComplete) }\n" +
        "  Row(\n" +
        "    modifier = Modifier.height(64.dp),\n" +
        "    verticalAlignment = Alignment.CenterVertically,\n" +
        "  ) {\n" +
        "    if (isComplete.value) {\n" +
        "      IconButton(onClick = { viewModel.markTodoListItemNotComplete(todoItem.id) }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = CheckMarkGreen,\n" +
        "        )\n" +
        "      }\n" +
        "    } else {\n" +
        "      IconButton(onClick = { viewModel.markTodoListItemComplete(todoItem.id) }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = Gray,\n" +
        "        )\n" +
        "      }\n" +
        "    }\n" +
        "    Spacer(modifier = Modifier.width(12.dp))\n" +
        "    Text(text = todoItem.taskName)\n" +
        "    IconButton(onClick = { viewModel.removeTodoListItem(todoItem.id) }) {\n" +
        "      Icon(\n" +
        "        imageVector = Icons.Filled.Close,\n" +
        "        contentDescription = \"Checkmark\",\n" +
        "      )\n" +
        "    }\n" +
        "  }\n" +
        "  Divider()\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}