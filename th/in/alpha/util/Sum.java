package th.in.alpha.util;

public class Sum implements AppRunner {
    public callResponse runCommand(CallParam param) {
        callResponse z = new callResponse();
        int sum = 0;
        for (String s : param.getOptionCommand()) {
            sum += Integer.parseInt(s);
        }
        z.setValue(String.valueOf(sum));
        return z;
    }
}
