package com.example.coshellapp.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coshellapp.R
import com.example.coshellapp.ui.theme.OnlyGreen
import com.example.coshellapp.ui.theme.RubikMedium
import com.example.coshellapp.ui.theme.RubikRegular
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun OnBoardingScreen() {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(darkIcons = false, color = Color.Black)
    systemUiController.isNavigationBarVisible = false

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f),
            horizontalAlignment = CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f),
                contentAlignment = BottomCenter
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterResource(id = R.drawable.on_boarding_background),
                    contentScale = ContentScale.Crop,
                    contentDescription = null
                )
                Image(
                    modifier = Modifier
                        .size(110.dp)
                        .padding(bottom = 20.dp),
                    painter = painterResource(id = R.drawable.on_boarding_logo),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = "CoShell", fontSize = 48.sp, fontFamily = RubikMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "A new way to control your home",
                fontSize = 16.sp,
                fontFamily = RubikRegular
            )
        }

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Center) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = OnlyGreen,
                    contentColor = Color.Black
                )
            ) {
                Text(modifier = Modifier.padding(8.dp), text = "GET STARTED", fontFamily = RubikMedium, fontSize = 14.sp)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen()
}