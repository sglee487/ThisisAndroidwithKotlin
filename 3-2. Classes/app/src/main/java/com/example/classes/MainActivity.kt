package com.example.classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 생성자가 없는 클래스 호출
        Kotlin()

        // 2. 클래스의 생성자 사용
        KotlinTwo("안녕")

        // 3. 클래스의 프로퍼티와 메서드 사용하기
        var kotlin = KotlinThree()
        kotlin.printOne()
        kotlin.one = "Hello"
        kotlin.printOne()

        // 4. 컴패티언 오브젝트 사용하기: 자세히 보면 첫 글자가 대문자임
        KotlinFour.printOne()
        KotlinFour.one = "Hello"
        KotlinFour.printOne()

        // 5. 데이터 클래스 사용하기
        var dataUser = DataUser("Michael", 21)
        var newUser = dataUser.copy()
        newUser.name = "Jane"
        Log.d("class", "원본 dataUser는 ${dataUser.toString()}")
        Log.d("class", "복사된 newUser는 ${newUser.toString()}")



        // 클래스 확장
        testStringExtension()


        // 1. 부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayHello()
        // 2. 자식 클래스 호출해서 사용하기
        var child = Child()
        child.myHello()
        
    }

    // String 익스텐션 테스트 하기
    fun testStringExtension() {
        var Original = "Hello"
        var added = "Guys~"
        // plus 함수를 사용해서 문자열을 더할 수 있습니다. 내가 밑에서 정의한거.
        Log.d("Extension", "added를 더한 값은 ${Original.plus(added)}입니다.")
    }
}

// 파라미터가 없는 클래스
class Kotlin() {
    init {
        Log.d("class","Kotlin 클래스 생성됨")
    }
}

// 파라미터가 있는 세컨더리 생성자
class KotlinTwo {
    constructor(value:String) {
        Log.d("class", "KotlinTwo: 파라미터 값은 ${value}입니다.")
    }
}

// 프로퍼티와 메서드가 있는 클래스
class KotlinThree {
    var one: String = "None"
    fun printOne() {
        Log.d("class", "KotlinThree: one에 입력된 값은 ${one}입니다.")
    }
}

// 스태틱 멤버를 갖는 클래스
class KotlinFour {
    companion object {
        var one: String = "None"
        fun printOne() {
            Log.d("class", "KotlinFour: one에 입력된 값은 ${one}입니다.")
        }
    }
}

// 데이터 클래스
data class DataUser(var name: String, var age: Int)



// 클래스 확장
fun String.plus(word: String): String {
    return this + word
}


// 상속 연습
open class Parent {
    var hello: String = "안녕하세요."
    fun sayHello() {
        Log.d("Extension", "${hello}")
    }
}

class Child: Parent() {
    fun myHello() {
        hello = "Hello"
        sayHello()
    }
}

// 메서드 오버라이드 연습
open class BaseClass {
    open fun opened(){

    }
    fun notOpened() {

    }
}
class ChildClass : BaseClass() {
    override fun opened() {

    }
//    밑에 에러뜸
//    override fun notOpened() {
//
//    }
}

// 프로퍼티 오버라이드 연습
open class BaseClass2 {
    open var opened: String = "I am"
}
class ChildClass2 : BaseClass2() {
    override var opened: String = "You are"
}