package TimeFlow.service.impl.event;

import TimeFlow.mapper.event.MomentEventMapper;
import TimeFlow.pojo.MomentEvent;
import TimeFlow.service.interf.event.MomentEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MomentEventServiceImp implements MomentEventService {

	@Autowired
	private MomentEventMapper MEMapper;

	@Override
	public List<MomentEvent> list(Integer uid, String date) {
		return MEMapper.list(uid, date);
	}

	@Override
	public void add(Integer uid,MomentEvent newME) {
		MEMapper.add(uid ,newME);
		return;
	}

	@Override
	public void delete(Integer uid, Integer id) {
		MEMapper.delete(uid, id);
	}


}
