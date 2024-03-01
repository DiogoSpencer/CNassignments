
import java.util.Arrays;
import cnss.simulator.*;
import cnss.lib.*;

public class PeriodicActionNode extends AbstractApplicationAlgorithm {

  public PeriodicActionNode() {
      super(true, "periodic-node");
  }

  public int initialise(int now, int node_id, Node self, String[] args) {
    super.initialise(now, node_id, self, args);
		return 1500;
	}

  public void on_clock_tick(int now) {
    super.log( now, "on_clock_tick");      
  }

}