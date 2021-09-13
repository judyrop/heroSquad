import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
//      get("/hero",(request,response) -> "Hero squad!");
        staticFileLocation("/public");
        get("/",(request,response)->{
           Map<String, Object> model = new HashMap<String, Object>();
          return new ModelAndView(new HashMap(), "index.hbs");
         }, new HandlebarsTemplateEngine());
//        get("/hero",(request,response)->{
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(new HashMap(), "hero.hbs");
//        }, new HandlebarsTemplateEngine());
//        get("/hero-form", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(model, "hero-form.hbs");
//        }, new HandlebarsTemplateEngine());
//        get("/squad-form", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(model, "squad-form.hbs");
//        }, new HandlebarsTemplateEngine());
//        post("/squad-form", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//
//            String InputtedSquadName = request.queryParams("SquadName");
//            request.session().attribute("SquadName", InputtedSquadName);
//            model.put("SquadName", InputtedSquadName);
//
//            return new ModelAndView(model, "squad-form.hbs");
//        }, new HandlebarsTemplateEngine());
//        post("/hero-form", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//
//            String InputtedName = request.queryParams("Name");
//            request.session().attribute("Name", InputtedName);
//            model.put("Name", InputtedName);
//
//            return new ModelAndView(model, "hero-form.hbs");
//        }, new HandlebarsTemplateEngine());
    }
}
