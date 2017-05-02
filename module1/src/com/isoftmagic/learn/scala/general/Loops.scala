package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
object Loops {
  def main(args: Array[String]): Unit = {

    print("Print number from 1 to 10: ")
    for (i <- 1 to 10)
      print(s"$i, ")

    println()
    print("Print List: ")
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10)
    for (i <- numList)
      print(s"$i, ")

    println()
    print("Print filtered List: ")
    for ( i <- numList
            if i != 3; if i < 8 ) {
      print(s"$i, ")
    }

    println()
    print("Yield List: ")
    var myList = for ( i <- numList
          if i != 3; if i < 8 ) yield i

    for ( i <- myList ) {
      print(s"$i, ")
    }


    println()
    var charList = List('a', 'b', 'c', 'd', 'e' )
    val customObjectList = for {
      i <- numList
      j <- charList
      k <- myFunction(i, j)
    } yield k

    println("Yield Object: " + customObjectList)
  }

  def myFunction(i: Int, j: Char) : List[(Int, Char)] = {
    //print(s"($i , $j)")
    val numList = List((i, j))
    return numList
  }

  case class CustomObject(i: Int, j:Char)
}
