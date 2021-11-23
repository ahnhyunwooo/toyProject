package project.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="MEMBER")
@Getter @Setter
public class Member {

    @Id
    @Column (name = "MEMBER_INDEX")
    private String index;

    @Column(name="MEMBER_NAME")
    private String name;

    @Column(name="MEMBER_ID")
    private String id;

    @Column(name="MEMBER_PW")
    private String pw;

    @Column(name="MEMBER_NICKNAME")
    private String nickName;

    @Column(name="MEMBER_GENDER")
    private String gender;

    @Column(name="MEMBER_PHONENUMBER")
    private String phoneNumber;

    @Column(name="MEMBER_EMAIL")
    private String email;

    @Column(name="MEMBER_JOINDATE")
    private LocalDateTime joinDate;

    @Column(name="MEMBER_BOOK_RENTAL_COUNT")
    private int bookRentalCount;

    @Column(name="MEMBER_BOOK_RENTAL_TOTAL")
    private int bookRentalTotal;

    @Column(name="MEMBER_WARNING_COUNT")
    private int warningCount;

    @Column(name="MEMBER_UPDATE")
    private LocalDateTime update;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Board> boards = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<BoardComment> boardComments = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<BookManagement> bookManagements = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<BookReservation> bookReservations = new ArrayList<>();


}
