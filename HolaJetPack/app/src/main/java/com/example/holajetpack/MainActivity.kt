package com.example.holajetpack

import android.os.Bundle
import android.text.style.BackgroundColorSpan
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
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntOffset
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.ui.graphics.graphicsLayer


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //DosTextosVertical()
            //EjercicioRowCol()
            //EjemploBox()
            //ImagenConTexto()
            //ImagenColor()
            ImagenConZoom()
        }
    }
}


//EJERCICIO 1
@Composable
fun DosTextosVertical () {

    Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp)) {
        Row() {
            Text("Caja 1")
            Spacer(modifier = Modifier.width(20.dp))
            Text("Caja 2")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text("Caja 1")
        Text("Caja 2")
    }
}

//EJERCICIO 2
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

//EJERCICIO 3
@Composable
fun EjemploBox(){
    Box(modifier = Modifier.fillMaxSize().padding(25.dp)){
        Text("Parte Superior Izquierda", modifier=Modifier.align(Alignment.TopStart))
        Text("Parte Central", modifier=Modifier.align(Alignment.Center))
        Text("Parte Inferior Derecha", modifier=Modifier.align(Alignment.BottomEnd))

    }
}

//EJERCICIO 4
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

//EJERCICIO 5
//@Composable no se utiliza porque yo solo voy a sacar un color, no interactua con el usuario para nada, solo voy a sacar un color aleaotrio

    fun randomColor(): Color{
        val rojo = (0..255).random()
        val verde = (0..255).random()
        val azul = (0..255).random()
    return Color(rojo,verde,azul)
    }

    @Composable
    fun ImagenColor(){
        var BackgroundColor by remember { mutableStateOf(Color.White) }

        var textPosition by remember { mutableStateOf(Offset(0f,0f)) }
        var imagePosition by remember { mutableStateOf(Offset(0f,0f)) }
        var botonPosition by remember { mutableStateOf(Offset(0f,0f)) }

        var anchoPantalla by remember { mutableStateOf(0f) }
        var altoPantalla by remember { mutableStateOf(0f) }
        var anchoTexto by remember { mutableStateOf(0f) }
        var altoTexto by remember { mutableStateOf(0f) }


        Box(modifier = Modifier.fillMaxSize().padding(40.dp).background(BackgroundColor)
            .onGloballyPositioned{coordenadas ->//SABER el tamaño del dispositivo sin tener que poner un ancho determinado, el size sh
                anchoPantalla = coordenadas.size.width.toFloat()
                altoPantalla = coordenadas.size.height.toFloat()

            }
        ) {

            Image(
                painter = painterResource(id = R.drawable.sr),
                contentDescription = "Silver y Russel",
                modifier = Modifier.offset{
                    IntOffset(imagePosition.x.toInt(), imagePosition.y.toInt())
                }.pointerInput(Unit ){
                    detectDragGestures { change, dragAmount ->
                        change.consume()//Para arrastrar el texto
                        imagePosition += Offset(dragAmount.x, dragAmount.y)
                    }
                }
            )

            Text(text="SILVER",
                fontSize = 50.sp,
                color = Color.Green,
                modifier = Modifier.offset{
                                    IntOffset(textPosition.x.toInt(), textPosition.y.toInt()) }

                                    .pointerInput(Unit ) {
                                        detectDragGestures { change, dragAmount ->
                                            change.consume()//Para arrastrar el texto
                                            textPosition += Offset(dragAmount.x, dragAmount.y)
                                        }
                                    }

                                    .onGloballyPositioned{coordenadas ->
                                        anchoTexto = coordenadas.size.width.toFloat()
                                        altoTexto = coordenadas.size.height.toFloat()
                                        if (textPosition == Offset(0f,0f)) {
                                            textPosition = Offset((anchoPantalla-anchoTexto)/2, (altoPantalla-altoTexto)/2)
                                        }
                                    }
            )

            Button(
                onClick = {BackgroundColor = randomColor()},
                modifier = Modifier.offset{
                    IntOffset(botonPosition.x.toInt(), botonPosition.y.toInt())
                }.pointerInput(Unit ){
                    detectDragGestures { change, dragAmount ->
                        change.consume()//Para arrastrar el texto
                        botonPosition += Offset(dragAmount.x, dragAmount.y)
                    }
                }
                ) {
                    Text("Cambiar Fondo")
                }
        }
    }


//EJERCICIO 6
@Composable
fun ImagenConZoom(){
    var escalaImagen by remember{mutableStateOf(1f)}
    var posicionImagen by remember{mutableStateOf(Offset(0f,0f))}

    Box(
        modifier = Modifier
                   .fillMaxSize()
                   .pointerInput(Unit){
                       detectTransformGestures{_, desplazamiento, zoom, _ ->
                           escalaImagen = escalaImagen * zoom
                           posicionImagen = posicionImagen + desplazamiento
                       }
                   }
                    , contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id=R.drawable.sr),
            contentDescription ="Silver Russel Cumpleaños",
            modifier = Modifier.graphicsLayer(
                scaleX = escalaImagen.coerceIn(0.5f,3f),//En mi eje x se va a poder hacer grande hasta el triple de tamaño
                scaleY = escalaImagen.coerceIn(0.5f,3f),//Ahora en mi ejeY. se puede hacer grande a lo alto y a lo ancho
                translationX = posicionImagen.x,
                translationY = posicionImagen.y,
            )
        )

    }
}

//EJERCICIO 1
@Preview
@Composable
fun EjercicioRowColPreview(){
    EjercicioRowCol()
}

//EJERCICIO 2
@Preview
@Composable
fun DosTextosVerticalPreview (){
    DosTextosVertical()
}

//EJERCICIO 3
@Preview
@Composable
fun EjemploBoxPreview(){
    EjemploBox()
}

//EJERCICIO 4
@Preview
@Composable
fun ImagenConTextoPreview(){
    ImagenConTexto()
}

//EJERCICIO 5
@Preview
@Composable
fun ImagenColorPreview(){
    ImagenColor()
}




