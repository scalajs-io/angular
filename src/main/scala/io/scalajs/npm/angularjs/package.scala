package io.scalajs.npm

import scala.concurrent.duration.FiniteDuration
import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/**
  * Angularjs Package Object
  * @author lawrence.daniels@gmail.com
  */
package object angularjs {

  //////////////////////////////////////////////////////////////
  //    Globals
  //////////////////////////////////////////////////////////////

  /**
    * Singleton "angular" instance
    */
  @js.native
  @JSGlobal("angular")
  object angular extends Angular

}
