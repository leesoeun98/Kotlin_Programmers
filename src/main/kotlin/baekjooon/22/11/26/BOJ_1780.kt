package baekjooon.`22`.`11`.`26`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1780 {
    // 34분 소요, 이전 코드 봄 (3회차 성공) - 분할 정복인거는 알았으나 구체적인 구현을 못 함
    // 1회차 실패 - 로직도 좀 더럽고 시간초과
    // 2회차 실패 - 문제 제대로 안읽어서 return 위치 잘못함
    val br = BufferedReader(InputStreamReader(System.`in`))
    val paperCountMap = mutableMapOf(-1 to 0, 0 to 0, 1 to 0)
    val paperMap = mutableListOf<MutableList<Int>>()

    fun main(){
        val n = br.readLine()!!.toInt()
        for(i in 0 until n){
            paperMap.add(br.readLine()!!.split(' ').map{it.toInt()}.toMutableList())
        }
        cutThePaper(0,0,n)
        paperCountMap.values.map{println(it)}
    }

    fun cutThePaper(i:Int, j:Int, n: Int){
        // 모두 같은 지 확인
        for(row in i until i+n){
            for(col in j until j+n){
                if(paperMap[i][j]!=paperMap[row][col]){
                    for(x in 0 until 3){
                        for(y in 0 until 3){
                            cutThePaper(i+x*n/3,j+y*n/3,n/3)
                        }
                    }
                    return
                }
            }
        }
        val cur = paperMap[i][j]
        paperCountMap[cur] = paperCountMap[cur]!!+1
    }
}