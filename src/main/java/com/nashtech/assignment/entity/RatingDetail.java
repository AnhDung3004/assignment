package com.nashtech.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "RatingDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(RatingDetailCompositeKey.class)
public class RatingDetail {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int accountID;
    @ManyToOne
    @JoinColumn(name = "AccountID")
    private Account account;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int bookID;
    @ManyToOne
    @JoinColumn(name = "BookID")
    private Book book;

//    @Column(nullable = false, unique = false)
//	private int ratingValueID;
    @ManyToOne
    @JoinColumn(name = "RatingValueID")
    private RatingValue ratingValue;

    @Column(name = "RatingDescription", nullable = true, unique = false)
	private String ratingDescription;

    @Column(name = "RatedDate", nullable = true, unique = false)
    private Date ratedDate;

}
