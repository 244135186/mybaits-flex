package com.iptv.voting.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.iptv.voting.entity.Option;
import com.iptv.voting.mapper.OptionMapper;
import com.iptv.voting.service.OptionService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author justek
 * @since 2024-06-18
 */
@Service
public class OptionServiceImpl extends ServiceImpl<OptionMapper, Option> implements OptionService {

}
