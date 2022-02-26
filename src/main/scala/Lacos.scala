object Lacos {
  def main(args: Array[String]): Unit = {
    whileLoop()
    forLoop()
    forList()
    forEach()
  }
}

def whileLoop(): Unit = {
  var i = 0
  while (i < 5) {
    println(i)
    i = i + 1
  }
}

def forLoop(): Unit = {
  for (i <- 0 until 5) {
    println(i)
  }
}

def forList(): Unit = {
  val list = List(0, 1, 2, 3, 4)
  for (i <- list) {
    println(i)
  }
}

def forEach(): Unit = {
  val list = List(0, 1, 2, 3, 4)
  list.foreach {
    println
  }
}
