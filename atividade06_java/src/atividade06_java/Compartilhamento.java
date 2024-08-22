package atividade06_java;

import java.util.Date;

//Classe para compartilhar postagens

class Compartilhamento {
    private Usuario usuario;
    private Postagem postagemOriginal;
    private Date dataCompartilhamento;

    public Compartilhamento(Usuario usuario, Postagem postagemOriginal) {
        this.usuario = usuario;
        this.postagemOriginal = postagemOriginal;
        this.dataCompartilhamento = new Date();
        postagemOriginal.getUsuario().adicionarNotificacao("Sua postagem foi compartilhada.");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Postagem getPostagemOriginal() {
        return postagemOriginal;
    }

    public Date getDataCompartilhamento() {
        return dataCompartilhamento;
    }
}
