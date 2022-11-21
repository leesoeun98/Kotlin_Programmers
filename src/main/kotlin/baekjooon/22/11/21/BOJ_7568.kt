package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_7568 {
    // 6분 소요, 혼자 풂 (1회차 성공)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        // 키> 몸무게> 일 때 크다 (다 저장하고, 각자보다 큰 사람들 명수 구하면 끝)
        val n = br.readLine()!!.toInt()
        val people = mutableListOf<List<Int>>()
        for(i in 0 until n){
            val (w, h) = br.readLine()!!.split(' ').map{it.toInt()}
            people.add(listOf(w, h))
        }
        for(p in people){
            print((people.filter{it[0]>p[0] && it[1]>p[1]}.count()+1).toString() +" ")
        }
    }
}