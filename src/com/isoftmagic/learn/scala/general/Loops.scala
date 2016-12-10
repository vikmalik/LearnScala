package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
object Loops {
  def main(args: Array[String]): Unit = {
    var i: Int = 5

    println("Print number from 1 to 10")
    for (i <- 1 to 10)
      print(i)

    println("Print List")
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10)
    for (i <- numList)
      println(i)

    println("Print filtered List")
    for ( i <- numList
            if i != 3; if i < 8 ) {
      println(i)
    }

    println("Yield List")
    val myList = for ( i <- numList
          if i != 3; if i < 8 ) yield i

    for ( i <- myList ) {
      println(i)
    }

  }
}
