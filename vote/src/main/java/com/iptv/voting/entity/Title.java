package com.iptv.voting.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(value = "vote_title")
public class Title implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer titleId;

    /**
     * 投票显示位置
     */
    private BigDecimal posX;

    /**
     * 投票显示位置
     */
    private BigDecimal posY;

    /**
     * 宽
     */
    private BigDecimal width;

    /**
     * 高
     */
    private BigDecimal height;

    /**
     * 弹窗主题
     */
    private String title;

    /**
     * 弹窗高度
     */
    private BigDecimal screenWidth;

    /**
     * 弹窗宽度
     */
    private BigDecimal screenHeight;

    /**
     * 主题类型
     */
    private Integer type;

    /**
     * 投票类型
     */
    @Column(value = "modelType")
    private Integer modelType;

    /**
     * 素材id
     */
    private Integer libraryId;

}
