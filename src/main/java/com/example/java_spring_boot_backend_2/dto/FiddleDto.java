package com.example.java_spring_boot_backend_2.dto;

import com.example.java_spring_boot_backend_2.models.Fiddle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FiddleDto {
    public FiddleDto(Fiddle fiddleModel){
        this.setId(fiddleModel.getId());

        this.setHtml(fiddleModel.getHtml());
        this.setJs(fiddleModel.getJs());
        this.setCss(fiddleModel.getCss());
        this.setPastebintext(fiddleModel.getPastebintext());

        this.setTitle(fiddleModel.getTitle());
        this.setLayout(fiddleModel.getLayout());

        this.setHtmlPartSize(fiddleModel.getHtmlPartSize());
        this.setJsPartSize(fiddleModel.getJsPartSize());
        this.setCssPartSize(fiddleModel.getCssPartSize());

        this.setCodePartSize(fiddleModel.getCodePartSize());
        this.setMainContainerSize(fiddleModel.getMainContainerSize());
        this.setMainContainerHeight(fiddleModel.getMainContainerHeight());
        this.setMainContainerWidth(fiddleModel.getMainContainerWidth());

        this.setMobileLayout(fiddleModel.getMobileLayout());
        this.setMobileMode(fiddleModel.isMobileMode());
        this.setIframeResizeValue(fiddleModel.getIframeResizeValue());

        this.setCreatedAt(fiddleModel.getCreatedAt());
        this.setAppMode(fiddleModel.getAppMode());
    }

    private Long id;

    private String js;
    private String html;
    private String css;

    private String pastebintext;

    private String title;
    private Integer layout;

    private Integer htmlPartSize;
    private Integer cssPartSize;
    private Integer jsPartSize;

    private Integer codePartSize;
    private Integer mainContainerSize;
    private Integer mainContainerHeight;
    private Integer mainContainerWidth;

    private String mobileLayout;
    private Integer iframeResizeValue;
    private boolean isMobileMode;
    private long createdAt;
    private String appMode;
}
