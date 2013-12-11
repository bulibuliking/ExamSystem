package models

import play.api.libs.json.Json
import play.api.data.Forms._
import play.api.data._
/**
 * Created with IntelliJ IDEA.
 * User: liaoshifu
 * Date: 13-12-10
 * Time: 下午9:44
 * To change this template use File | Settings | File Templates.
 */
object JsonFormats {

  implicit val loginSuccessMessageFormat = Json.format[LoginSuccessMessage]

  implicit val loginJsonFormat = Json.format[LoginJson]

  val loginForm = Form (
    mapping (
      "name" -> nonEmptyText,
      "pwd" -> nonEmptyText
    )(LoginJson.apply _)(LoginJson.unapply _)
  )
}
