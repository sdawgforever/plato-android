package com.example.platoandroid.tutorial.ui.displaysteps.three_buttons.help

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
fun StepTwoHelpHint() {
  Column {
    Text(text = "When you update the IconButton onClick callback functions, they should now look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "if (isComplete) {\n" +
        "      IconButton(onClick = { isComplete = false }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = CheckMarkGreen,\n" +
        "        )\n" +
        "      }\n" +
        "    } else {\n" +
        "      IconButton(onClick = { isComplete = true }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = Gray,\n" +
        "        )\n" +
        "      }\n" +
        "    }",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}