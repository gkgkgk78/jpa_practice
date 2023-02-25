package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// 예제 6.7

//엔티티를 데이터베이스의 테이블과 구조를 생성하는데 사용을 했다면
//레포지토리는 엔티티가 생성한 데이터베이스에 접근하는데 사용을 하게 된다.



public interface ProductRepository extends JpaRepository<Product, Long> {
    //이렇게 접근하려는 테이블과 매핑되는 엔티티에 대한 인터페이스를 생성한다.
    //Long 타입이 ID로 설정이 되어 있었으니, 이렇게 설정을 해준다

    //레포지토리에서는 상속받은거 외에도 커스템 메서드도 생성을 할수가 있다.

    //레포지토리에서 제공하는 조회 메서드는 기본값으로 단일 조회나 혹은 전체 엔티티를 조회 하는것만 지원을 하기에
    //필요에 따라 다른 조회 메서드가 필요하다,

    //조회 메서드 생성 규칙
    /*
    * 첫단어를 제외한 이후 단어들의 첫글자를 대문자로 해야 인식이 된다.
    * 조회 메서드 생성 규칙이 존재 한다.
    *
    *
    *
    *
    * */




}
