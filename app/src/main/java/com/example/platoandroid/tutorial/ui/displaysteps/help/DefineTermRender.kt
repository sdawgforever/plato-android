package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DefineTermRender() {
  Column {
    Text(text = "`Render` means when the computer goes through your code and interprets it to build the UI it displays to the user.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The UI it builds will stay displayed to the user until there is another render pass where the computer again goes through your code and interprets it again to generate updated UI to display.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}