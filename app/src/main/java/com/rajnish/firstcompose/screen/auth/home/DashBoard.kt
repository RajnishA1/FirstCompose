package com.rajnish.firstcompose.screen.auth.home



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DashboardPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Dashboard",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "Button 1")
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "Button 2")
        }
        Button(
            onClick = { /* Handle button click */ }
        ) {
            Text(text = "Button 3")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Recent Activity",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "No recent activity.",
            color = Color.Gray
        )
        RadioButton(selected = true, onClick = { /*TODO*/ })
        Checkbox(checked = true, onCheckedChange = {})
        var state by remember {
            mutableStateOf(true)
        }
        Switch(
            checked = state,
            onCheckedChange = {
                state = it
            }
        )
    }
}


