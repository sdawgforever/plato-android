package com.example.platoandroid.tutorial.ui.displaysteps.five_state.substeps

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialSubStepBlockState
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.help.RememberSyntaxExplained
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.help.StepEightHelpHint
import com.example.platoandroid.tutorial.ui.displaysteps.five_state.help.StepTwoHelpHint
import com.example.platoandroid.tutorial.ui.displaysteps.help.DefineTermRender
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.help.IfStatementsExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.ImportsExplained
import com.example.platoandroid.tutorial.ui.displaysteps.help.MutableStateOverview
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsABoolean
import com.example.platoandroid.tutorial.ui.displaysteps.help.WhatIsAVariable

class StateSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "We are going to try using state in our Todo List.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "First, we want to represent the state of a Todo item.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Each item on our todo list can be either “Open” or “Complete”.")
      Text(text = "Remember before we added an isComplete variable to represent this but nothing changed when we clicked our button to change it?")
      Spacer(modifier = Modifier.height(8.dp))
      // Text(text = "We will represent this state using a variable named isComplete that can be either true or false for each todo item.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Yep, how do we fix that?")
        }
      }
    }
  }
}

class StateSubStepFour : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      // Text(text = "If we change the isComplete value while running the app (by clicking complete), it will not change whether or not the check mark shows.")
      Text(text = "It did not change last time because nothing told the app it needed to render again.")
      Text(text = "When it rendered your UI the first time, it checked the value and set the checkmark based on that value but when the value changed, we wanted it to re-render so it could set the checkmark again.")
      Spacer(modifier = Modifier.height(8.dp))
      HelpButton("remind me what render means") {
        onHelpRequest { DefineTermRender() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In order for it to re-render, we need to tell the computer to watch the value for changes and to re-render if it changes.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we do that?")
        }
      }
    }
  }
}

class StateSubStepFive : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "To tell the computer we want it to watch a value and re-render when it changes, Compose has a few different tools we can use.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Keep the documentation for state & compose handy while we go through the next few steps: \n\nhttps://developer.android.com/jetpack/compose/state")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The first tool we will look at is “remember” and how it is used with something called “MutableState” to let us observe changes.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StateSubStepSix : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "MutableState is like a wrapper we put around a piece of data we want to observe - in our case, a Boolean value representing isComplete.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Any time we change the value the MutableState is wrapping, it will take care of notifying the computer that something important changed and we need to re-render.\n\nWe write this like:\n")
      Text(
        text = "var isComplete = mutableStateOf(todoItem.isComplete)",
        fontWeight = Companion.Bold,
        overflow = TextOverflow.Visible,
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Try updating your isComplete variable to use MutableState. (Don't forget, mutableStateOf is something we are borrowing from a library so you will need to import it)")
      Spacer(modifier = Modifier.height(8.dp))
      HelpButton("remind me how imports work") {
        onHelpRequest { ImportsExplained() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Continue")
        }
      }
    }
  }
}

class StateSubStepSeven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "You probably have 2 questions right now, why is the mutableStateOf value underlined in red & what is mutableStateOf?")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "The red lines are because we haven't setup “remember” yet. “remember” is required in Compose when we work with MutableState, we will look at adding that next.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "mutableStateOf is a function that Android provides that takes in data of any type and returns that data type wrapped in MutableState. We do NOT need to write this function ourselves since Anrdoid provides it, but to help you visualize what it is doing, if we were to write the function, it would look something like:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "fun <T> mutableStateOf(\n" +
        "  value: T,\n" +
        "): MutableState<T> {\n" +
        "  *does fancy things and returns your data wrapped in MutableState*\n" +
        "}",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Where T represents a generic data type that can be anything.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we use “remember” with this")
        }
      }
    }
  }
}

class StateSubStepSevenHalf : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "“remember” is a tool android provides to make sure we use MutableState in a safe and efficient way.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "It makes sure that the MutableState value is stored when it should be and forgotten when we don't want it anymore.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Because “remember” takes care of this for us, you don't need to worry about doing these things yourself!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "So the only thing you need to know is, when you want to use MutableState, always access it via “remember”. And if you forget, Android Studio will remind you to add “remember” by underlining the MutableState in red.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "What does implementing “remember” look like?")
        }
      }
    }
  }
}

class StateSubStepSevenThreeQuarter : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "To use “remember”, we want to update our isComplete variable to look like this:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "var isComplete by \n     remember { mutableStateOf(todoItem.isComplete) }",
        fontWeight = Companion.Bold,
        overflow = TextOverflow.Visible,
      )
      Spacer(modifier = Modifier.height(8.dp))
      HelpButton("why does this code look strange?") {
        onHelpRequest { RememberSyntaxExplained() }
      }
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Try updating your code to look like that. Did the red underline go away?")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Yep")
        }
      }
    }
  }
}

class StateSubStepEight : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "You may see some new red squiggles under the three usages of isComplete after moving it to this new type. This is because isComplete is no longer a Boolean, it is of type MutableState.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To access the Boolean value that is wrapped by MutableState, we need to call value on isComplete")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "After updating that, rebuild the app and try to click complete.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "It works now!")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepEightHelpHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "Still not working")
        }
      }
    }
  }
}

class StateSubStepNine : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "This new approach we have for holding our isComplete value still has a problem though.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This works well if we have a todo list we only want to keep as long as we keep the app running but it will not work if we want our todo list to last for many days.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Why not?")
        }
      }
    }
  }
}

class StateSubStepTen : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "When our app gets restarted or closed in the background, using remember & MutableState will reset our isComplete value.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Click complete on a few of your todo items and try rebuilding the app to see this happen.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "How do we fix this?")
        }
      }
    }
  }
}

class StateSubStepEleven : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "The solution to this requires something called data persistence.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "For your first app, we are not going to learn about data persistence since it is a more advanced subject. But if you want to give it a try on your own, take a look at Androids documentation:")
      Spacer(modifier = Modifier.height(8.dp))
      Text(
        text = "https://developer.android.com/training/data-storage",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Also take a look at the online course Android offers on data persistence:")
      Text(
        text = "https://developer.android.com/courses/android-basics-kotlin/unit-5",
        color = MaterialTheme.colors.primaryVariant,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier.padding(start = 16.dp)
      )
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
      }
    }
  }
}

class StateSubStepTwelve : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "State") {
      Text(text = "The next thing we want to use state for is the list of items in our todo list.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We want to be able to add and remove items from our list and have the UI update to reflect this.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do this, we will still use remember & MutableState but the logic for managing the list items is going to be more complex then the simple logic to set isComplete to true or false.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Any time we have more complex logic, we don't want to put that directly in our UI - we want to put it in something called a View Model.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's talk about ViewModels")
        }
      }
    }
  }
}
