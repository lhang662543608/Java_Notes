package sylu.mybatis.been;

public class Department {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dept.id
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_dept.dept_name
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dept.id
     *
     * @return the value of tbl_dept.id
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dept.id
     *
     * @param id the value for tbl_dept.id
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_dept.dept_name
     *
     * @return the value of tbl_dept.dept_name
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_dept.dept_name
     *
     * @param deptName the value for tbl_dept.dept_name
     *
     * @mbggenerated Tue Dec 24 09:43:30 CST 2019
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}