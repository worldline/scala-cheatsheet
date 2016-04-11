// Lazy vals declaration :
lazy val x = { println("created"); 1 } // Not yet initialized.
// x: Int = <lazy>

x * 2                                  // Initialized. "created" will be displayed.
// Output : 
// > created
// > res0: Int = 2

x * 3                                  // Already initialized. No "created" displayed.
// res1: Int = 3
                                      
// call-by-name argument
def log(level: Int, x: => Any): Unit = if (level > 0) println(x)
// log: (level: Int, x: => Any)Unit

log(0, {println("Not displayed."); 3})
// Output : >

log(1, {println("Displayed !"); 3})
// Output :
// > Displayed !
// > 3


