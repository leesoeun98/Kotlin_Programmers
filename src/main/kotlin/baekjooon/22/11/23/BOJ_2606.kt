package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_2606 {
    // 10분 소요, 다른 사람 풀이 봄 (1회차 성공) - dfs + stack으로 풀기
    // dfs + stack (bfs +queue)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val n = br.readLine().toInt()
        val k = br.readLine().toInt()
        val computerMap = mutableMapOf<Int, MutableList<Int>>()
        val virusStack = mutableListOf<Int>()
        val isVisited = mutableListOf<Int>()

        for(i in 0 until k){
            val (start, end) = br.readLine().split(' ').map{it.toInt()}
            if(!computerMap.keys.contains(start)) computerMap[start]= mutableListOf()
            if(!computerMap.keys.contains(end)) computerMap[end]= mutableListOf()
            computerMap[start]!!.add(end)
            computerMap[end]!!.add(start)
        }

        virusStack.add(1)
        isVisited.add(1)

        while(virusStack.isNotEmpty()){
            val node = virusStack.removeLast()
            if(!isVisited.contains(node)){
                isVisited.add(node)
            }
            computerMap[node]!!.forEach {
                if(!isVisited.contains(it)){
                    virusStack.add(it)
                }
            }
        }
        println(isVisited.size-1)
    }
}