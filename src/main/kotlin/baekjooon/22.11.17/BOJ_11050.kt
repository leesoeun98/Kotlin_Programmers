// 9분 소요, 혼자 풂 (2회차 성공)
// 1회차 실패 (k가 0일때 예외처리 안해서 runTimeException)

import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (n, k) = br.readLine()!!.split(' ').map{it.toInt()}
    if(k==0) println(1)
    else println((n downTo  n-k+1 ).reduce{acc,cur->acc*cur}/(1..k).reduce{acc, cur -> acc*cur})
}