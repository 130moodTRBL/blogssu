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
class Article (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var articleId: Long? = null,

        @Column
        var content: String,

        @Column
        var title: String,

        @JoinColumn(name = "userId") @ManyToOne
        var user: User,

        @OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
        var comment: List<Comment>,

        @CreationTimestamp
        var cratedDate: Timestamp,
        )