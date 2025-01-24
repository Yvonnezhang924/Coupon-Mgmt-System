package com.coupon.merchants.dao;

import com.coupon.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

//基于Spring Data JPA的数据访问接口，负责与数据库交互,对商户实体 Merchants 进行查询操作。
/**
 * <h1>Merchants Dao Interface</h1>
 */

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * <h2>Get merchant object based on id</h2>
     * @param id Merchant id
     * @return {@link Merchants}
     * */
    Merchants findById(Integer id);

    /**
     * <h2>Obtain merchant object based on merchant name</h2>
     * @param name Merchant name
     * @return {@link Merchants}
     * */
    Merchants findByName(String name);
}
