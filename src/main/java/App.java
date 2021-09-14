
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
//      get("/hero",(request,response) -> "Hero squad!");
        staticFileLocation("/public");
        //homepage route
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());
        //Hero form route
        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());
        // Heroes success form
        post("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            Integer age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Hero heroes = new Hero(name, age, power, weakness);
            model.put("heroes", heroes);
            return new ModelAndView(model, "heroSuccess.hbs");
        }, new HandlebarsTemplateEngine());
        //All heroes
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.all();
            model.put("heroes", heroes);
            return new ModelAndView(model, "heroList.hbs");
        }, new HandlebarsTemplateEngine());
        // display all squads
        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = Squad.all();
            model.put("squad", squad);
            return new ModelAndView(model, "squadList.hbs");
        }, new HandlebarsTemplateEngine());
        //Squad input form
        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squadForm.hbs");
        }, new HandlebarsTemplateEngine());
        //Collecting new squad inputs
        post("/squad/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(name, cause, size);
            model.put("squad", newSquad);
            return new ModelAndView(model, "squadSuccess.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
