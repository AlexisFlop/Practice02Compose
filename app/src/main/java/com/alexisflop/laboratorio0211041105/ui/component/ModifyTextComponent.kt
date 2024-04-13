package com.alexisflop.laboratorio0211041105.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexisflop.laboratorio0211041105.ui.data.buttonsStatus

@Composable
fun ModifyTextComponent(modifier: Modifier = Modifier) {
    val pressedCounter: MutableState<Int> = remember {
        mutableStateOf(0)
    }

    val buttonsScope = remember {
        buttonsStatus
    }

    Column(
        modifier = modifier.fillMaxWidth().background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "The button has been pressed ${pressedCounter.value} times")
        Button(
            enabled = buttonsScope.value,
            onClick = {
                pressedCounter.value++
            }

        ) {
            Text(text = "Increase counter")
        }
    }


}

@Preview(showSystemUi = false)
@Composable
private fun ModifyTextComponentPreview() {
    ModifyTextComponent()
}