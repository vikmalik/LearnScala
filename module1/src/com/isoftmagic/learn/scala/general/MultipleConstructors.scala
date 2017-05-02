package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 29-04-2017.
  */
class MultipleConstructors(arg1: Int, arg2: String) {
  println("Default Constructor")

  //Default constructor
  def this() {
    this(0, "")
    println("Default Constructor")
  }

  def this(arg1: Int) {
    this(arg1, "")
    println("Secondary Constructor")
  }

  def this(arg2: String) {
    this(0, arg2)
    println("Secondary Constructor")
  }

  override def toString: String = {
    return "%d %s".format(arg1, arg2)
  }
}