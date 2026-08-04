package com.example.java_spring_boot_backend.models;

import com.example.java_spring_boot_backend.dto.FiddleDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fiddle_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FiddleData {

    public FiddleData(FiddleDto fiddleDto){
        this.setJs(fiddleDto.getJs());
        this.setHtml(fiddleDto.getHtml());
        this.setCss(fiddleDto.getCss());
        this.setPastebintext(fiddleDto.getPastebintext());

        this.setTitle(fiddleDto.getTitle());
        this.setLayout(fiddleDto.getLayout());

        this.setHtmlPartSize(fiddleDto.getHtmlPartSize());
        this.setCssPartSize(fiddleDto.getCssPartSize());
        this.setJsPartSize(fiddleDto.getJsPartSize());

        this.setCodesPartSize(fiddleDto.getCodesPartSize());
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

    @Column(columnDefinition = "TEXT")
    private String js;

    @Column(columnDefinition = "TEXT")
    private String html;

    @Column(columnDefinition = "TEXT")
    private String css;

    @Column(columnDefinition = "TEXT")
    private String pastebintext;

    private String title;
    private Integer layout;

    private Integer htmlPartSize;
    private Integer cssPartSize;
    private Integer jsPartSize;

    private Integer codesPartSize;
    private Integer mainContainerSize;
    private Integer mainContainerHeight;
    private Integer mainContainerWidth;

    private String mobileLayout;
    private Integer iframeResizeValue;
    private boolean isMobileMode;
    private long createdAt;
    private String appMode;
}
