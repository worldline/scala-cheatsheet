// "for" declaration :
for (x <- 1 to 10 if x % 2 == 0) yield x * 10
// or (preferred for longer expressions)
for {
  x <- 1 to 10
  if x % 2 == 0
} yield x * 10
// sugar for  
(1 to 10).filter(_ % 2 == 0).map(_ * 10)
// Output : > res0: scala.collection.immutable.IndexedSeq[Int] = Vector(20, 40, 60, 80, 100) 

// pattern matching
for {
  (x, y) <- (1 to 5) zip (6 to 10) // inside the block
} yield x * y
// sugar for
((1 to 5) zip (6 to 10)).map {
  case (x, y) => x * y             // Using "case" reserved word.
}
// Output : > res1: scala.collection.immutable.IndexedSeq[Int] = Vector(6, 14, 24, 36, 50)

// default example :
// for comprehension: cross product (all possible combinations of x and y)
for (x <- 1 to 5; y <- 6 to 10) yield x * y
// same as :
1 to 5 flatMap { x => 6 to 10 map { y => x * y } }
// Output : > res2: scala.collection.immutable.IndexedSeq[Int] = Vector(6, 7, 8, 9, 10, 12, ...

// imperative style example :   
for (x <- 1 to 5; y <- 6 to 10) {
  println("%d/%d = %.1f".format(x, y, x.toFloat / y.toFloat))
}
// Output :
// > 1/6 = 0,2
// > 1/7 = 0,1
// > 1/8 = 0,1
// > 1/9 = 0,1
// > 1/10 = 0,1
// > 2/6 = 0,3
// ...