//Values and definitions

val x = 5 // constant, evaluated once
          // x: Int = 5
x = 6     // Will fail (because x is immutable)
          // error: reassignment to val
def y = 5 // definition (function), evaluated at each call
          // y: Int
var v = 5 // variable, only use when really needed
          // v: Int = 5
v = 8     // Will set v to 8 (because mutable)
          // v: Int = 8

//Control constructs

if (true) 1 else 2  // conditional _expression_, of type Int
// res0: Int = 1

if (true) 1         // /!\ this is the same as 
if (true) 1 else () // which is of type AnyVal
// res1: AnyVal = 1

//loop structures for imperative programming
var i = 0
while (i < 5) { println(i); i += 1} 
// Output :
// > 0
// > 1
// > 2
// > 3
// > 4

do { println(i); i += 1} while (i < 5) // i still equals 5
                                       // 5
