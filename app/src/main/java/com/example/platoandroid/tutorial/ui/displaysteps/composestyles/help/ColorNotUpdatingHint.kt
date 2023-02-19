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

@Composable
fun ColorNotUpdatingHint() {
  Column {
    Text(text = "Look for this section of code:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "private val LightColorPalette = lightColors(\n" +
      "  primary = MutedTone, // <<<<<<< Hint, hint, here's the one you want to change! Replace 'MutedTone'\n" +
      "  primaryVariant = FunOrange,\n" +
      "  secondary = PrimaryBlue,\n" +
      "  secondaryVariant = VariantBlue,\n" +
      "  background = Color.White,\n" +
      "  surface = Color.White,\n" +
      "  onPrimary = MutedToneAccent,\n" +
      "  onSecondary = Color.Black,\n" +
      "  onBackground = Color.Black,\n" +
      "  onSurface = Color.Black,\n" +
      ")",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Replace `MutedTone` with the name of the variable you created and set your color to.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}