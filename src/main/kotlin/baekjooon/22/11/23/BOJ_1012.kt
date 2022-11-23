package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_1012 {
    // 22분 소요, 혼자 풂 (1회차 성공) - dfs 탐색 + 구현
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val xDirection = mutableListOf(-1, 0, 1, 0)
    val yDirection = mutableListOf(0, -1, 0, 1)

    fun main(){
        for(i in 0 until br.readLine().toInt()){
            val (m, n, k) = br.readLine().split(' ').map{it.toInt()}

            // ground 생성
            val ground = mutableListOf<MutableList<Int>>()
            for(row in 0 until n){
                ground.add(MutableList(m){0})
            }
            for(cabbage in 0 until k){
                val (x, y) = br.readLine().split(' ').map{it.toInt()}
                ground[y][x]=1
            }

            // cabbage 탐색 (dfs)
            var cabbageGroup = 0
            for(row in 0 until n){
                for(col in 0 until m){
                    // 배추가 있으면
                    if(ground[row][col]==1){
                        val stack = mutableListOf<List<Int>>()

                        stack.add(listOf(row, col))
                        ground[row][col]=0

                        while(stack.isNotEmpty()){
                            val cur = stack.removeLast()
                            // 상하좌우 탐색
                            for(d in 0 until 4){
                                val next = listOf(xDirection[d]+cur[0], yDirection[d]+cur[1])
                                if(next[0] in 0 until n && next[1] in 0 until m && ground[next[0]][next[1]]==1){
                                    stack.add(next)
                                    ground[next[0]][next[1]]=0
                                }
                            }
                        }
                        cabbageGroup+=1
                    }
                }
            }
            bw.write("${cabbageGroup}\n")
        }
        bw.flush()
        bw.close()
    }
}