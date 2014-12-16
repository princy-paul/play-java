package controllers;

import play.*;
import play.mvc.*;

import scala.annotation.meta.param;
import views.html.*;


public class Application extends Controller {


    public static Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public static Result ChangeAddress() {

        return ok(ChangeAddress.render("Your new application is ready."));
    }
    public static Result XX() {

        return ok(xx.render("Your new application is ready."));
    }
    public static Result confirmation() {

        return ok(confirmation.render("Your new application is ready."));
    }
}
