import java.util.ArrayList;
import java.util.Date;

public class Genesis {
	static int countNode;
	Date timeStamp;
	String data;
	int nodeNum;
	String id_node;
	String ref_id_node;
	ArrayList <String> childref_id_node;
	String genesisref_id_node;
	String hashValue;
	int node_owner_id;
	String node_owner_name;
	double node_rec_val;
	
	Genesis(String parentId, String id_node) {
		ref_id_node = parentId;
		this.id_node = id_node;
		timeStamp = new Date();
		nodeNum = ++countNode;
		childref_id_node = new ArrayList();
	}
	
	void setnode_owner_id(int node_owner_id) {
		this.node_owner_id = node_owner_id;
	}
	
	void setnode_owner_name(String node_owner_name) {
		this.node_owner_name = node_owner_name;
	}
	
	void setRecordValue(double node_rec_val) {
		this.node_rec_val = node_rec_val;
	}
	
	String getid_node() {
		return id_node;
	}
	
	void addChildNode() {
		childref_id_node.add("");
	}
	
	public String encryptData() {
		String plainText = node_owner_id + node_rec_val + node_owner_name + id_node + node_rec_val;
		data = plainText.hashCode() + "";
		return data;
	}
	
	public String computeHashValue() {
		String plainText = timeStamp + data + nodeNum + id_node + ref_id_node + genesisref_id_node;
		hashValue = plainText.hashCode() + "";
		return hashValue;
	}
}
