package com.hszy.austin.support.dao;

import com.hszy.austin.support.domain.SmsRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 短息记录的Dao
 * CrudRepository提供基本的增删改查
 */
public interface SmsRecordDao extends CrudRepository<SmsRecord,Long> {
    /**
     * 通过日期和手机号找到发送记录
     *
     * @param phone
     * @param sendDate
     * @return
     */
    List<SmsRecord> findByPhoneAndSendDate(Long phone, Integer sendDate);
}
