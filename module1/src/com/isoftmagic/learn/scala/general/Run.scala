package com.isoftmagic.learn.scala.general

/**
  * Created by vikmalik on 12/10/16.
  */
object Run {
  implicit class intTimes(x: Int) {
    def times [A] (f: => A): Unit = {
      def loop(current: Int): Unit =
        if(current > 0) {
          f
          loop(current - 1)
        }
        loop(x)
    }
  }
}
