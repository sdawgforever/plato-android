package com.example.platoandroid.tutorial.ui.displaysteps.composebasics.help

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
fun StepThirteenIDontSeeChanges() {
  Column {
    Text(text = "If you still see the checkmarks, the first thing to check is always making sure your app built.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "At the bottom of Android Studio, click the build tab and make sure you it says `BUILD SUCCESSFUL`. If it doesn't, it probably failed to build. Look for red text to see what the errors were.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "The next thing to check is making sure your syntax is right.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Make sure isComplete = false & make sure the checkmark Icon code is all inside of the if statement brackets.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Here is what it should look like for comparison:")
    Text(
      text = "@Composable\n" +
        "fun TodoListRow(taskName: String) {\n" +
        "  var isComplete: Boolean = false\n" +
        "  Row {\n" +
        "    if (isComplete) {\n" +
        "      Icon(\n" +
        "        imageVector = Icons.Filled.CheckCircle,\n" +
        "        contentDescription = \"Checkmark\",\n" +
        "      )\n" +
        "    }\n" +
        "    Spacer(modifier = Modifier.width(12.dp))\n" +
        "    Text(text = taskName)\n" +
        "  }\n" +
        "  Divider()\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If you are still struggling to fix the problem, ask for help!")
    Spacer(modifier = Modifier.height(8.dp))
  }
}