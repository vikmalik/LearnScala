package com.isoftmagic.learn.scala.general

import java.util.Date

/**
  * Created by vikmalik on 12/10/16.
  */
object FunctionAsArgument {

  def main(args: Array[String]): Unit = {
    delayed(time())

    println()
    println("Function as Argument:")
    operation(count())
    operation(count())
    operation(count())

    println()
    var logMe = log(new Date(), _ : String);
    println("Partial Function Calling:")
    logMe("This")
    logMe("is")
    logMe("cool")

    println()
    println("High Order Functions : " + wrapperFunction(myFunction, 3))

    println()
    val anonymousFunction = (x: Int, y: Int) => x * y
    println("Annonymous Function: Multiply 3, 2 = " + anonymousFunction(3,2))

    println()
    println("Curried Function Chain: " + strcat("Hello")(" World!"))
   }

  def delayed( t: => Long ): Unit = {
    println("In delayed method")
    println("Param: " + t)
  }

  def time (): Long = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  var counter = 0L;

  def count(): Long = {
    counter += 1
    return counter
  }

  def operation( c: => Long): Unit = {
    if(counter == 0) {
      println("Operation called first times")
      //comment next line and check counter would not increase at all
      c
    } else {
      println("Operation called " + c + " times")
    }
  }

  def log(date: Date, message: String): Unit ={
    println(date + " : " + message)
  }

  //This is a dummy function which takes a two arguments, function and integer
  //function in argument has syntax " String f(int x)"
  // dummy function actually pass the second argument to first argument
  def wrapperFunction(f: Int => String, v: Int) = f(v)

  //Here we are defining a function with generics argument type is not defined
  //Same fucntion can be applied to Int or Long or any other type
  // this function returns String type
  def myFunction [DummyType] (x: DummyType) = "[ " + x + " ]"


  //This is an example of curried function chain
  //multiple arguments can be broken into differnt functions itself
  //alternate syntax for this can be
  // def strcat(s1: String)(s2: String) =  s1 + s2
  def strcat(s1: String) = (s2: String) => s1+ s2

}
