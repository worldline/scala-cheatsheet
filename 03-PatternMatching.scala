List() match {
  // Using "case" reserved word
  case x :: xs =>
  // matches a list head & tail
  // introduces x and xs to the scope
  case _       =>
  // matches anything, equivalent to default in Java
}

Option(1) match {
  case Some(v) => v
  // introduces v to the scope
  case None        => "default"
}

val value = 3
Option(1) match {
  case Some(`value`)         =>
  // compares to an existing value, same as 
  case Some(v) if v == value =>
}

val UppercaseVal = 42
Some(3) match {
  case Some(UppercaseVal) => "42"
  // /!\ UppercaseVal is treated as an existing val, rather than a new pattern variable,
  //     because it starts with an uppercase letter. 
  case _                  => "Not 42"
  //     Thus, the value contained within UppercaseVal is checked against 3, 
  //     and "Not 42" is returned.
}

List(1, "") match {
  case List(e1: String, e2: Int)   =>
  // checks the types of e1 and e2
  case l @ List(a @ List(b, c), d) =>
  //creates aliases for the matched elements
}

((1 to 5) zip (6 to 10)).map {
  case (x, y) => x * y
  // you need {} not () to use pattern matching 
  // (need to define an anonymous function)
}