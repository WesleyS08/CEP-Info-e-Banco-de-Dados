package com.ProjetoP2.Projeto.P2.DTO;

import com.ProjetoP2.Projeto.P2.Models.User;

public class dtoUser {

    private Long idUser;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public User toUser(){
        User user = new User();
        user.setId(this.idUser);
        user.setCep(this.cep);
        user.setLogradouro(this.logradouro);
        user.setComplemento(this.complemento);
        user.setBairro(this.bairro);
        user.setLocalidade(this.localidade);
        user.setUf(this.uf);
        user.setIbge(this.ibge);
        user.setGia(this.gia);
        user.setDdd(this.ddd);
        user.setSiafi(this.siafi);

        return user;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + idUser +
                ", cep=" + cep +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge=" + ibge +
                ", gia=" + gia +
                ", ddd=" + ddd +
                ", siafi=" + siafi +
                '}';
    }
}
