package com.example.holajetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DontMemoize
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holajetpack.ui.theme.HolaJetPackTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DosTextosVertical()
        }
    }
}


@Composable
fun DosTextosVertical (){

    Column (modifier = Modifier.fillMaxSize().padding(top=40.dp)) {
        Row () {
            Text("Caja 1")
            Spacer(modifier = Modifier.width(20.dp))
            Text("Caja 2")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text("Caja 1")
        Text("Caja 2")
    }
}

@Preview
@Composable
fun DosTextosVerticalPreview (){
    DosTextosVertical()
}


