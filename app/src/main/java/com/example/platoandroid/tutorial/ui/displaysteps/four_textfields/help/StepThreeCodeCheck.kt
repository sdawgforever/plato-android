package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help

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
fun StepThreeCodeCheck() {
  Column {
    Text(text = "Your new variable should look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "TextField(value = newTodoItemNameText.value, onValueChange = { newValue ->\n" +
      "        newTodoItemNameText.value = newValue\n" +
      "})",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
  }
}