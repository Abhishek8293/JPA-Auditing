package com.jpa.audit.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String authorName;
	
	
	 @CreatedDate
	    @Column(
	            nullable = false,
	            updatable = false
	    )
	    private LocalDateTime createDate;

	    @LastModifiedDate
	    @Column(insertable = false)
	    private LocalDateTime lastModified;


	    @CreatedBy
	    @Column(
	            nullable = false,
	            updatable = false
	    )
	    private Integer createdBy;

	    @LastModifiedBy
	    @Column(insertable = false)
	    private Integer lastModifiedBy;

}
