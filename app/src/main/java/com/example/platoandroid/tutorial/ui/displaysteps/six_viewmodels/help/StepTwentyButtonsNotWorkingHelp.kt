package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepTwentyButtonsNotWorkingHelp() {
  Column {
    Text(text = "Look dow at the bottom of Android studio for the tab labeled `Logcat`")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Open that tab and in the search bar, filter for TODO_LIST_TEST_TAG")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Try clicking the buttons again and look for your logs!")
    Spacer(modifier = Modifier.height(8.dp))
  }
}