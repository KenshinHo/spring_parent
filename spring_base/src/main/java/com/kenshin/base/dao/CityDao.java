package com.kenshin.base.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.kenshin.base.pojo.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface CityDao extends JpaRepository<City,String>,JpaSpecificationExecutor<City>{

    /**
     * 自定义SQL查询
     * @param ishot
     * @return
     */
    @Query(value="select * from tb_city where ishot=:ishot", nativeQuery = true)
    List<City> listBySQL(@Param("ishot") String ishot);

    /**
     * 自定义SQL查询
     * @param ishot
     * @param pageable
     * @return
     */
    @Query(value="select * from tb_city where ishot=:ishot", nativeQuery = true)
    Page<City> listBySQLPage(@Param("ishot") String ishot, Pageable pageable);

    /**
     *  HQL 查询方式 => Hibernate查询方式
     */
    @Query(value = "select c from City c where c.ishot=?1")
    List<City> findByIshot(@Param("ishot") String ishot);
}
