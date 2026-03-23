package com.selfhealthmedicare

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import com.selfhealthmedicare.R

@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(true) {
        delay(2000)
        navController.navigate("basicDetails")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFEBEE)),
        contentAlignment = Alignment.Center
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = painterResource(id = R.drawable.ic_heart_plus),
                contentDescription = "Logo",
                modifier = Modifier.size(110.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Self\nMedicare",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0A3556),
                lineHeight = 42.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

            Surface(
                modifier = Modifier.size(70.dp),
                shape = CircleShape,
                shadowElevation = 10.dp,
                color = Color.White
            ) {
                IconButton(onClick = {
                    navController.navigate("basicDetails")
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow),
                        contentDescription = "Next",
                        modifier = Modifier.size(45.dp)
                    )
                }
            }
        }
    }
}
