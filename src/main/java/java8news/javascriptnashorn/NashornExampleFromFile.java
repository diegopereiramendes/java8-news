package java8news.javascriptnashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class NashornExampleFromFile {

    public static void main(String[] args) throws Exception {

        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("hello.js"));
    }

}