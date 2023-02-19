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
fun StepFifteenHelpHint() {
  Column {
    Text(text = "After checking to make sure your app built, check your TodoList code to make sure it looks like this:")
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
        "      TodoListRow(todoItem = todoListItem)\n" +
        "    }\n" +
        "    // ^^^ Add to-do list items above\n" +
        "    Row {\n" +
        "      TextField(value = \"\", onValueChange = {})\n" +
        "      Spacer(modifier = Modifier.width(12.dp))\n" +
        "      Button(onClick = { /*TODO*/ }) {\n" +
        "        Text(text = \"Add item\")\n" +
        "      }\n" +
        "    }\n" +
        "  }\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If that looks good but you are still not seeing your items, also check your TodoListViewModel code to make sure it looks like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "class TodoListViewModel() : ViewModel() {\n" +
        "  /**\n" +
        "   * This is the body of our view model where all the logic will live.\n" +
        "   */\n" +
        "  var todoListItems: SnapshotStateList<TodoListItem> = mutableStateListOf(\n" +
        "    TodoListItem(\n" +
        "      id = Random(101).toString(),\n" +
        "      taskName = \"Thing one\",\n" +
        "      isComplete = false,\n" +
        "      completedAt = null\n" +
        "    )\n" +
        "  )\n" +
        "    ...\n",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Note: It does not matter how many TodoListItems you added or what values you gave them, any should be fine.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}