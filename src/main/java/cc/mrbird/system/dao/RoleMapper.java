package cc.mrbird.system.dao;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.Role;
import cc.mrbird.system.domain.RoleWithMenu;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
	/**
	 * 依据用户名查询角色
	 * @param userName
	 * @return
	 */
	List<Role> findUserRole(String userName);

	/**
	 * 依据角色ID查询角色
	 * @param roleId
	 * @return
	 */
	List<RoleWithMenu> findById(Long roleId);
}