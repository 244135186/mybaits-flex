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
@Table(value = "vote_option_history")
public class OptionHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer optionId;

    private String option;

    private Integer libraryId;

    private Integer vpId;



}
