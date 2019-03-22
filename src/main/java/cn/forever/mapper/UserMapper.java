package cn.forever.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	@Select("select * from hu_chat_info")
	public List<Map<String,Object>> getUsers();
}
