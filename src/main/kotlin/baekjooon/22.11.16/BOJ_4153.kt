// 12분 소요, 혼자 풂 (Kotlin의 Lambda식 + pow 잘 쓰기, 문제 잘 읽기 - 최댓값 기준으로 생각해야 함)
// 2회차에 성공함

import java.io.*
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){

    while(true){
        val numList = br.readLine()!!.split(' ').map{it.toDouble()}.toList()
        if(numList.count { it == 0.0 } ==3)
            return
        else if(numList.maxOrNull()!!.pow(2) == numList.filter { it != numList.maxOrNull() }.sumOf { it.pow(2) })
            println("right")
        else
            println("wrong")
    }

}