package io.scalajs.npm.angularjs.http

/**
  * HTTP Error
  * @author lawrence.daniels@gmail.com
  */
class HttpError(val status: Integer, val message: String) extends RuntimeException(message)
