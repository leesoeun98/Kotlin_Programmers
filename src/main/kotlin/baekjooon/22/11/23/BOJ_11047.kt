package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_11047 {
    // 6분 소요, 혼자 풂 (1회차 성공) : 그리디, 내림차순 정렬 후 큰거부터 가능한 개수 다 채우기
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val (n, k) = br.readLine()!!.split(' ').map{it.toInt()}
        val coinValue = mutableListOf<Int>()
        var answer = 0
        var curValue = k

        for(i in 0 until n){
            coinValue.add(br.readLine()!!.toInt())
        }

        coinValue.sortDescending()

        for(value in coinValue){
            val count = curValue/value
            curValue-=value*count
            answer+=count
        }

        println(answer)
    }
}