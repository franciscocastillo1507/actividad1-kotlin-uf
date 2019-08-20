/*
Dado un arreglo A de N enteros positivos, encuentra el número de pares desordenados que sumados existan en el arreglo dado.

LIMITES

1 <= N <= 1000
1 <= A[i] <= 10^6 + 5

EJEMPLO INPUT

A: [3,4,2,6,7]

EJEMPLO OUTPUT

2

EXPLICACIÓN

Los pares que cumplen las condiciones dadas son:
(2,4) = 6
(3,4) = 7Dado un arreglo A de N enteros positivos, encuentra el numero de pares desordenados que sumados existan en el arreglo dado.

* */

//todo: Pseudocódigo


var caso1:ArrayList<Int> = arrayListOf(3,4,2,6,7) //2
var caso2:ArrayList<Int> = arrayListOf(1) //0
var caso3:ArrayList<Int> = arrayListOf(3,4,2,3,7) //2
var caso4:ArrayList<Int> = arrayListOf(44,20,114,45,68,142,70,12,256) //2

fun enterosPositivos(input:ArrayList<Int>):Int{
    println(input.size)
    //todo: Código
    return 0
}

enterosPositivos(caso1)
enterosPositivos(caso2)
enterosPositivos(caso3)
enterosPositivos(caso4)
