package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_11650 {
    // 5분 소요, 혼자 풂 (1회차 성공) - sortedWith, sortedBy 차이 알기
    val br = BufferedReader(InputStreamReader(System.`in`))
    val points = mutableListOf<List<Int>>()
    fun main(){
        for(i in 0 until br.readLine()!!.toInt()){
            points.add(br.readLine()!!.split(' ').map{it.toInt()})
        }
        val spoints = points.sortedWith(compareBy ({ it[0] }, {it[1]}))
        for(p in spoints){
            println("${p[0]} ${p[1]}")
        }
    }
}