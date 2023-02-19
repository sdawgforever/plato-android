package com.example.platoandroid.tutorial.ui.displaysteps.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WhatDoesDpMean() {
  Column {
    Text(text = "`dp` is one unit of measure we use in programming to describe the size of things.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "In the case of code that looks like this: Modifier.width(16.dp)")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "we are saying we want the composable this Modifier is applied to to be 16 dp units wide.")
    Spacer(modifier = Modifier.height(16.dp))
  }
}