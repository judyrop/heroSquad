import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
//      get("/hero",(request,response) -> "Hero squad!");
        staticFileLocation("/public");
        get("/hero",(request,response)->{
            return new ModelAndView(new HashMap(), "hero.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
