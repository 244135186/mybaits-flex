package com.iptv.voting.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  实体类。
 *
 * @author justek
 * @since 2024-06-18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "vote_result")
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer id;

    /**
     * 设备id
     */
    private Integer deviceId;

    /**
     * 选项选中id
     */
    private Integer optionId;

    /**
     * 投票主题id
     */
    private Integer titleId;

    /**
     * 用户投票时间
     */
    private Long voteTime;

}
