package com.platzi.market.domain.dto;

public class AuthenticationResponse {

    //Recibir y enviar la info necesaria para crear un json web token dentro de un controlador

    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
