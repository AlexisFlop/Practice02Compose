package com.alexisflop.laboratorio0211041105.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ModifyTextComponent(modifier = Modifier.weight(2f))
        AddNamesComponent(modifier = Modifier.weight(1f))
        DisableOptionButton(modifier = Modifier.weight(1f).fillMaxWidth())
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}