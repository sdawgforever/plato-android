package com.example.platoandroid.tutorial.ui.displaysteps.five_state.help

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
fun RememberSyntaxExplained() {
  Column {
    Text(text = "`remember` is a function that takes in a parameter of another function.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "To visualize this, if you wer to implement the `remember` function yourself, it would look something like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "fun <T> remember(\n" +
        "  getMutableStateData: () -> MutableState<T>\n" +
        "): MutableState<T> {\n" +
        "  return getMutableStateData()\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "From looking at that definition, you probably expect our usage of `remember` to look like this though:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "remember(\n" +
        "  getMutableStateData = {\n" +
        "    mutableStateOf(todoItem.isComplete)\n" +
        "  }\n" +
        ")",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "So why can we write it like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "remember { mutableStateOf(todoItem.isComplete) }",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "The answer, is because Kotlin has a cool language feature where, if a function is the only or last parameter expected to be pass in, instead of providing it within the parentheses, you can just open up brackets after the ()")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "So in short, it's kotlin magic.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "But whats happening her, is that when `remember` decide we need the MutableState, it calls this `getMutableStateData` function we are passing it to retrieve the MutableState.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}
