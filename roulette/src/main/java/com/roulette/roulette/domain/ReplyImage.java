package com.roulette.roulette.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ReplyImage {

    @Id
    @Column(name = "reply_img_id", nullable = false)
    @GeneratedValue
    private Long replyImgId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reply_id", nullable = false)
    @GeneratedValue
    private Reply reply;
}
