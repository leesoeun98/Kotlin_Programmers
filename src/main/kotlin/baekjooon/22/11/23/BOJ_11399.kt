package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_11399 {
    // 6분 소요, 혼자 풂 (1회차 성공) - sort()한 후 누적합 구하면 됨
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(' ').map{it.toInt()}.toList()
        val speople = inputs.sorted()

        var answer = 0
        for(i in 0 until speople.size){
            for(j in 0 until i+1){
                answer+=speople[j]
            }
        }
        println(answer)
    }
}