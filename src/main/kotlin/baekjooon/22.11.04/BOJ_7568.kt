// 총 58분 소요 - 반례, 힌트 참고해서 로직 수정
// 세로 배운 내용 - map, filter, list.joinToString()

import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val people = mutableListOf<MutableList<Int>>()

fun main(){
    val n = br.readLine()!!.toInt()

    repeat(n){
        val person = br.readLine()!!.split(" ").map{it.toInt()}.toMutableList()
        person.add(it)
        people.add(person)
    }

    for(i in 0 until n){
        people[i].add(people.filter { it[0] > people[i][0] && it[1] > people[i][1] }.count()+1)
    }

    println(people.sortedWith(compareBy { it[2] }).map { it[3] }.joinToString(" "))
}
