package com.kh.demo.web.api.product;

import lombok.Data;

@Data
public class AddForm {
    private String pname;
    private Long count;
    private Long price;
}
