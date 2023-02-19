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
fun StepEighteenCheckCode() {
  Column {
    Text(text = "Your TodoListRow code should now look like:")
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
        "  ) {" +
        "    ...",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Your TodoList code should now look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoList(title: String) {\n" +
        "  Column(\n" +
        "    modifier = Modifier.padding(12.dp)\n" +
        "  ) {\n" +
        "    var viewModel: TodoListViewModel = viewModel { TodoListViewModel() }\n" +
        "    Title(title = title)\n" +
        "    // We need to add some to-do items here below vvv\n" +
        "    viewModel.todoListItems.forEach { todoListItem ->\n" +
        "      TodoListRow(\n" +
        "        todoItem = todoListItem,\n" +
        "        viewModel = viewModel,\n" +
        "      )\n" +
        "    }" +
        "    ...",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}