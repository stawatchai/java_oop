package th.in.alpha.app;

import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

import th.in.alpha.util.AppRunner;
import th.in.alpha.util.CallParam;
import th.in.alpha.util.Sum;
import th.in.alpha.util.callResponse;

public class Application {
    public static void main(String[] args) {
        CallParam para = new CallParam(args);
        System.out.println(para.getMainCommand());
        System.out.println(para.getSubCommand());
        for (String p : para.getOptionCommand()) {
            System.out.println(p);
        }
        System.out.println("\n-----------");
        AppRunner app = new Sum();

        callResponse resp = app.runCommand(para);
        System.out.println(resp.getValue());
    }
}
