package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0F2027), // Deep blue
                        Color(0xFF203A43), // Ocean blue
                        Color(0xFF2C5364), // Steel blue
                        Color(0xFFD4AF37), // Gold
                        Color(0xFFFFD700)  // Bright gold
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(
            painter = painterResource(
                id = R.drawable.profile_photo
            ),
            contentDescription = "Profile Photo",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(
                    width = 5.dp,
                    color = Color(0xFF2E7D32),
                    shape = CircleShape
                )
        )


        Spacer(
            modifier = Modifier.height(20.dp)
        )


        Text(
            text = "Fe Tangcalagan",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )


        Text(
            text = "Information Technology Student",
            fontSize = 18.sp,
            color = Color.Gray
        )


        Spacer(
            modifier = Modifier.height(30.dp)
        )


        ContactRow(
            icon = "☎",
            text = "+63 992 042 1391"
        )


        Spacer(
            modifier = Modifier.height(15.dp)
        )


        ContactRow(
            icon = "✉",
            text = "ftangcalagan03221@liceo.edu.ph"
        )
    }
}



@Composable
fun ContactRow(
    icon: String,
    text: String
) {

    Row(
        modifier = Modifier.clickable { },
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = icon,
            fontSize = 28.sp,
            color = Color(0xFF2E7D32)
        )


        Spacer(
            modifier = Modifier.width(12.dp)
        )


        Text(
            text = text,
            fontSize = 18.sp
        )
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardPreview() {

    MaterialTheme {
        BusinessCard()
    }
}
