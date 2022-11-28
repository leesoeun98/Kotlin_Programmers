// 1분 소요, 혼자 풂 (1회차 성공)

import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
val S = mutableSetOf<Int>()

fun main(){
    for(i in 0 until br.readLine()!!.toInt()){
        val sentence = br.readLine()
        val cmd = sentence.split(' ')[0]
        when(cmd){
            "add"-> S.add(sentence.split(' ')[1].toInt())
            "remove" -> S.remove(sentence.split(' ')[1].toInt())
            "check" -> if(S.contains(sentence.split(' ')[1].toInt())) bw.write("1\n") else bw.write("0\n")
            "toggle"-> if(S.contains(sentence.split(' ')[1].toInt())) S.remove(sentence.split(' ')[1].toInt()) else S.add(sentence.split(' ')[1].toInt())
            "all"-> {
                S.clear()
                S.addAll(1..20)
            }
            "empty"->S.clear()
        }
    }
    bw.flush()
    bw.close()
}