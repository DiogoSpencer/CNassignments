
import java.util.Arrays;
import cnss.simulator.*;
import cnss.lib.*;

public class TimeoutHandlingNode extends AbstractApplicationAlgorithm {

  public TimeoutHandlingNode() {
      super(true, "timeout-handling-node");
  }

  public int initialise(int now, int node_id, Node self, String[] args) {
    super.initialise(now, node_id, self, args);
    self.set_timeout(1000 + node_id);
		return 0;
	}

  public void on_timeout(int now) {
    super.log( now, "on_timeout");      
  }

}