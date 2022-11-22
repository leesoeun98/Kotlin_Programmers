package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_15829 {
    // 20분 소요, 다른 사람 풀이 봄 (6회차 성공)
    // 1~5회차 실패: pow에 집착하지말자 어차피 범위 넘어감 + 문제 잘 읽기 (마지막에도 % 해야 함)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val alphabet = mutableListOf("a","b","c","d","e","f","g","h","i","j","k","l", "m","n","o","p","q","r","s","t","u","v","w","x","y","z")

    fun main(){
        val l = br.readLine()!!.toInt()
        val question = br.readLine().toList()

        val prime = 1234567891L
        var r = 1L
        var answer = 0L

        for(i in question.indices){
            val a = alphabet.indexOf(question[i].toString())+1
            answer += (a*r)%prime
            r = (r*31L)%prime
        }
        println(answer%prime)
    }

}