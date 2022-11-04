// 총 15분 소요 - 혼자 풂
// 새로 배운 내용 - Kotlin 입출력, for문 내 i 이용한 간격 계산에 약함!

import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()

    println("*".repeat(n) + " ".repeat(n*2-3) + "*".repeat(n))

    for(i in 1 until n){
        if(i==n-1){
            println(" ".repeat(i) + "*" + " ".repeat(n-2) + "*" + " ".repeat(n-2) + "*")
        }
        else{
            println(" ".repeat(i) + "*" + " ".repeat(n-2) + "*" + " ".repeat(2*(n-i-1)-1) + "*"+ " ".repeat(n-2) + "*")
        }
    }

    for(i in n-2 downTo 1 ){
        println(" ".repeat(i) + "*" + " ".repeat(n-2)+ "*" + " ".repeat(2*(n-i-1)-1) + "*" + " ".repeat(n-2)+ "*")
    }

    println("*".repeat(n) + " ".repeat(n*2-3) + "*".repeat(n))
}
