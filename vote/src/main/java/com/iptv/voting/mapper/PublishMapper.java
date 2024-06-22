package com.iptv.voting.mapper;

import com.mybatisflex.core.BaseMapper;
import com.iptv.voting.entity.Publish;
import org.apache.ibatis.annotations.Mapper;

/**
 *  映射层。
 *
 * @author justek
 * @since 2024-06-18
 */
@Mapper
public interface PublishMapper extends BaseMapper<Publish> {

    void deleteVotePublish(Long id);

    void deleteVoteResult(Long id);

    void deleteVoteOptionHistory(Long id);
}
