package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatIsAlignment() {
  Column {
    Text(text = "Alignment refers to how elements are aligned within the view. There are three main alignment options:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "1. Top / Start Aligned - elements are pulled to the top or start of the Column or Row")
    Text(text = "2. Center Aligned - elements are pulled to the center of the Column or Row")
    Text(text = "3. Bottom / End Aligned - elements are pulled to the bottom or end of the Column or Row")
    Spacer(modifier = Modifier.height(16.dp))
  }
}