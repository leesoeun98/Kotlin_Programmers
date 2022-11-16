// 4분 소요, 혼자 풂 (문제 좀 잘 읽고 예외처리 하기) 2회차 성공

import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()

    for(i in 1 until n+1){
        if(i+i.toString().sumOf{it.code-'0'.code}==n){
            println(i)
            return
        }
    }
    println(0)
}