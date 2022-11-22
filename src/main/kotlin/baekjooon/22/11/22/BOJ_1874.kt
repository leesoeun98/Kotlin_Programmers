package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_1874 {
    // 1시간 16분, 혼자 풂 (1회차 성공) - 구현 및 예외처리 능력 기르기 좋은 문제
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        val n = br.readLine()!!.toInt()
        val stack = MutableList(n){i->i+1}
        val answerString = mutableListOf<String>()
        val answerInt = mutableListOf<Int>()
        val questionStack = mutableListOf<Int>()
        var index = 0

        for(i in 0 until n){
            questionStack.add(br.readLine()!!.toInt())
        }

        while(answerInt.isNotEmpty() || stack.isNotEmpty()){
            // answerInt의 마지막이 questionStack[index]보다 작거나 answerInt가 empty면
            // answerInt에 stack꺼 push
            if(answerInt.isEmpty() || (answerInt.isNotEmpty() && answerInt.last()<questionStack[index])){
                while(stack.isNotEmpty()){
                    if(answerInt.isNotEmpty() && answerInt.last()==questionStack[index]) break
                    answerInt.add(stack.first())
                    answerString.add("+")
                    stack.removeAt(0)
                }
            }
            // answerInt의 마지막이 questionStack[index]보다 크면
            // answerInt의 마지막이 questionStack[index]랑 같아질 때까지 answerInt pop
            else if(answerInt.isNotEmpty() && answerInt.last()>questionStack[index]){
                while(answerInt.isNotEmpty()){
                    if(answerInt.isNotEmpty() && answerInt.last()==questionStack[index]) break
                    answerInt.removeAt(answerInt.lastIndex)
                    answerString.add("-")
                }
            }
            // answerInt의 마지막이 questionStack[index]보다 같으면 pop
            if(answerInt.isNotEmpty() && answerInt.last()==questionStack[index]){
                answerInt.removeAt(answerInt.lastIndex)
                answerString.add("-")
                index+=1
            }
        }
        if(index==questionStack.size) answerString.map{bw.write(it+"\n")} else println("NO")
        bw.flush()
        bw.close()
    }
}