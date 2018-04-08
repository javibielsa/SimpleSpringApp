package oracle.cloud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.cloud.model.TableName;

@Repository
public class TableNameRepository {
	@Autowired
	private List<TableName> tablenameList;
	
	public void insert(TableName tablename) {
		tablenameList.add(tablename);
	}
	
	public void delete(TableName tablename) {
		if(exists(tablename) == true) {
			tablenameList.remove(tablename);
		}
	}
	
	public List<TableName> listAll() {
		return tablenameList;
	}
	
	public boolean exists(TableName tablename) {
		Boolean found = false;
		for (int i = 0; i < tablenameList.size(); i++) {
			if(tablename.getId() == tablenameList.get(i).getId()) {
				found = true;
			}
		}
		return found;
	}
}
