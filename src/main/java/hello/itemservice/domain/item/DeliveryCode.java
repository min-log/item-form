package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 구분명칭
* FAST : 빠른 배송
* NORMAL : 일반 배송
* SLOW : 느린 배송
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryCode {
    private String code; //시스템 전달 값
    private String displayName; //구분명칭
}
