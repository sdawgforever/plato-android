package com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture

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
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepEight
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepFive
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepFour
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepSeven
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepSix
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepTwo
import com.example.platoandroid.tutorial.ui.displaysteps.seven_architechture.substeps.ArchitectureSupStepZero

class ArchitechtureTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "Architecture") {
      Text(text = "Nice job! Your todo list is working now!")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "Now that we have it functioning, lets look at some of the other things happening under the hood.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "First up, we've learned about a few different files it takes to make our app work. Lets look at where those files live and how we structure our app.")
      Spacer(modifier = Modifier.height(8.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "Next")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    ArchitectureSupStepZero(),
    ArchitectureSupStepOne(),
    ArchitectureSupStepTwo(),
    ArchitectureSupStepThree(),
    ArchitectureSupStepFour(),
    ArchitectureSupStepFive(),
    ArchitectureSupStepSix(),
    ArchitectureSupStepSeven(),
    ArchitectureSupStepEight(),
  )
}