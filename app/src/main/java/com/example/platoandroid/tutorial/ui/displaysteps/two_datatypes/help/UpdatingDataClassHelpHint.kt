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
fun UpdatingDataClassHelpHint() {
  Column {
    Text(text = "Your final updated TodoListItem data class will look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "data class TodoListItem(\n" +
        "  // the constructor arguments go here vvv\n" +
        "  // It's important that we have a unique ID so we can tell different todo list\n" +
        "  // items apart even if they have the same taskName.\n" +
        "  val id: String,\n" +
        "  val taskName: String,\n" +
        "  // add the additional values a todo list item will need below vvv\n" +
        "  val isComplete: Boolean,\n" +
        "  val completedAt: Date?,\n" +
        "  val dueDate: Date? = null, // this defaults dueDate to null\n" +
        "  // add todo list item values above ^^^\n" +
        ") {\n" +
        "  // This is the body of the data class.\n" +
        "  // Data classes do not NEED to have a body.\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}