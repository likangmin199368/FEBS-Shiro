package cc.mrbird.system.dao;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.User;
import cc.mrbird.system.domain.UserWithRole;

import java.util.List;

public interface UserMapper extends MyMapper<User> {
	/**
	 * 与部门表联合查询用户信息
	 * @param user
	 * @return
	 */
	List<User> findUserWithDept(User user);

	/**
	 * 依据用户ID联合用户表和用户角色表查询用户信息
	 * @param userId
	 * @return
	 */
	List<UserWithRole> findUserWithRole(Long userId);

	/**
	 * 查询用户
	 * @param user
	 * @return
	 */
	User findUserProfile(User user);
}