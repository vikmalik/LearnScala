package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
class Point (xa: Int, ya: Int) {
  var x: Int = xa
  var y: Int = ya

  def move(dx: Int, dy: Int ) {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    "x = " + x + ", y = " + y
  }

}
object PointTest {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(3, 4);

    println(p1);

    p1.move(4, 5)

    print(p1)
  }

}