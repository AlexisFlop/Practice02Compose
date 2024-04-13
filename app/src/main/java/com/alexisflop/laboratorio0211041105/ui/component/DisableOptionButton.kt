package com.alexisflop.laboratorio0211041105.ui.component

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.DialogProperties
import com.alexisflop.laboratorio0211041105.ui.data.buttonsStatus

@Composable
fun DisableOptionButton(modifier: Modifier = Modifier) {
    val dialogStatus: MutableState<Boolean> = remember { mutableStateOf(false) }
    val buttonsScope = remember {
        buttonsStatus
    }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        Button(onClick = {
            dialogStatus.value = !dialogStatus.value
        }) {
            Text(text = if (buttonsScope.value) "Disable buttons" else "Enable buttons")
        }
        if (dialogStatus.value) {
            AlertDialog(onDismissRequest = { dialogStatus.value = false },
                properties = DialogProperties(
                    dismissOnBackPress = true,
                    dismissOnClickOutside = false
                ),
                confirmButton = {
                    Button(onClick = {
                        Log.d("BEFORE", "$buttonsStatus" + "$buttonsScope")
                        buttonsStatus.value = !buttonsStatus.value
                        Log.d("AFTER", "$buttonsStatus" + "$buttonsScope")
                        dialogStatus.value = false
                    }) {
                        Text(text = "Confirm")

                    }
                },
                dismissButton = {
                    Button(onClick = {
                        dialogStatus.value = false
                    }) {
                        Text(text = "Cancel")
                    }
                },
                text = { Text(text = if (buttonsScope.value) "Disable buttons" else "Enable buttons") },
                title = { Text(text = "Confirmation") }
            )
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun DisableOptionButtonPreview() {
    DisableOptionButton()
}