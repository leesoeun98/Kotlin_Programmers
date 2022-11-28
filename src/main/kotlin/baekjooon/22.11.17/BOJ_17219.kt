// 5분 소요, 혼자 풂 (1회차 성공) - hash랑 bw, br 쓰기

import java.io.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
val passwords = mutableMapOf<String,String>()

fun main(){
    val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
    for(i in 0 until n){
        val (add, pass) = br.readLine()!!.split(' ')
        passwords[add]=pass
    }
    for(i in 0 until m){
        bw.write(passwords[br.readLine()!!.trim()]+"\n")
    }
    bw.flush()
    bw.close()
}