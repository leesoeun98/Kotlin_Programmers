// 10분 소요, 혼자 풂 (2회차 성공)
// 1회차 실패 (시간 초과) - 맨 처음에는 List하나에 indexOf로 찾았는데 이를 Dict로 변경하기

import java.io.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
val poketmonMap = mutableMapOf<String, Int>()
val poketmonList = mutableListOf<String>()

fun main(){
    val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
    for(i in 1 until n+1){
        val poketmon = br.readLine()
        poketmonList.add(poketmon)
        poketmonMap[poketmon]=i
    }
    for(i in 0 until m){
        val question = br.readLine()!!
        if(question.toIntOrNull()==null){
            bw.write(poketmonMap[question].toString() +"\n")
        }
        else{
            bw.write(poketmonList[question.toInt()-1]+"\n")
        }
    }
    bw.flush()
    bw.close()
}