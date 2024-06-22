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
@Table(value = "vote_option")
public class Option implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer optionId;

    /**
     * 选项名称
     */
    private String option;

    /**
     * 选项主题id
     */
    private Integer titleId;

    /**
     * 素材id
     */
    private Integer libraryId;

}
