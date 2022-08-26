package com.suvorov.maraby

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

// Screen with TextField and button to greeting you using Snackbar
@Composable
fun GreetingScreen() {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    var textFieldState by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        scaffoldState = scaffoldState
    ) { padding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            TextField(
                value = textFieldState,
                label = {
                    Text("Enter your name")
                },
                onValueChange = {
                    textFieldState = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(16.dp))

            var buttonEnabledState by remember { mutableStateOf(true) }

            Button(
                onClick = {
                    val text = if (textFieldState.isNotEmpty()) {
                        "Hello, $textFieldState"
                    } else {
                        "Please enter your name"
                    }
                    coroutineScope.launch {
                        buttonEnabledState = false
                        scaffoldState.snackbarHostState.showSnackbar(text)
                        buttonEnabledState = true
                    }
                },
                enabled = buttonEnabledState
            ) {
                Text("Greet me")
            }
        }
    }
}