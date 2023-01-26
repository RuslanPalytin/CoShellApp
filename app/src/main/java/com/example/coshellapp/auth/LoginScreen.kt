package com.example.coshellapp.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coshellapp.R
import com.example.coshellapp.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun LoginScreen() {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(darkIcons = true, color = Color.White)
    systemUiController.isNavigationBarVisible = false

    val textEmail = remember { mutableStateOf("") }
    val textPassword = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .padding(top = 32.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(0.5f),
            painter = painterResource(id = R.drawable.logo_and_title),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "SIGN IN", fontFamily = RubikMedium, fontSize = 26.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Looks like you don’t have an account. Let’s create a new account for you.",
            fontFamily = RubikRegular,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(40.dp))
        
        TextFieldCustom(label = "Email", state = textEmail)
        Spacer(modifier = Modifier.height(16.dp))
        TextFieldCustom(label = "Password", state = textPassword)
        
    }
}

@Composable
fun TextFieldCustom(label: String, state: MutableState<String>) {
    TextField(
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(
                text = label,
                fontFamily = InterRegular,
                fontSize = 16.sp,
                color = DarkGray
            )
        },
        value = state.value,
        onValueChange = { newText -> state.value = newText },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Gray,
            focusedIndicatorColor = Gray,
            unfocusedIndicatorColor = Gray,
            cursorColor = DarkGray
        ),
        shape = RoundedCornerShape(12.dp)
    )
}