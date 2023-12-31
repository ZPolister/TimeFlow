package TimeFlow.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Data
@ToString
@NoArgsConstructor
public class MomentEvent {
	private Integer id; //事件id
	private String name; //事项名称
	private LocalDateTime deadline; //事项截至时间
//	private List<Integer> inCategory; //所属类别
	private boolean setInViewPage; //是否纳入视图统计（无痕事件）
	private String text; //文本内容（事项注释）
    private boolean completed; // 事件是否完成

}
