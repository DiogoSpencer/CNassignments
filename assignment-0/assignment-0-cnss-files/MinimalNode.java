
import java.util.Arrays;
import cnss.simulator.*;
import cnss.lib.*;

public class MinimalNode extends AbstractApplicationAlgorithm {

  public MinimalNode() {
      super(true, "minimal-node");
  }

  public int initialise(int now, int node_id, Node self, String[] args) {
    super.initialise(now, node_id, self, args);

    super.log( now, "args: " + Arrays.asList(args));
		return 0;
	}
} 