package com.example.mutsa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="board_name")
    private String name;
    @OneToMany(
            targetEntity = PostEntity.class,
            fetch = FetchType.LAZY,
            mappedBy = "boardEntity" // 보드엔티티의 매니투원과 이어지는 관계인걸 알려준다.
    )
    private List<PostEntity> postEntityList = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public List<PostEntity> getPostEntityList() {
        return postEntityList;
    }

    public void setPostEntityList(List<PostEntity> postEntityList) {
        this.postEntityList = postEntityList;
    }

    public BoardEntity(Long id, String title, List<PostEntity> postEntityList) {
        this.id = id;
        this.name = title;
        this.postEntityList = postEntityList;
    }

    public BoardEntity() {
    }
}