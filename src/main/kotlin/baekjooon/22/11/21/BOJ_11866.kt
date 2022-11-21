package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class BOJ_11866 {
    // 7분 소요, 혼자 풂 (1회차 성공) - Kotlin Queue 쓰는 법 잊지 않기

    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val (n, k) = br.readLine()!!.split(' ').map{it.toInt()}
        val numList : Queue<Int> = LinkedList<Int>()
        val answer = mutableListOf<Int>()

        for(i in 1 until n+1){
            numList.add(i)
        }

        while(!numList.isEmpty()){
            for(i in 0 until k-1){
                numList.add(numList.poll())
            }
            answer.add(numList.poll())
        }
        println("<"+answer.joinToString(", ")+">")
    }
}