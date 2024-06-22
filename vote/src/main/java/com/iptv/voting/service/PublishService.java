package com.iptv.voting.service;

import com.mybatisflex.core.service.IService;
import com.iptv.voting.entity.Publish;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  服务层。
 *
 * @author justek
 * @since 2024-06-18
 */

public interface PublishService extends IService<Publish> {

    boolean delete(List<Long> ids);
}
