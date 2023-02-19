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
fun StepEighteenCodeCheck() {
  Column {
    Text(text = "Your TodoListRow code should now look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoListRow(taskName: String) {\n" +
        "  var isComplete: Boolean = false\n" +
        "  Row {\n" +
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
    Text(text = "You may have selected a slightly different icon - if so, that's ok too! As long as it's an icon that conveys to the user they are removing the item there is not one right or wrong choice.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}