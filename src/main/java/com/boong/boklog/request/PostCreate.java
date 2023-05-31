package com.boong.boklog.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PostCreate {

    @NotBlank(message = "제목은 필수이며 공백일 수 없습니다.")
    private String title;

    @NotBlank(message = "내용은 필수이며 공백일 수 없습니다.")
    private String content;

}
