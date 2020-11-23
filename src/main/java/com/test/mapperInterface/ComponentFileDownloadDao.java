package com.test.mapperInterface;

import com.test.VO.ComponentFileDownloadVO;

public interface ComponentFileDownloadDao {
    int deleteByPrimaryKey(ComponentFileDownloadVO key);

    int insert(ComponentFileDownloadVO record);

    int insertSelective(ComponentFileDownloadVO record);

    ComponentFileDownloadVO selectByPrimaryKey(ComponentFileDownloadVO key);

    int updateByPrimaryKeySelective(ComponentFileDownloadVO record);

    int updateByPrimaryKey(ComponentFileDownloadVO record);
}