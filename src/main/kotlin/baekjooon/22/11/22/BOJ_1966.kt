package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class BOJ_1966 {
    // 13분 소요, 혼자 풂 (1회차 성공) : queue쓰기
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        for(i in 0 until br.readLine().toInt()){
            val (n, target) = br.readLine().split(' ').map{it.toInt()}
            val documents : Queue<List<Int>> = LinkedList<List<Int>>()
            val answer = mutableListOf<List<Int>>()
            val inputs = br.readLine().split(' ').map{it.toInt()}
            inputs.mapIndexed { index, priority -> documents.add(listOf(priority, index))}

            while(documents.isNotEmpty()){
                val cur = documents.poll()
                if(documents.isNotEmpty() && cur[0] < documents.map { it[0] }.maxOrNull()!!) documents.add(cur)
                else answer.add(cur)
            }
            println(answer.indexOf(answer.filter { it[1]==target }[0])+1)
        }
    }
}