// 5분 소요, 혼자 풂 (1회차 성공) - 정렬 해주면 됨

import java.io.*
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