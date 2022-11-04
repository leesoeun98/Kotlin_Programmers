// 총 26분 소요 - 예전 코드 보고 로직 수정
// 새로 배운 내용 - Queue 구현

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val queue : Queue<Int> = LinkedList<Int>()
    val answer = mutableListOf<Int>()
    val (n,k) = br.readLine()!!.split(" ").map{it.toInt()}

    for(i in 1 until n+1){
        queue.add(i)
    }

    while(queue.isNotEmpty()){
        for(i in 0 until k-1){
            queue.add(queue.poll())
        }
        answer.add(queue.poll())
    }

    println("<"+answer.joinToString(", ")+">")
}
