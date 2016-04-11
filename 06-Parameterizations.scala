// generic type.
def mapmake[T](g: T = >T)(seq: List[T]) = seq.map(g)

// Variance.
class Set[A](var head: A, var tail: List[A])

// Ok
val s = new Set(4, List(1,2,3)) // Set[Int]
// Not Ok
val nok = new Set("head", List(1,2,3))

// Type Bounds
trait A
trait B

// A as upper bound (java "<T extends A>" equivalent)
class Upper[T<:A](var item: T)

// B as lower bound (java "<T super B>" equivalent)
class Lower[T>:A](var item: T)

 