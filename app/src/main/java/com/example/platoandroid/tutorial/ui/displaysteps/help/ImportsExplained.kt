package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ImportsExplained() {
  Column {
    Text(text = "Import means we are bring code from outside our project or current location in our project INSIDE the current location in our project so we can utilize the imported functionality.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "The imported functionality may be a value, class, or function someone else created outside our project or we created in a different location in our project.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "If the import is coming from somewhere outside your project - you will need to make sure you have the right dependencies to import it in your build.gradle file.")
    Text(text = "If you dont have the right dependencies, the computer won't be able to find the data you want to import.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}