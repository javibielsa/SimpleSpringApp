package oracle.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.cloud.model.TableName;
import oracle.cloud.repository.TableNameRepository;

@Service
public class TableNameService {
	
	@Autowired
	private TableNameRepository repository;
	
	public void insert(TableName tablename) {
		repository.insert(tablename);
	}
	
	public void delete(TableName tablename) {
		repository.delete(tablename);
	}
	
	public List<TableName> listAll() {
		return repository.listAll();
	}

}
