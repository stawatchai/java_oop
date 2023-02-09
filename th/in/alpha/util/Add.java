package th.in.alpha.util;

public class Add {

    static int addNum(int a, int b) {
        return a + b;
    }

    static double addNum(double a, double b) {
        return a + b;
    }

    public callResponse runCommand(CallParam param) {
        int x = Integer.parseInt(param.getOptionCommand()[0]);
        int y = Integer.parseInt(param.getOptionCommand()[1]);
        callResponse z = new callResponse();
        z.setValue(String.valueOf(addNum(x, y)));
        return z;
    }
}
