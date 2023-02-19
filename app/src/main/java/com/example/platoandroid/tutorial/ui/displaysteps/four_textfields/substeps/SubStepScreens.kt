package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.substeps

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
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help.StepFourCodeCheck
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help.StepOneCodeCheck
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help.StepThreeCodeCheck
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help.StepTwoCodeCheck

class TextFieldsSupStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "The first thing we need to do is create a variable on our TodoList composable called `newTodoItemNameText` that holds a data type of TextFieldValue wrapped in MutableState.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Remember how we used mutable state when setting up the isComplete value for the todo item check marks?")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can create this variable and then check you code with the Code check button!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepOneCodeCheck() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class TextFieldsSupStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now lets use the new `newTodoItemNameText` variable you created.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The first thing we need to connect is setting the value of the TextField composable to our `newTodoItemNameText` variable.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "See if you can create this variable and then check you code with the Code check button!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepTwoCodeCheck() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class TextFieldsSupStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Next, when we type in the text field, we want to update our `newTodoItemNameText` variable.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "When a user types in the text field, compose will trigger the onValueChange callback.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Inside of the onValueChanged callback function brackets, add this: newTodoItemNameText.value = it")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The `it` here references the updated text passed back by the callback function.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepThreeCodeCheck() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}

class TextFieldsSupStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "Now that our `newTodoItemNameText` variable is setup to update based on what the user enter in the text field we can use it when we create new items.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do this, lets look at where we are building new TodoListItems when our `Add item` button is clicked.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Instead of the hardcoded string we were passing in to the TodoListItem for taskName, set taskName to newTodoItemNameText.value")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Next, let's make sure that after we add a new TodoListItem, we clear the text field.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do this, set the value of newTodoItemNameText back to an empty string. Give this a try and then check your code!")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepFourCodeCheck() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Check code")
        }
      }
    }
  }
}
