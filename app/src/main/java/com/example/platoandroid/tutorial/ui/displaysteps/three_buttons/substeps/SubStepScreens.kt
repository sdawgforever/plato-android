package com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.substeps

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
import com.example.platoandroid.tutorial.ui.displaysteps.help.HelpButton
import com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.help.StepThreeNothingChanged
import com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.help.StepTwoHelpHint

class ButtonsSubStepOne : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(
    onHelpRequest: (request: @Composable () -> Unit) -> Unit,
    showNextStep: () -> Unit
  ) {
    TutorialStepCard(title = "Buttons") {
      Text(
        text = "When you constructed the button for adding a new item and the icon buttons for marking items complete and removing items, you noticed there was a required function that had to be provided in the Button constructors. "
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This function is the on click callback.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This means when the button is clicked, anything within that function will be executed.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Sounds good")
        }
      }
    }
  }
}

// class StateSubStepFour : TutorialSubStepBlockState {
//   @Composable
//   override fun displayBlock(
//     onHelpRequest: (request: @Composable () -> Unit) -> Unit,
//     showNextStep: () -> Unit
//   ) {
//     TutorialStepCard(title = "State") {
//       Text(text = "Now, in the onclick function brackets of your complete button, add this line to set isComplete to true:")
//       Text(text = "      isComplete = true", fontWeight = Companion.Bold)
//       Spacer(modifier = Modifier.height(8.dp))
//       Text(text = "Rebuild this app & try clicking complete.")
//       Spacer(modifier = Modifier.height(8.dp))
//       Row {
//         Button(onClick = { showNextStep() }) {
//           Text(text = "It’s not working")
//         }
//       }
//     }
//   }
// }

class ButtonsSubStepTwo : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Buttons",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "We left a todo in the onClick handler for our checkmark IconButtons - we will look at those buttons first.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We want to update those to change the value of isComplete when they are clicked.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In the onclick handler for the green checkmark, set isComplete = false")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "In the onclick handler for the gray checkmark, set isComplete = true")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Next")
        }
        Spacer(modifier = Modifier.width(8.dp))
        Button(
          onClick = { onHelpRequest { StepTwoHelpHint() } },
          colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.surface)
        ) {
          Text(text = "I need help")
        }
      }
    }
  }
}

class ButtonsSubStepThree : TutorialSubStepBlockState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard {
      Text(
        text = "Buttons",
        color = MaterialTheme.colors.secondary,
        style = MaterialTheme.typography.subtitle2
      )
      Text(text = "Rebuild your app and try tapping on the checkmark icons.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "You will notice that nothing changes. This is because even tho we are changing the value, the UI is not re-rendering to reflect the changed value.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do that, we will need to look at something called state management, so let's take a look at how we use state and then we will finish setting up our buttons.")
      Spacer(modifier = Modifier.height(8.dp))
      Row {
        Button(onClick = { showNextStep() }) {
          Text(text = "Let's look at state")
        }
      }
    }
  }
}