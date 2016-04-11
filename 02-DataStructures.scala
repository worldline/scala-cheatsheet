//Tuples
val t = (1, 2, 3) 
// Output : > t: (Int, Int, Int) = (1,2,3)
                                                              
//destructuring bind: tuple unpacking via pattern matching
val (x, y, z) = t 
// Output :
// > x: Int = 1
// > y: Int = 2
// > z: Int = 3
                                                              
// access to tuple elements; index starts at 1
// /!\ avoid if possible (readability)
val i = t._1 
// Output : i: Int = 1

//Case classes (gives more maintainable code)
case class Vector3d(x: Int, y: Int, z: Int)
// Output : > defined class Vector3d
val p = Vector3d(1, 2, 3)
// Output : > p: Vector3d = Vector3d(1,2,3)
val j = p.x
// Output : > j: Int = 1

// Basic immutable lists
val xs = List(1, 2, 3)
// Output : > xs: List[Int] = List(1, 2, 3)
                                                              
// unpacking via pattern matching
val List(a, b, c) = List(1, 2, 3) 
// Output : 
// > a: Int = 1
// > b: Int = 2
// > c: Int = 3

// paren indexing; sugar for xs.apply(2)
xs(2) 
// Output : > res0: Int = 3

//cons : creates a new list with prepended element
0 :: xs 
// Output : > res1: List[Int] = List(0, 1, 2, 3)

// Ranges 
1 to 5         
// Output : > res2: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)
1 until 6      // excludes the upper bound
// Output : > res3: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5)
1 to 10 by 2   // specify step
// Output : > res4: scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)

//(empty parens)	sole member of the Unit type (like C/Java void) 
()             
// Ouput : > 