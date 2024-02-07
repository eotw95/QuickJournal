package com.example.quickjournal.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun JournalApp() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        repeat(30) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                val keyboardController = LocalSoftwareKeyboardController.current
                var inputText by remember { mutableStateOf("") }

                TextField(
                    value = inputText,
                    onValueChange = {
                        inputText = it
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            // Todo: store text in DB
                            keyboardController?.hide()
                        }
                    )
                )
            }
        }
    }
}