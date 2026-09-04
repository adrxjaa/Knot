package com.example.knot

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AnotherPage(onBackClick:()-> Unit){
    Column{
    Text("trying to nav",modifier = Modifier.padding(60.dp))
    Button(onClick=onBackClick, modifier = Modifier.padding(60.dp)){
        Text("go back")}
    }
}