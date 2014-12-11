

/**
 * Created by kartikay.kulshrestha on 12/3/14.
 */
import play.*;

import org.springframework.context.*;
import org.springframework.context.support.*;
import play.Application;

import java.util.UUID;

public class Global extends GlobalSettings {

   private ApplicationContext ctx;

    @Override
    public void onStart(Application app) {
        Logger.info("Inside Global onStart");

       /*ctx =
                new ClassPathXmlApplicationContext("components.xml");

        TextEditor te = (TextEditor) ctx.getBean("textEditor");*/

       /* te.spellCheck();*/



    }

    @Override
    public <A> A getControllerInstance(Class<A> clazz) {

        return ctx.getBean(clazz);
    }
}
