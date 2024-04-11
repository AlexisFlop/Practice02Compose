package com.alexisflop.laboratorio0211041105.ui.component

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexisflop.laboratorio0211041105.ui.data.nameList

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun AddNamesComponent() {
    val nameListState = remember {nameList}
    val name: MutableState<String> = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "You can add names on this section")
        OutlinedTextField(
            value = name.value, onValueChange = { name.value = it },
            singleLine = true,
            placeholder = { Text(text = "Enter name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Sentences,
                autoCorrect = true)
        )
        Button(onClick = {
            nameList.add(name.value)
            name.value = ""
            Log.d("Name List", nameListState.toString())
        }) {
            Text(text = "Add name")
        }

        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .border(3.dp, Color.Black)
            .height(100.dp)) {
            itemsIndexed(nameListState) { index, name ->
                Text(text = "Item #$index: $name")
            }
        }
    }

}

@Preview(showSystemUi = false)
@Composable
fun AddNamesComponentPreview() {
    AddNamesComponent()
}