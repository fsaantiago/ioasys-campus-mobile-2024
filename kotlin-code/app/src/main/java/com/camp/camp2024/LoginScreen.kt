package com.camp.camp2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.camp.camp2024.ui.theme.Pink90

@Composable
    fun LoginScreen() {
        var email by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = Pink90),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){

            Text(text = "Seja bem vind@!",
                color = Color.White,
                fontSize = 30.sp)

            Text(modifier = Modifier.padding(top = 16.dp),
                text = "Lista de tarefas",
                color = Color.White,
                fontSize = 24.sp)

            TextField(
                modifier = Modifier.fillMaxWidth()
                    .padding(
                        top = 48.dp,
                        bottom = 16.dp,
                        end = 16.dp,
                        start = 16.dp),
                value = email,
                onValueChange = { value -> email = value}, label = {
                    Text(text = "usuario")})
            TextField(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                value = password, onValueChange = { password = it}, label = {
                    Text(text = "senha")
                } )

            Button(onClick = {}) {}
        }

    }

    @Preview
    @Composable
    fun LoginScreenPreview() {
        LoginScreen();
    }
