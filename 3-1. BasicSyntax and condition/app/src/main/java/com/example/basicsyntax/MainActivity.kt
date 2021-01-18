package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("BasicSyntax", "로그를 출력합니다. method = Log.d")

        var myName = "홍길동"
        var myAge: Int
        myAge = 27
        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")

        var a = 5
        var b = 3
        var bigger = if (a>b) {
            a = a - b
            a} else b
        Log.d("BasicSyntax","bigger = $bigger")

        var now = 10
        when (now) {
            8 -> {
                Log.d("when", "현재 시간은 8시입니다.")
            }
            9 -> {
                Log.d("when"," 현재 시간은 9시입니다.")
            }
            else -> {
                Log.d("when","현재 시간은 9시가 아닙니다.")
            }
        }

        var ageOfMichael = 19
        when (ageOfMichael) {
            in 10..19 -> {
                Log.d("when","마이클은 10대입니다.")
            }
            !in 10..19 -> {
                Log.d("when", "마이클은 10대가 아닙니다.")
            }
            else -> {
                Log.d("when", "마이클의 나이를 알 수 없습니다.")
            }
        }

        var currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시 입니다.")
            }
            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 5시 이전입니다.")
            }
        }
        var 요일 = "화"
        when (요일) {
            "월" -> "영어 공부를 합니다."
            "화" -> "자전거 모임이 있습니다."
            "수" -> "친구를 만납니다.."
            "목" -> "피아노를 칩니다."
            "금" -> "코딩 공부로 밤을 세웁니다."
            "토" -> "빨래를 합니다."
            else -> "집 청소를 합니다."
        }
    }
}