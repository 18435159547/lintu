package com.lintu.demo.domain;

public class RoleUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_user.role_user_id
     *
     * @mbggenerated
     */
    private Integer roleUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_user.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_role_user.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_user.role_user_id
     *
     * @return the value of oa_role_user.role_user_id
     *
     * @mbggenerated
     */
    public Integer getRoleUserId() {
        return roleUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_user.role_user_id
     *
     * @param roleUserId the value for oa_role_user.role_user_id
     *
     * @mbggenerated
     */
    public void setRoleUserId(Integer roleUserId) {
        this.roleUserId = roleUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_user.role_id
     *
     * @return the value of oa_role_user.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_user.role_id
     *
     * @param roleId the value for oa_role_user.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_role_user.user_id
     *
     * @return the value of oa_role_user.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_role_user.user_id
     *
     * @param userId the value for oa_role_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}