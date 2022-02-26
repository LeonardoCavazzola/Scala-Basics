object Condicional {
  def main(args: Array[String]): Unit = {
    ifElse()
    ternary()
    matchCase()
  }
}

def ifElse(): Unit = {
  if (true) {
    println("message case true")
  } else {
    println("message case false")
  }

  val result =
    if (true) {
      "message case true"
    } else {
      "message case false"
    }
  println(result)
}

def ternary(): Unit = {
  println(if (true) "message case true" else "message case false")
}

def matchCase(): Unit = {
  val a = 3
  val result = a match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other number"
  }

  println(result)
}
