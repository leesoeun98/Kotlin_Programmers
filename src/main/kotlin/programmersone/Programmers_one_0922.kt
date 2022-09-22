package programmersone

class Programmers_one_0922 {

    // String처리는 joinToString의 람다식 이용하기, map에 index도 같이 돌릴거면 mapIndexed 이용하기 
    fun makingStrangeString(s: String) = s.split(" ").joinToString(" ") {
        word ->
        word.mapIndexed{ index, c -> if(index%2==0) c.uppercase() else c.lowercase() }.joinToString("")}

}