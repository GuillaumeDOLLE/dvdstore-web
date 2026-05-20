package com.mycompany.dvdstore.dvdstore_web.form;

import jakarta.validation.constraints.*;

public class MovieForm {

    private Long id;
    @NotBlank
    @Size(max = 20)
    private String title;
    @NotBlank
    @Pattern(regexp = "COMEDIE|HORREUR|THRILLER|ACTION|ROMANTIQUE|DRAME|ANIMATION")
    private String genre;
    @Size(max = 255)
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
