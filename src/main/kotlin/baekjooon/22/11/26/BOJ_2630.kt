package baekjooon.`22`.`11`.`26`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_2630 {
    // 10분 소요, 혼자 풂 (1회차 성공) - 분할정복, 구현법만 잘 알아두자
    val br = BufferedReader(InputStreamReader(System.`in`))
    val paperCount = mutableMapOf<Int, Int>(0 to 0, 1 to 0)
    val paperMap = mutableListOf<MutableList<Int>>()

    fun main(){
        val n = br.readLine().toInt()
        for(i in 0 until n){
            paperMap.add(br.readLine().split(' ').map{it.toInt()}.toMutableList())
        }
        cutThePaper(0,0,n)
        paperCount.values.map{println(it)}
    }

    fun cutThePaper(i:Int, j:Int, n:Int){
        for(row in i until i+n){
            for(col in j until j+n){
                if(paperMap[i][j]!=paperMap[row][col]){
                    for(x in 0 until 2){
                        for(y in 0 until 2){
                            cutThePaper(i+x*n/2, j+y*n/2,n/2)
                        }
                    }
                    return
                }
            }
        }
        val cur = paperMap[i][j]
        paperCount[cur] = paperCount[cur]!!+1
    }
}