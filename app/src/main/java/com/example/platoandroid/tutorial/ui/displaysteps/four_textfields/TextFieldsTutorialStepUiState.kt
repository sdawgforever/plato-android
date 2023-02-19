package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.tutorial.model.TutorialStepUiState
import com.example.platoandroid.tutorial.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.substeps.TextFieldsSupStepFour
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.substeps.TextFieldsSupStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.substeps.TextFieldsSupStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.substeps.TextFieldsSupStepTwo

class TextFieldsTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Text Fields") {
      Text(text = "Our todo list is starting to work!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "We are missing one big piece though - we can't enter new names for new tasks yet.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "To do this, we need to be able to grab the data from the TextField composable and pass it into TodoListItem when we create a new one.")
      Spacer(modifier = Modifier.height(8.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "How do we do this?")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    TextFieldsSupStepOne(),
    TextFieldsSupStepTwo(),
    TextFieldsSupStepThree(),
    TextFieldsSupStepFour(),
  )
}