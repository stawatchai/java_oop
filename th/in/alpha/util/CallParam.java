package th.in.alpha.util;

public class CallParam {

    private String mainCommand;
    private String subCommand;
    private String[] optionCommand;

    public CallParam(String[] args) {
        int paraLen = args.length;
        this.mainCommand = paraLen > 0 ? args[0] : "";
        this.subCommand = paraLen > 1 ? args[1] : "";

        this.mainCommand = args[0];
        this.subCommand = args[1];
        if (paraLen > 2) {
            optionCommand = new String[paraLen - 2];
            System.arraycopy(args, 2, optionCommand, 0, paraLen - 2);
        } else {
            optionCommand = new String[1];
            optionCommand[0] = "";
        }

    }

    public String getMainCommand() {
        return mainCommand;
    }

    public void setMainCommand(String mainCommand) {
        this.mainCommand = mainCommand;
    }

    public String getSubCommand() {
        return subCommand;
    }

    public void setSubCommand(String subCommand) {
        this.subCommand = subCommand;
    }

    public String[] getOptionCommand() {
        return optionCommand;
    }

    public void setOptionCommand(String[] optionCommand) {
        this.optionCommand = optionCommand;
    }

}
