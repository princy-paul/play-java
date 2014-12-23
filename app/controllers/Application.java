package controllers;

import Beans.ChangeAddressUserVO;
import Beans.CurrentAddressUserVO;
import play.*;
import play.api.libs.json.*;
import play.data.Form;
import play.data.validation.ValidationError;
import play.i18n.Messages;
import play.libs.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.data.Form.form;


public class Application extends Controller {


    public static Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public static Result ChangeAddress() {
        Form<ChangeAddressUserVO> sample = form(ChangeAddressUserVO.class);
        CurrentAddressUserVO  vo = new CurrentAddressUserVO();
        return ok(ChangeAddress.render(sample));
    }

    public static Result ConfirmChangeAddress() {

        return ok(confirmation.render("Your new application is ready."));
    }

    public static Result register() {
        Form<ChangeAddressUserVO> userForm = form(ChangeAddressUserVO.class).bindFromRequest();


        if(userForm.hasErrors()){

            Logger.info(String.valueOf(Json.toJson(String.valueOf(userForm.errors()))));
            Map<String,List<String>> sample= new HashMap<String ,List <String>>();
            for (String key : userForm.errors().keySet()) {
                Logger.info(String.valueOf(userForm.errors().get(key).get(0).message()));
                String error=String.valueOf(userForm.errors().get(key).get(0).message());
                Logger.info(Messages.get(error));
            }
            Logger.info(userForm.data().get("StreetName"));
            return ok(ChangeAddress.render(userForm));

        }else {
            ChangeAddressUserVO vo = userForm.bindFromRequest().get();
            String concateDate = vo.getMonth() + "-" + vo.getDate() + "-" + vo.getYear();
            vo.setConcateDate(concateDate);
            return ok(ConfirmAddressChange.render(vo));

        }

    }

    public static Result CurrentAddress(){
        Logger.info("Angular Js Ajax Call");
        CurrentAddressUserVO  vo = new CurrentAddressUserVO();
        return ok(Json.toJson(vo));
    }
}