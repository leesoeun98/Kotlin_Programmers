package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_10828 {
    // 8분 소요, 혼자 풂 (1회차 성공)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        val stack = mutableListOf<Int>()

        for(i in 0 until br.readLine()!!.toInt()){
            val sentence = br.readLine()
            val cmd = sentence.split(' ')[0]

            when(cmd){
                "push"->stack.add(sentence.split(' ')[1].toInt())
                "pop"->{
                    if(stack.size>0){
                        bw.write(stack.last().toString() +"\n")
                        stack.removeAt(stack.lastIndex)
                    }
                    else bw.write("-1"+"\n")
                }
                "size"->bw.write(stack.size.toString()+"\n")
                "empty"->bw.write("${if(stack.size==0) 1 else 0}\n")
                "top"->bw.write("${if(stack.size==0) -1 else stack.last()}\n")
            }
        }
        bw.flush()
        bw.close()
    }
}