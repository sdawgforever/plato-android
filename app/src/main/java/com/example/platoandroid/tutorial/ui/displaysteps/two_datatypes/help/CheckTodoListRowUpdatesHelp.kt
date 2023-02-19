package com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.help

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CheckTodoListRowUpdatesHelp() {
  Column {
    Text(
      text = "1. Update where we were creating TodoListRow's to provide a TodoListItem instead of a String"
    )
    Text(
      text = "2. Update where we were using the passed in taskName String to use todoItem.taskName instead"
    )
    Text(
      text = "3. Update the isComplete variable to be initially set to todoItem.isComplete"
    )
  }
}