
import java.util.Arrays;
import cnss.simulator.*;
import cnss.lib.*;

public class SelfSenderNode extends AbstractApplicationAlgorithm {

  public SelfSenderNode() {
      super(true, "selfsender-node");
  }

  public int initialise(int now, int node_id, Node self, String[] args) {
    super.initialise(now, node_id, self, args);

		return 500;
	}

  public void on_clock_tick(int now) {
      self.send(self.createDataPacket( super.nodeId, new byte[0]));
  }

  public void on_receive( int now, DataPacket p ) {
    log( now, "got: " + p); 
  }
} 