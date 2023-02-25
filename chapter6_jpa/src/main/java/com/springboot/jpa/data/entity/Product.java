package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

// 예제 6.6, 예제 6.30, 6.31, 6.32, 6.33, 6.34, 6.35, 6.36, 6.37
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "name")
@Table(name = "product")//해당 되는 얘는 테이블과 클래스의 이름이 다를시에만 사용을 하는 어노테이션임
public class Product {

    @Id//모든 엔티티는 @id어노테이션이 필요하다, 해당 어노테이션은 테이블의 기본값을 나타낸다.

    @GeneratedValue(strategy = GenerationType.IDENTITY) //@id와 같이 사용이 된다, 해당 필드의 값을 어떤방식으로 자동 생성할지 결정하고자 할시에 사용이 됨.
    //generatedValue를 사용하지 않을시에는 기본값을 생성할시에 사용하는 방식이ㅏㄷ.
    //GenerationType.AUTO: 기본 설정값이다, DB에 맞게 자동 생성이 된다
    //GenerationType.IDENTITY : 기본값 생성을 DB에 위임하는 방식이다. AUTO_INCREMENT를 사용해 기본값을 생성한다,
    private Long number;

    //Column은 굳이 사용하지 않아도 되는데, nullable,length, unique 와 같은 설정들을 사용하기 위해서 명시한다.
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
