package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatIsABestPractice() {
  Column {
    Text(text = "A `Best Practice` is something that programmers generally agree is the best way to accomplish a certain task.")
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "In programming, there is usually many ways to do the same thing and create a certain result from our code but some approaches are better then others and may be more efficient, readable, or sustainable.")
    Spacer(modifier = Modifier.height(8.dp))
  }
}