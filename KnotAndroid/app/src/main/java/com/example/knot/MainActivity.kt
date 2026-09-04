package com.example.knot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.knot.ui.theme.KnotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KnotTheme {
//              //state management
                var page by remember { mutableIntStateOf(1) }

                if (page == 1) {
                    Homepage(
                        onClickNext = { page = 2 }
                    )
                } else {
                    AnotherPage(onBackClick = { page = 1 })
                }
            }
        }
    }
}

@Composable
fun Homepage(onClickNext: () -> Unit) {

    Column {
        Text(text = "knot",modifier = Modifier.padding(60.dp))
        Button(onClick = onClickNext, modifier = Modifier.padding(60.dp)) {
            Text("go next page")
        }
    }
}