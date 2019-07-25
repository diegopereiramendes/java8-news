package java8news.javascriptnashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExampleSimple {

    public static void main(String[] args) throws Exception {
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Evaluating Nashorn code
        ee.eval("print('Hello Nashorn');");
    }

}