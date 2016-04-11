// function declaration :
def f(x: Int): Int = { x * x }
def f(x: Int): Int = x * x     // optional {}
def f(x: Int) = x * x          // inferred return type

// side effects only => Unit
def log(x: Any): Unit = println(x) 

// anonymous function
(x: Int) => x * x   

// with inferred type for argument
(1 to 5).map(x => x * x)

// in a function declaration, underscore is positionally matched argument 
(1 to 5).map(2 * _)        // when one argument,                                             
(1 to 5).reduceLeft(_ + _) // Two arguments...
                            
// block style; returns last expression
(1 to 5).map { x => val y=x*2; y } 

// mandatory return type for recursive function
def gcd(a:Int, b:Int): Int = 
  if (b == 0) a else gcd(b, a % b)  

val zscore = (mean: Double, sd: Double) => (x: Double) => (x - mean) / sd   
// currying, obvious syntax
def zscore(mean: Double, sd: Double) = (x: Double) => (x - mean) / sd   
// currying, obvious syntax

def zscore(mean: Double, sd: Double)(x: Double) = (x - mean) / sd   
// currying, sugar syntax. but then:
val normer = zscore(7, 0.4) _   // need trailing underscore to get the partial function, only for the sugar version

def mapmake[T](g: T => T)(seq: List[T]) = seq.map(g)    //generic type.

def sum(args: Int*) = args.reduceLeft(_ + _) // varargs