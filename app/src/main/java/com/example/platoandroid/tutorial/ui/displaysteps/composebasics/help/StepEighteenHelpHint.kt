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
fun StepEighteenHelpHint() {
  Column {
    Text(text = "The X icon will use the same Icon & IconButton code we used for the checkmark that looks like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "IconButton(onClick = { /*TODO*/ }) {\n" +
      "        Icon(\n" +
      "          imageVector = Icons.Filled.CheckCircle,\n" +
      "          contentDescription = \"Checkmark\",\n" +
      "        )\n" +
      "      }",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Copy and paste your checkmark Icon & IconButton code and put it inside the Row but as the last element in the Row.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Putting it last will make it show up at the end.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Lastly, you will need to update which icon image resource it's using so we show an X instead of the checkmark.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "In a browser, visit Android's documentation to help select the right Icon image:")
    Text(text = "https://developer.android.com/reference/kotlin/androidx/compose/material/icons/Icons")
    Spacer(modifier = Modifier.height(8.dp))
  }
}