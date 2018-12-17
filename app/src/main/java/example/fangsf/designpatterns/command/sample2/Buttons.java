package example.fangsf.designpatterns.command.sample2;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  调用者对象
 */
public class Buttons {

    private LeftCommand mLeftCommand;
    private RightCommand mRightCommand;

    public LeftCommand getLeftCommand() {
        return mLeftCommand;
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        mLeftCommand = leftCommand;
    }

    public RightCommand getRightCommand() {
        return mRightCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        mRightCommand = rightCommand;
    }
}
