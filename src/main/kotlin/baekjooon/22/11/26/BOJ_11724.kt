package baekjooon.`22`.`11`.`26`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_11724 {
    // 15분 소요, 반례 봄 (3회차 성공) - 그래프 문제, dfs로 연결 요소 모두 탐색해서 개수 셈
    // 1~2회차 실패 - 42% 틀림 (1개만 주어질 때 예외처리 안 함)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val graph = mutableMapOf<Int, MutableList<Int>>()
    val isVisited = mutableListOf<Int>()
    var count = 0

    fun main(){
        val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
        for(i in 0 until m){
            val (start, end) = br.readLine()!!.split(' ').map{it.toInt()}
            if(!graph.keys.contains(start)) graph[start] = mutableListOf()
            if(!graph.keys.contains(end)) graph[end] = mutableListOf()
            graph[start]!!.add(end)
            graph[end]!!.add(start)
        }
        for(u in 1 until n+1){
            if(!isVisited.contains(u)){
                count+=1
                dfs(u)
            }
        }
        println(count)
    }

    fun dfs(node:Int){
        isVisited.add(node)

        if(graph[node]!=null){
            for(next in graph[node]!!){
                if(!isVisited.contains(next)){
                    dfs(next)
                }
            }
        }
    }
}