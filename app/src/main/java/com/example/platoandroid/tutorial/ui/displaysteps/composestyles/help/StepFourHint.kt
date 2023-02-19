package com.example.platoandroid.tutorial.ui.displaysteps.composestyles.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Why don't I see my changes?
@Composable
fun StepFourHint() {
  Column {
    Text(text = "The first thing to check is always if your app built successfully.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Look in the build tab for a message of BUILD SUCCESSFUL - if you don't see that, you probably need to look through the build errors to see what happened.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If you do see BUILD SUCCESSFUL, you probably have an error in you code. Your todo list row code should currently look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
      "fun TodoListRow(taskName: String) {\n" +
      "  var isComplete: Boolean = true\n" +
      "  Row(modifier = Modifier.height(64.dp)) {\n" +
      "    if (isComplete) {\n" +
      "      IconButton(onClick = { /*TODO*/ }) {\n" +
      "        Icon(\n" +
      "          imageVector = Icons.Filled.CheckCircle,\n" +
      "          contentDescription = \"Checkmark\",\n" +
      "        )\n" +
      "      }\n" +
      "    }\n" +
      "    Spacer(modifier = Modifier.width(12.dp))\n" +
      "    Text(text = taskName)\n" +
      "    IconButton(onClick = { /*TODO*/ }) {\n" +
      "      Icon(\n" +
      "        imageVector = Icons.Filled.Close,\n" +
      "        contentDescription = \"Checkmark\",\n" +
      "      )\n" +
      "    }\n" +
      "  }\n" +
      "  Divider()\n" +
      "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If your code looks right, but you are still having issues, don't forget to ask for help!")
    Spacer(modifier = Modifier.height(8.dp))
  }
}