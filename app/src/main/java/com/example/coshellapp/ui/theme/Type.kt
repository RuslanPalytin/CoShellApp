package com.example.coshellapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.coshellapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
val RubikMedium = FontFamily(Font(R.font.rubik_medium))
val RubikRegular = FontFamily(Font(R.font.rubik_regular))
val InterRegular = FontFamily(Font(R.font.inter))