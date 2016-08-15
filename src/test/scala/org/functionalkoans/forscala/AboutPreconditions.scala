package org.functionalkoans.forscala

import support.KoanSuite

class AboutPreconditions extends KoanSuite {

  class WithParameterRequirement(val myValue: Int) {
    require(myValue != 0)

    def this(someValue: String) {
      this(someValue.size)
    }
  }

  // Instruction: use Intercept to catch the type of exception thrown by an invalid precondition
  koan("On precondition violation, intercept expects type of exception thrown") {
    info("here1")
    val myInstance = new WithParameterRequirement("Do you really like my hair?")
    info("here2")
    info(""+myInstance.myValue)
    myInstance.myValue should be (27)

    intercept[IllegalArgumentException] { //Catching the requirement exception, enter the exception in ___
      info("here3" )
      new WithParameterRequirement("")
    }
  }
}




	
