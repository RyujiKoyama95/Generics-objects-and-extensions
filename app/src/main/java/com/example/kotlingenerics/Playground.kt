package com.example.kotlingenerics

/**
 * 1.Make a reusable class with generics
 */

// クイズを各クラスで表現
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)
class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

// 親クラスで共通部を定義してanswerのみサブクラスで定義
// →answerのデータ型が違う問題を追加するたびにサブクラスを定義する手間がある
// →そもそもanswerプロパティを持たない親クラスQuestionがあるのも不自然
open class ParentQuestion(
    val questionText: String,
    val difficulty: String
)
class SubQuestion1(
    val answer: Boolean,
    questionText: String,
    difficulty: String
): ParentQuestion(questionText, difficulty)
class SubQuestion2(
    val answer: Int,
    questionText: String,
    difficulty: String
): ParentQuestion(questionText, difficulty)

// genericsで表現
// →違うのはanswerのデータ型のみなので、この方法が一番シンプルでいい
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

// genericsで表現したクラスをインスタンス化
fun main() {
    val que1 = Question("aaa", "bbb", "easy")
    val que2 = Question("aaa", 1, "normal")
    val que3 = Question("aaa", true, "hard")
}

/**
 * 2.Use an enum class
 */
// enum
enum class Difficulty {
    EASY,
    NORMAL,
    HARD
}
class Question2<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

// genericsで表現したクラスをインスタンス化
fun main2() {
    val que1 = Question2("aaa", "bbb", Difficulty.EASY)
    val que2 = Question2("aaa", 1, Difficulty.NORMAL)
    val que3 = Question2("aaa", true, Difficulty.HARD)
}

/**
 * 3.Use a data class
 */
// メソッドを持たないプロパティのみのクラスであればdata classを使用
// data classでしか利用できないメソッドがいくつかある　→　例えばtoString()がデフォルトで実装されている
data class Question3<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main3() {
    val que1 = Question3("aaa", "bbb", Difficulty.EASY)
    println("$que1") // Question3(questionText=aaa, answer=bbb, difficulty=EASY)
    // data classではなく普通のclassの場合、インスタンスをtoString()しても識別子が出力されるだけ
}

/**
 * 4.Use a singleton object
 */

/**
 * 5.Extend classes with new properties and methods
 */

/**
 * 6.Rewrite extension functions using interfaces
 */

/**
 * 7.Use scope functions to access class properties and methods
 */