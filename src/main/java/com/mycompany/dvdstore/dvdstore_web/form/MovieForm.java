package com.mycompany.dvdstore.dvdstore_web.form;

import jakarta.validation.constraints.*;

public class MovieForm {

    private Long id;
    @NotBlank(message = "Veuillez entrer un titre")
    @Size(max = 20, message = "Entrez un titre de 20 caratères au plus")
    private String title;
    @NotBlank(message = "Veuillez choisir un genre")
    @Pattern(regexp = "COMEDIE|HORREUR|THRILLER|ACTION|ROMANTIQUE|DRAME|ANIMATION")
    private String genre;
    @Size(max = 255, message = "Entrez une description de 255 caratères au plus")
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
