package com.jc.model;

public class Usuario {
    private int id;
    private String login;
    private String password; 
    private String comentario;
    public Usuario(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getComentario() {
        return comentario;
    }

    public void setComentario (String comentario) {
        this.Comentario = comentario;
    }

    
    
}

