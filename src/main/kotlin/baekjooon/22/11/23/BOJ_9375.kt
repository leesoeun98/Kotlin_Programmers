package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_9375 {
    // 6분 소요, 혼자 풂 (1회차 성공)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        for(i in 0 until br.readLine().toInt()){
            val clothesMap = mutableMapOf<String, MutableList<String>>()
            for(j in 0 until br.readLine().toInt()){
                val (name, type) = br.readLine().split(' ')
                if(!clothesMap.keys.contains(type)) clothesMap[type] = mutableListOf()
                clothesMap[type]!!.add(name)
            }
            var answer = 1
            // 안 입는 것도 가지수로 1개 추가
            clothesMap.keys.map{answer *= clothesMap[it]!!.count()+1}
            // 모두 안 입는 경우 1 빼기
            bw.write("${answer-1}\n")
        }
        bw.flush()
        bw.close()
    }
}