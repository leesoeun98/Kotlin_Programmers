// 13분 소요, 혼자 풂 (IDE안쓰고 백준 쓰니까 오타 및 컴파일 에러 많이 남)
// 5회차 성공
// 1차 실패 - 컴파일 에러 (for문 i는 val이므로 var처럼 쓸 수 없음)
// 2차 실패 - 시간 초과 (while문 잘못 씀) 급하게 하지 말자
// 3차 실패 - 틀림 (역시나 급하게 해서 min, max 바꿔 씀)

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()
    var count2 = 0
    var count5 = 0

    // 0의개수는 2, 5 개수에 따라달라짐
    for(i in 1 until n+1){
        var temp = i
        while(temp%2==0){
            temp=temp/2
            count2+=1
        }
        while(temp%5==0){
            temp=temp/5
            count5+=1
        }
    }
    println(min(count2, count5))
}