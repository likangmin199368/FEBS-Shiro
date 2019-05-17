package cc.mrbird.system.domain;

import cc.mrbird.common.annotation.ExportConfig;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 部门信息
 */
@Table(name = "t_dept")
public class Dept implements Serializable {

	private static final long serialVersionUID = -7790334862410409053L;
	/**
	 * 部门ID
	 */
	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "DEPT_ID")
	@ExportConfig(value = "编号")
	private Long deptId;
	/**
	 * 部门父ID
	 */
	@Column(name = "PARENT_ID")
	private Long parentId;

	@Column(name = "DEPT_NAME")
	@ExportConfig(value = "部门名称")
	private String deptName;
	/**
	 * 目前暂时没用
	 */
	@Column(name = "ORDER_NUM")
	private Long orderNum;
	/**
	 * 创建时间，使用自定义格式
	 */
	@Column(name = "CREATE_TIME")
	@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

	/**
	 * @return DEPT_ID
	 */
	public Long getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 */
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return PARENT_ID
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * @param parentId
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return DEPT_NAME
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName == null ? null : deptName.trim();
	}

	/**
	 * @return ORDER_NUM
	 */
	public Long getOrderNum() {
		return orderNum;
	}

	/**
	 * @param orderNum
	 */
	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	/**
	 * @return CREATE_TIME
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}