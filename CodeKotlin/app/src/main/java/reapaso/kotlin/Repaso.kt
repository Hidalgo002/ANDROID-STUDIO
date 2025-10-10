package reapaso.kotlin

import kotlin.math.cos

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
    }



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

    //RECTÁNGULO
    fun areaRectangulo(alto:Int, ancho:Int): Int {
        return alto * ancho
    }

        print("Altura: ")
        var alt = readln().toInt()
        print("Ancho: ")
        var anch = readln().toInt()
        println("Area del cuadrado: ${areaRectangulo(alt, anch)} ")

    //CUADRADO
    fun areaCuadrado(lado:Int) = lado * lado

        print("Lado: ")
        var lado2 = readln().toInt()
        print("Area del cuadrado:${areaCuadrado(lado2)}")





    //QUE APAREZCAN DATOS POR DEFECTO
    fun datosCurso(centro:String, titulacion:String="DAM"){
        println("Centro: "+centro+" --> Titulacion: "+titulacion)
    }
    datosCurso("Santo Domingo savio")
    datosCurso("Valle Inclán", "Administracion y Finanazas")


    //KOTLIN ORDERNA DIRECTAMENTE LOS PARÁMETROS SI SE RESPETA EL NOMBRE, es decir, si no recordamos
    // el orden de los parámetros pero si los nombres, podemos escribirlos y se ordenaran autmaticamete en el constructor
    fun costeKilometro(matricula:String, costeKilomtro: Double, kilometro:Double){
        var costeTotal = costeKilomtro * kilometro
        println("El coste total del coche ["+matricula+"] -> "+costeTotal)
    }
    costeKilometro("9875 GFT",0.148,265.8)
    costeKilometro(costeKilomtro = 0.15, kilometro = 89.8, matricula = "8756 PLA")
    costeKilometro( kilometro= 0.85,  costeKilomtro= 145.0, matricula = "3467 PLA")


    var alumnos: IntArray
    alumnos = IntArray(5)

    println("Mete la nota del alumno: ")
    for (i in 0..4){
        println("Nota["+i+"]: ")
        alumnos[i] = readln().toInt()
    }

    println("-----NOTAS-----")
    for (i in 0..4){
        println(alumnos[i])
    }
*/

    val profesor1 = Profesor("James", 42)
    profesor1.imprimirDatosProfe()

}