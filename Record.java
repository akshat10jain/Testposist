import java.util.Iterator;
import java.util.LinkedList;

public class Record {
	double recordValue;
	int recordOwnerId;
	String recordOwnerName;
	LinkedList <Node> NodeList;
	
	Record(double value) {
		recordValue = value;
		NodeList = new LinkedList();
	}
	
	void setRecordOwnerId(int id) {
		System.out.println("\nset owner id");
		recordOwnerId = id;
	}
	
	void setRecordOwnerName(String name) {
		system.out.println("\n set owner name");
		recordOwnerName = name;
	}
	
	void addNodeInRecord() {
		if (NodeList.size() == 0) {
			Node genesisNode = new Node(null, "X");
			genesisNode.setNodeOwnerId(recordOwnerId);
			genesisNode.setNodeOwnerName(recordOwnerName);
			genesisNode.setRecordValue(recordValue);
			NodeList.add(genesisNode);
		}
	}
	
	void getNodes() {
		System.out.println("all child nodes");
		Iterator <Node> itr = NodeList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
