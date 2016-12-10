package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
object LocationUsage {
  def main(args: Array[String]): Unit = {
    val l1 = new Location(1, 2, 3);

    println(l1);

    l1.move(3,4,5)

    println(l1)
  }

}
