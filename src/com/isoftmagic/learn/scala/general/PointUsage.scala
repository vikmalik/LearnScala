package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
object PointUsage {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(3, 4);

    println(p1);

    p1.move(4, 5)

    print(p1)
  }

}
