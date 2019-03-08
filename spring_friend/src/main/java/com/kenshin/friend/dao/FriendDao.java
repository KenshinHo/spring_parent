package com.kenshin.friend.dao;

import com.kenshin.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface FriendDao extends JpaRepository<Friend,String>,JpaSpecificationExecutor<Friend>{
	
}
