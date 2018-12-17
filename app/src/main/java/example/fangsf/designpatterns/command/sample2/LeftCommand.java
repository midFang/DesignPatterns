package example.fangsf.designpatterns.command.sample2;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:
 */
public class LeftCommand implements Command {

    private TetrisMachine mTetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        mTetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        mTetrisMachine.toLeft();
    }
}
