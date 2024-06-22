package com.iptv.voting.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.iptv.voting.entity.Publish;
import com.iptv.voting.mapper.PublishMapper;
import com.iptv.voting.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  服务层实现。
 *
 * @author justek
 * @since 2024-06-18
 */
@Service
public class PublishServiceImpl extends ServiceImpl<PublishMapper, Publish> implements PublishService {

    @Autowired
    private PublishMapper publishMapper;
    @Override
    @Transactional
    public boolean delete(List<Long> ids) {
        try {
            for (Long id : ids) {
                publishMapper.deleteVotePublish(id);
                publishMapper.deleteVoteResult(id);
                publishMapper.deleteVoteOptionHistory(id);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
