package project.demo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Board {

    @Column(name="BOARD_INDEX")
    @Id
    private String index;

    @Column(name="BOARD_TITLE")
    private String title;

    @Column(name="BOARD_CONTENT")
    private String content;

    @Column(name="BOARD_VIEWS")
    private int views;

    @Column(name="BOARD_INSDATE")
    private LocalDateTime insdate;

    @Column(name="BOARD_UPD_DATE")
    private LocalDateTime upd_date;

    @Column(name="BOARD_STATE")
    private String state;

    @Column(name="BOARD_STATE_MEMO")
    private String stateMemo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_INDEX")
    private Member member;

    @OneToMany(mappedBy = "board")
    private List<BoardComment> boardComments = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CATEGORY_INDEX")
    private Category category;

}