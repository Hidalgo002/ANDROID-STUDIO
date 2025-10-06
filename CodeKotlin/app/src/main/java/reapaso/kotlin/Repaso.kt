package reapaso.kotlin

fun main(args: Array<String>){
    /*var numero:Int = 0 //variable de clase int

    while (numero<=5){
        numero++;
        println("Another one "+numero)
    }

    var vueltas = 10

    println("Cuanta atrás")
    do {
        println(vueltas)
        vueltas--
    }while (vueltas!=0)

    for(i in 0..100){
        println("Vueltas "+i)
    }

    for (i in 1..10 step 2){
        //incrementamos de 2 en 2
        println(i)
    }*/



    print("Introduce tu peso en kilos: ")
    val peso = readln().toInt()

    print("Introduce tu altura en centimetros: ")
    var altura = readln().toInt()

    when{
        peso > 100 && altura < 100 -> print("GORDO")
        peso < 100 && altura > 100 -> print("DEATHCORE INSPO")
        else -> println("FUERA DE AQUI")

    }
    println("introduce el dia de la semana")
    var dia = readln().toInt()
    when(peso){
        1 -> print("Lunes")
        2 -> print("martes")
        3 -> print("miercoles")
        4 -> print("jueves")
        5 -> print("viernes")
        6 -> print("sabado")
        7 -> print("domingo")
        else ->print("Fuera de mi programa, aqui se viene uno duchado de casa")


    }

}