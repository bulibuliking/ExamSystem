package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

object Application extends Controller {

  def main = Action{
    Ok(views.html.main())
  }
 
  def login = Action{
    Ok(views.html.login())
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