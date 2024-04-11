package com.alexisflop.laboratorio0211041105.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexisflop.laboratorio0211041105.ui.component.AddNamesComponent
import com.alexisflop.laboratorio0211041105.ui.component.DisableOptionButton
import com.alexisflop.laboratorio0211041105.ui.component.ModifyTextComponent

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ModifyTextComponent()
        AddNamesComponent()
        DisableOptionButton()
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}