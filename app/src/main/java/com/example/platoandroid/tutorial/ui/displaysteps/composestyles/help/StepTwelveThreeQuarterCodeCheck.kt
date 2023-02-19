package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepTwelveThreeQuarterCodeCheck() {
  Column {
    Text(text = "Your new variable should look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "if (isComplete) {\n" +
      "      IconButton(onClick = { /** todo */ }) {\n" +
      "        Icon(\n" +
      "          imageVector = Icons.Filled.CheckCircle,\n" +
      "          tint = CheckMarkGreen,\n" +
      "          contentDescription = \"Checkmark\",\n" +
      "        )\n" +
      "      }\n" +
      "    } else {\n" +
      "      IconButton(onClick = { /** todo */ }) {\n" +
      "        Icon(\n" +
      "          imageVector = Icons.Outlined.CheckCircle,\n" +
      "          tint = Gray,\n" +
      "          contentDescription = \"Checkmark\",\n" +
      "        )\n" +
      "      }\n" +
      "    }")
  }
}