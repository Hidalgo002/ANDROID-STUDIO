package com.example.holajetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //DosTextosVertical()
            //EjercicioRowCol()
            //EjemploBox()
            ImagenConTexto()
        }
    }
}

/*
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


@Composable
fun EjercicioRowCol(){
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Text("Segundo Texto")
            Spacer(modifier = Modifier.width(20.dp))
            Text("Tercer Texto")

        }
        Column (modifier = Modifier.fillMaxSize().padding(top=40.dp)) {
            Text("Primer Texto")
            Text("Segundo Texto")
        }
    }
}

@Composable
fun EjemploBox(){
    Box(modifier = Modifier.fillMaxSize().padding(25.dp)){
        Text("Parte Superior Izquierda", modifier=Modifier.align(Alignment.TopStart))
        Text("Parte Central", modifier=Modifier.align(Alignment.Center))
        Text("Parte Inferior Derecha", modifier=Modifier.align(Alignment.BottomEnd))

    }
}*/

@Composable
fun ImagenConTexto() {
    Box(modifier = Modifier.fillMaxSize().padding(25.dp)) {
        Image(
            painter = painterResource(id = R.drawable.sr),
            contentDescription = "Silver y Russel",
            modifier = Modifier.align(Alignment.Center)
        )

        Text(text="SILVER",
            fontSize = 50.sp,
            color = Color.Green,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center))
    }
}


/*@Preview
@Composable
fun EjercicioRowColPreview(){
    EjercicioRowCol()
}

@Preview
@Composable
fun DosTextosVerticalPreview (){
    DosTextosVertical()
}


@Preview
@Composable
fun EjemploBoxPreview(){
    EjemploBox()
}*/

@Preview
@Composable
fun ImagenConTextoPreview(){
    ImagenConTexto()
}



