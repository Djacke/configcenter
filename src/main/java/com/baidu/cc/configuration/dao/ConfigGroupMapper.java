/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.cc.configuration.dao;

import com.baidu.bjf.dao.DaoMapper;
import com.baidu.bjf.orm.mybatis.SqlMapper;
import com.baidu.cc.configuration.bo.ConfigGroup;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * Mapper interface class for model
 * com.baidu.cc.configuration.bo.ConfigGroupBase
 * 
 * @author BJF
 */
@SqlMapper
public interface ConfigGroupMapper extends DaoMapper<ConfigGroup, Long> {

    /**
     * 根据版本ID查ConfigGroup列表.
     * 
     * @param versionId
     *            versionId
     * @return List<ConfigGroup>
     */
    public List<ConfigGroup> findByVersionId(Long versionId);

    /**
     * 根据版本ID查询所有的群组ID列表.
     * 
     * @param versionIds
     *            versionIds
     * @return List<Long>
     */
    List<Long> findConfigGroupIdsByVersionIds(
            @Param("versionIds") List<Long> versionIds);

    /**
     * 根据versionId列表查询配置组列表.
     * 
     * @param verIds
     *            the ver ids
     * @return the list
     */
    public List<ConfigGroup> findByVersionIds(@Param("verIds") List<Long> verIds);
}