package com.example.blogssu.db

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Comment (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var commentId: Long? = null,

    @Column
    var content: String,

    @JoinColumn(name = "userId") @ManyToOne
    var user: User,

    @JoinColumn(name = "articleId") @ManyToOne
    var article: Article,

    @CreationTimestamp
    var cratedDate: Timestamp,
        )