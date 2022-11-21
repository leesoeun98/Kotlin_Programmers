package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_10816 {
    // 6분 소요, 혼자 풂 (1회차 성공) - hash 쓰기
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val n = br.readLine()!!.toInt()
        val cards = mutableMapOf<Int, Int>()
        for(num in br.readLine()!!.split(' ').map{it.toInt()}){
            if(!cards.keys.contains(num)){
                cards[num]=0
            }
            cards[num]=cards[num]!!+1
        }

        val m = br.readLine()!!.toInt()
        val answer = mutableListOf<Int>()
        for(num in br.readLine()!!.split(' ').map{it.toInt()}){
            if(cards.keys.contains(num)) answer.add(cards[num]!!)
            else answer.add(0)
        }
        println(answer.joinToString(" "))
    }
}