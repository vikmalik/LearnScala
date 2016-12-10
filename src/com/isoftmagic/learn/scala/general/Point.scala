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
