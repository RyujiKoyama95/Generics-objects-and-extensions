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

// genericsで表現
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

// genericsで表現したクラスをインスタンス化
fun main() {
    val que1 = Question("aaa", "bbb", "easy")
    val que2 = Question("aaa", 1, "easy")
    val que3 = Question("aaa", true, "easy")
}

/**
 * 2.Use an enum class
 */

/**
 * 3.Use a data class
 */

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