package com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.subssteps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.HowToSearchAFileName
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.help.CheckTodoListRowUpdatesHelp
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.help.TodoListItemImportHelp
import com.example.platoandroid.tutorial.ui.displaysteps.two_datatypes.help.UpdatingDataClassHelpHint

class DataTypesSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "For example, in our Todo List we are building, each item has a few values associated with it like:\n" +
          "taskName, isCompleted status, dueDate, etc."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It will be helpful if we can wrap all of these values into one data type representing a todo list item.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we do this?")
        }
      }
    }
  }
}

class DataTypesSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "We can do this using a data class."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We have a data class already started to represent your todo list item called TodoListItem - try using the class search option to find this file.")
      HelpButton("how to search for a class") {
        onHelpRequest { HowToSearchAFileName() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class DataTypesSubStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "Read through the comments in the TodoListItem file and follow the instructions to add the additional needed values to the data class."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Completed it!")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { UpdatingDataClassHelpHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need help")
        }
      }
    }
  }
}

class DataTypesSubStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "Let's try using this new data class to represent the items in our todo list."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "Navigate back to the TodoList.kt file where we have been building our todo list."
      )
      Spacer(modifier = Modifier.height(8.dp))
      HelpButton("how to search for a file") {
        onHelpRequest { HowToSearchAFileName() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "I'm there")
        }
      }
    }
  }
}

class DataTypesSubStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "Find your TodoListRow composable. Right now we are passing in a String to TodoListRow and it looks like this:"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoListRow(taskName: String) { ... }",
        fontWeight = FontWeight.Bold,
        overflow = TextOverflow.Visible,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "Instead of passing in just the task name as a string, we are going to pass in all the data for the item by passing in our new data type TodoListItem. Update your code to look like this:"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "@Composable\n" +
          "fun TodoListRow(todoItem: TodoListItem) { ... }",
        fontWeight = FontWeight.Bold,
        overflow = TextOverflow.Visible,
      )
      Spacer(modifier = Modifier.height(8.dp))
      // HelpButton("why is TodoListItem red?") {
      //   onHelpRequest { TodoListItemImportHelp() }
      // }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Done")
        }
      }
    }
  }
}

class DataTypesSubStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Data Types") {
      Text(
        text = "Now that we updated the function signature, we need to update 3 more things:"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "1. Update where we were creating TodoListRow's to provide a TodoListItem instead of a String"
      )
      Text(
        text = "2. Update where we were using the passed in taskName String to use todoItem.taskName instead"
      )
      Text(
        text = "3. Update the isComplete variable to be initially set to todoItem.isComplete"
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "See if you can figure out how to make these 3 changes. After you give it a shot, click the Check Code button to check your work."
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { CheckTodoListRowUpdatesHelp() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check Code")
        }
      }
    }
  }
}
