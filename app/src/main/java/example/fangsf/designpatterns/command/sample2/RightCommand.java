package example.fangsf.designpatterns.command.sample2;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:
 */
public class RightCommand implements Command {

    private TetrisMachine mTetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        mTetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        mTetrisMachine.toRight();
    }
}
