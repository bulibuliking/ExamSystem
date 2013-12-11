package models

/**
 * Created with IntelliJ IDEA.
 * User: liaoshifu
 * Date: 13-12-10
 * Time: 下午9:42
 * To change this template use File | Settings | File Templates.
 */
case class LoginSuccessMessage(success: Long, msg: String)

case class LoginJson(name: String, pwd: String)