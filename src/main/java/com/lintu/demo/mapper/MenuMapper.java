package com.lintu.demo.mapper;

import com.lintu.demo.domain.Menu;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    int insert(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    int insertSelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    Menu selectByPrimaryKey(Integer menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Menu record);
}