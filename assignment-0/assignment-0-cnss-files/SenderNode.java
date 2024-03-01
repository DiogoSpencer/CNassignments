
import java.util.Arrays;
import cnss.simulator.*;
import cnss.lib.*;

public class SenderNode extends AbstractApplicationAlgorithm {

  public SenderNode() {
      super(true, "sender-node");
  }

  public int initialise(int now, int node_id, Node self, String[] args) {
    super.initialise(now, node_id, self, args);
		return 1000;
	}

  public void on_clock_tick(int now) {
      self.send( self.createDataPacket( 1, new byte[0]));
  }
} 