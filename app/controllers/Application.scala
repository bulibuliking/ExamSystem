package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import play.api.data._
import play.api.data.Forms._
import org.joda.time.DateTime

import models._
import models.JsonFormats._

object Application extends Controller {


  def main = Action { implicit request =>
    val optionName = request.session.get("name")
    optionName match {
      case Some(name) => Ok(views.html.main(name))
      case None => Redirect(routes.Application.login).withNewSession
    }
    //Ok(views.html.main("who am i"))

  }
 
  def login = Action{
    Ok(views.html.login())
  }



  def loginSubmit = Action {
    implicit request => {

      loginForm.bindFromRequest().fold(
        errors => Redirect(routes.Application.login),
        loginData => {
          Logger.info(s"${loginData.name} has login....")

          Ok(Json.toJson(LoginSuccessMessage(1, loginData.name))).withSession("name" -> loginData.name)
        }
      )

    }
  }
 //单选题页面
  def  singletopic = Action {
   Ok(views.html.singletopic()) 
  }
 //部门管理页面
  def  deparment = Action {
   Ok(views.html.deparment()) 
  }
 //人员管理页面 
  def  person = Action {
   Ok(views.html.person()) 
  }
 //成绩查询页面 
  def  score = Action {
   Ok(views.html.score()) 
  }
}