package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MutableStateOverview() {
  Column {
    Text(text = "MutableState is a data type that is wrapper. We can wrap any other data type within this to give some extra capabilities to the data type we provide through the MutableState wrapper around it.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "The key benefit this wrapper provides is observability.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Observability means that it has the ability to communicate with the view to tell the view when the value it holds changes to tell the view it may have outdated info.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}