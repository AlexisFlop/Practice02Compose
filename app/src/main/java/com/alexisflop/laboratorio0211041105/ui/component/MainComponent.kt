package com.alexisflop.laboratorio0211041105.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainComponent(){
    ModifyTextComponent()
    AddNamesComponent()

}

@Preview(showSystemUi = true)
@Composable
fun MainComponentPreview(){
    MainComponent()
}