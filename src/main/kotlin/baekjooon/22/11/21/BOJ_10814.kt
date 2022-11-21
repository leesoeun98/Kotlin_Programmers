package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_10814 {
    // 25분 소요, 다른 사람 풀이 봄 (2회차 성공) - 간단하게 입력 순서대로 정렬되어 입력 받은거니, 나이만 정렬하면 됨
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val people = mutableListOf<List<String>>()
        for(i in 0 until br.readLine()!!.toInt()){
            val line = br.readLine()!!.split(' ')
            people.add(listOf(line[1], line[0], i.toString()))
        }

        val speople = people.sortedBy { it[1].toInt() }

        for(p in speople){
            println("${p[1]} ${p[0]}")
        }
    }
}