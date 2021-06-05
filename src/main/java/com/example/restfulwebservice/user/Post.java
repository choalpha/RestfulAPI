package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post -> 1 : (0~N), Main : Sub -> Parent => Child
    @ManyToOne(fetch = FetchType.LAZY)  // post여러개에 하나의 user 매핑, 지연로딩 (포스트가 로딩될 때 가져온다)
    @JsonIgnore
    private User user;
}
