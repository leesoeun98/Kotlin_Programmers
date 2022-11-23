package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class BOJ_1260 {
    // 44분 소요, 다른 사람 풀이 봄 (3회차 성공) - dfs를 재귀로 풀자
    // 1회차 실패 - nullPointError (!! 함부로 쓰지 말자)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val graph = mutableMapOf<Int,MutableList<Int>>()
    val dfsAnswer = mutableListOf<Int>()
    val bfsAnswer = mutableListOf<Int>()

    fun main(){
        val (n, m, v) = br.readLine().split(' ').map{it.toInt()}

        for(i in 0 until m){
            val (start, end) = br.readLine().split(' ').map{it.toInt()}
            if(!graph.keys.contains(start)) graph[start]= mutableListOf()
            if(!graph.keys.contains(end)) graph[end]= mutableListOf()
            graph[start]!!.add(end)
            graph[end]!!.add(start)
        }
        for(key in graph.keys){
            graph[key]!!.sort()
        }
        dfs(v)
        bfs(v)

        println(dfsAnswer.joinToString(" "))
        println(bfsAnswer.joinToString(" "))
    }

    fun dfs(start:Int){
        val stack = mutableListOf<Int>()
        stack.add(start)
        dfsAnswer.add(start)

        while(stack.isNotEmpty()){
            val cur = stack.removeLast()
            if(graph[cur]!=null){
                for(node in graph[cur]!!){
                    if(!dfsAnswer.contains(node)){
                        dfs(node)
                    }
                }
            }
        }
    }

    fun bfs(start: Int){
        val queue : Queue<Int> = LinkedList()

        queue.add(start)
        bfsAnswer.add(start)

        while(queue.isNotEmpty()){
            val cur = queue.poll()
            // 연결된 걸 바로 탐색하는게 아니라, 순서대로 다 탐색
            if(graph[cur]!=null){
                for(node in graph[cur]!!){
                    if(!bfsAnswer.contains(node)){
                        queue.add(node)
                        bfsAnswer.add(node)
                    }
                }
            }
        }
    }
}