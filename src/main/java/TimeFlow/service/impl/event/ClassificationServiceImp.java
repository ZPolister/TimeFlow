package TimeFlow.service.impl.event;


import TimeFlow.mapper.event.ClassificationMapper;
import TimeFlow.pojo.Classification;
import TimeFlow.service.interf.event.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImp implements ClassificationService {

	@Autowired
	private ClassificationMapper CMapper;

	@Override
	public List<Classification> list(String tableName) {
		return CMapper.list(tableName);
	}

	@Override
	public void add(String tableName, Classification newCL) {
		CMapper.add(tableName, newCL);
	}

	@Override
	public void delete(String tableName, Integer id) {
		CMapper.delete(tableName, id);
	}
}
