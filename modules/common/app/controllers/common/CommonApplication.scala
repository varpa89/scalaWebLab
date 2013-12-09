package controllers.common

import play.api.mvc.{Controller, Action}

/**
 * Created with IntelliJ IDEA.
 * User: varchenko
 * Date: 09.12.13
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
object CommonApplication extends Controller{
  def index() = Action {
    implicit request =>
      Ok
  }

}
