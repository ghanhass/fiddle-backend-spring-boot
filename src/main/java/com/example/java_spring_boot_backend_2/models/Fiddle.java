package com.example.java_spring_boot_backend_2.models;

import com.example.java_spring_boot_backend_2.dto.FiddleDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fiddle")
@Getter
@Setter
public class Fiddle {

    public Fiddle(FiddleDto fiddleDto){
        this.setJs(fiddleDto.getJs());
        this.setHtml(fiddleDto.getHtml());
        this.setCss(fiddleDto.getCss());
        this.setPastebintext(fiddleDto.getPastebintext());

        this.setTitle(fiddleDto.getTitle());
        this.setLayout(fiddleDto.getLayout());

        this.setHtmlPartSize(fiddleDto.getHtmlPartSize());
        this.setCssPartSize(fiddleDto.getCssPartSize());
        this.setJsPartSize(fiddleDto.getJsPartSize());

        this.setCodePartSize(fiddleDto.getCodePartSize());
        this.setMainContainerSize(fiddleDto.getMainContainerSize());
        this.setMainContainerHeight(fiddleDto.getMainContainerHeight());
        this.setMainContainerWidth(fiddleDto.getMainContainerWidth());

        this.setMobileLayout(fiddleDto.getMobileLayout());
        this.setIframeResizeValue(fiddleDto.getIframeResizeValue());
        this.setMobileMode(fiddleDto.isMobileMode());
        this.setCreatedAt(fiddleDto.getCreatedAt());
        this.setAppMode(fiddleDto.getAppMode());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
