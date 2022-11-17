// 17분 소요, 혼자 풂 (4회차 성공)
// 1회차 실패 (시간초과) 입력 범위 꼭 보기
// 2회차 실패 (컴파일 에러, 오타 냄)
// 3회차 실패 (문제 안읽음 - 사전순 정렬 안 함)


import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (n,m) = br.readLine()!!.split(' ').map{it.toInt()}
    val nonListened = mutableMapOf<String, Int>()

    for(i in 0 until n){
        nonListened.put(br.readLine()!!.trim(), 1)
    }
    for(i in 0 until m){
        val name = br.readLine()!!.trim()
        if(nonListened.containsKey(name)){
            nonListened[name]=0
        }
    }
    val answer = nonListened.filter{it.value==0}.keys.toList().sorted()
    println(answer.size)
    for(a in answer){
        println(a)
    }

}