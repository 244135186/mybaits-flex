package com.iptv.voting.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.iptv.voting.entity.Result;
import com.iptv.voting.mapper.ResultMapper;
import com.iptv.voting.service.ResultService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author justek
 * @since 2024-06-18
 */
@Service
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements ResultService {

}
