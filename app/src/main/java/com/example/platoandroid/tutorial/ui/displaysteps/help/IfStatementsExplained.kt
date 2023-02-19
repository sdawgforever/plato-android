package com.example.platoandroid.tutorial.ui.displaysteps.help

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
fun IfStatementsExplained() {
  Column {
    Text(text = "If statements let us check if some condition is true or not and only execute a section of code on either a true result or a false result.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "To write an if statement, we use the keyword `if` followed by parentheses where we provide the condition and brackets where we put the code to be executed if true.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "This looks like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "if (SOME_TRUE_OR_FALSE_CONDITION) {\n" +
        "  /*do something when true here*/\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If we want to do something else when the condition is false, we can add an `else` branch.")
    Text(text = "This looks like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "if (SOME_TRUE_OR_FALSE_CONDITION) {\n" +
        "  /*do something when true here*/\n" +
        "} else {\n" +
        "  /*do something when false here*/\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "The conditions we check can either be boolean variables like this:")
    Text(
      text = "var myBoolean = false\n" +
        "if (myBoolean) {\n" +
        "  /*do something when true here*/\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Or some comparison like this:")
    Text(
      text = "var myNumber = 3\n" +
        "if (myNumber == 6) {\n" +
        "  /*do something when true here*/\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}