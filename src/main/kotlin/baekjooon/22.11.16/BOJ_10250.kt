// 25분 소요, 혼자 풂 (테스트 케이스 언제나 최소값, 최대값 넣어보고 확인하기 + 예외처리 잘하기!)
// 3회차에 성공함

import java.io.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()
    for(i in 0 until n){
        val (H, W, N) = br.readLine().split(' ').map{it.toInt()}
        val num = if(N%H==0) N/H else N/H+1
        println("${if(N%H==0) H else N%H}${if(num.toString().length<2) "0" else ""}${num}")
    }
}