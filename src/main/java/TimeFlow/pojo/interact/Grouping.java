package TimeFlow.pojo.interact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author:你的名字
 * @Description:
 * @params:$
 * @return: $
 * @Date: 2023/10/28/17:04
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grouping {
	private Integer id;//事项id 或 类别id
	private List<Integer> list;//事项列表 或 类别列表
}
