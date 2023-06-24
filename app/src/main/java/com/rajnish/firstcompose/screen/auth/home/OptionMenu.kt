package com.rajnish.firstcompose.screen.auth.home


import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionMenu() {
    var showMenu by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    
    TopAppBar (
        title = { Text(text = "My App")},
        actions = {
            IconButton(onClick = { Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show() }) {
                Icon(Icons.Default.Favorite, contentDescription ="" )
            }
            IconButton(onClick = { showMenu = !showMenu }) {
                Icon(Icons.Default.MoreVert, contentDescription ="" )
            }
            DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {
                DropdownMenuItem(text = { Text(text = "Setting") }, onClick = {
                    Toast.makeText(
                        context,
                        "Setting clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                })



                DropdownMenuItem(text = { Text(text = "About Us") }, onClick = {
                    Toast.makeText(
                        context,
                        "About-us clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                })

            }
        }
    )
        


}