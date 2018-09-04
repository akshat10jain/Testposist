import java.util.Iterator;
import java.util.LinkedList;

public class Owner {
	int ownerid_node;
	String ownername_node;
	
	LinkedList <Record> RecordsList;
	
	Owner(int id, String name) {
		ownerid_node = id;
		ownername_node = name;
		RecordsList = new LinkedList();
	}
		
	void createRecord(double value) {
		Record firstrecord = new Record(value);
		firstrecord.setRecordOwnerId(this.ownerid_node);
		firstrecord.setRecordOwnerName(this.ownername_node);
		firstrecord.addNodeInRecord();
		RecordsList.add(firstrecord);
	}

	void getRecords() {
		Iterator <Record> itr =RecordsList.iterator();
		while (itr.hasNext()) {
			System.out.println("owner records");
			System.out.println(itr.next());
			System.out.println("node records");
			itr.next().getNodes();
		}
	}
}
