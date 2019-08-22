package com.test.actividad1.Actividad1

/*
* DOC APOYO: https://kotlinlang.org/docs/reference/basic-types.html
* KOTLIN KOANS: https://play.kotlinlang.org/koans/overview
* */


var caso1:ArrayList<Int> = arrayListOf(3,4,2,6,7) //2
var caso2:ArrayList<Int> = arrayListOf(1) //0
var caso3:ArrayList<Int> = arrayListOf(3,4,2,3,7) //2
var caso4:ArrayList<Int> = arrayListOf(44,20,114,45,68,142,70,12,256) //2
var max = 300

fun enterosPositivos(input:ArrayList<Int>):Int{
    println("Tamano de la entrada: " + input.size)
    var hash = ArrayList<Int> (max)
    for (x in 0 until max)
        hash.add(0)
    for(x in 0 until input.size)
        hash[input[x]] = hash[input[x]].inc()
    var res = 0
    for (x in 0 until input.size) {
        var y = input[x]
        for (z in 0 until input.size){
            if (input[z] < y){
                res += hash[y-input[z]]
                if ((input[z] == y/2) && (y%2 == 0) && (hash[y-input[z]] > 0))
                    res-=1
            }
        }
    }
    res /= 2
    println("Resultado: " +  res)
    return 0
}
println("Caso 1:")
enterosPositivos(caso1)
println("Caso 2:")
enterosPositivos(caso2)
println("Caso 3:")
enterosPositivos(caso3)
println("Caso 4:")
enterosPositivos(caso4)
