package com.kh.demo.web.api.product;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class AddReq {
    @NotBlank
    private String pname;
    @NotNull
    @Positive(message = "수량은 양수값이어야 합니다")
    private Long quantity;
    @NotNull
    @Positive(message = "가격은 양수값이어야 합니다.")
    private Long price;
}
