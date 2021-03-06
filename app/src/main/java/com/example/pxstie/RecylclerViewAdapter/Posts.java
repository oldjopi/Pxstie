package com.example.pxstie.RecylclerViewAdapter;


public class Posts {

    private int image;
    private int like;
    private String nombre;
    private String caption;
    private String fecha;
    private String idPost;

    public Posts(int image, String nombre, String mensaje) {
        this.image = image;
        this.nombre = nombre;
        this.caption = mensaje;
    }

    public Posts(String nombre, String mensaje) {
        this.image = 0;
        this.nombre = nombre;
        this.caption = mensaje;
    }

    public Posts() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
