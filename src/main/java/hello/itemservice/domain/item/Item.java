package hello.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    /* 추가된 요구사항 */
    private Boolean open; // 판매여부
    private List<String> regions; // 등록 지역-- enum
    private ItemType itemType; // 상품 종류 -- Class객체
    private String deliveryCode; // 배송방식 -- String
    



    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
