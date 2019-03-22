package cn.forever.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;

import cn.forever.mapper.UserMapper;

@Service
public class MyServiceImpl implements cn.forever.service.MyService {
	/**
	 * PageHelper的分页能力太强了
	 */
	@Autowired
	private UserMapper userMapper;
	public String getUser() {
		int page=0;//当前页数
		int size=10;//当前显示的记录数
		// 开启分页插件,放在查询语句上面
		PageHelper.startPage(page, size);
		List<Map<String,Object>> users =userMapper.getUsers();
		Gson gson = new Gson();
		String user = gson.toJson(users);
		System.out.println("users:"+user.toString());
		return user;
	}

}
