package com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.help

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
fun CheckTodoListRowUpdatesHelp() {
  Column {
    Text(
      text = "For step 1: \n1. Update where we were creating TodoListRow's to provide a TodoListItem instead of a String.\nTodoList should now look like:"
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
      "fun TodoList(title: String) {\n" +
      "  Column(\n" +
      "    modifier = Modifier.padding(12.dp)\n" +
      "  ) {\n" +
      "    Title(title = title)\n" +
      "    // We need to add some to-do items here below vvv\n" +
      "    TodoListRow(\n" +
      "      todoItem = TodoListItem(\n" +
      "        id = Random(101).toString(),\n" +
      "        taskName = \"My first item\",\n" +
      "        isComplete = false,\n" +
      "        completedAt = null,\n" +
      "      )\n" +
      "    )\n" +
      "    TodoListRow(\n" +
      "      todoItem = TodoListItem(\n" +
      "        id = Random(101).toString(),\n" +
      "        taskName = \"My second item\",\n" +
      "        isComplete = true,\n" +
      "        completedAt = null,\n" +
      "      )\n" +
      "    )\n" +
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
    Text(text = "For steps 2 & 3:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "2. Update where we were using the passed in taskName String to use todoItem.taskName instead"
    )
    Text(
      text = "3. Update the isComplete variable to be initially set to todoItem.isComplete"
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "TodoListRow should now look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoListRow(todoItem: TodoListItem) {\n" +
        "  var isComplete: Boolean = todoItem.isComplete\n" +
        "  Row(\n" +
        "    modifier = Modifier.height(64.dp),\n" +
        "    verticalAlignment = Alignment.CenterVertically,\n" +
        "  ) {\n" +
        "    if (isComplete) {\n" +
        "      IconButton(onClick = { /*TODO*/ }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = CheckMarkGreen,\n" +
        "        )\n" +
        "      }\n" +
        "    } else {\n" +
        "      IconButton(onClick = { /*TODO*/ }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = Gray,\n" +
        "        )\n" +
        "      }\n" +
        "    }\n" +
        "    Spacer(modifier = Modifier.width(12.dp))\n" +
        "    Text(text = todoItem.taskName)\n" +
        "    IconButton(onClick = { /*TODO*/ }) {\n" +
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