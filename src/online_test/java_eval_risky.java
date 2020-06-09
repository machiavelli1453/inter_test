package online_test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class java_eval_risky
{
    public static void main(String args[]) {
        String enter;
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            enter = in.nextLine();
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try {
                Object result = engine.eval(enter);
                System.out.println(result);
            } catch (ScriptException e) {
                e.printStackTrace();
            }

        }
    }
}
