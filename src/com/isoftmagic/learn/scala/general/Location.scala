package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
class Location (val xa: Int, val ya: Int, val za: Int) extends Point (xa, ya) {

  var z: Int = za;

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    move(dx, dy)
    z += dz
  }

  override def toString: String = {
    super.toString + ", z = " + z

  }
}
