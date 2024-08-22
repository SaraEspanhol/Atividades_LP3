package atividade06_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Postagem implements Curtivel {
    private String conteudo;
    private Date dataCriacao;
    private Usuario usuario;
    private int curtidas;
    private List<String> comentarios; // Lista de comentários
    private List<Usuario> usuariosQueCurtiram; // Lista de usuários que curtiram a postagem

    public Postagem(String conteudo, Usuario usuario) {
        this.conteudo = conteudo;
        this.dataCriacao = new Date();
        this.usuario = usuario;
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
        this.usuariosQueCurtiram = new ArrayList<>();
    }

    	// Curte e identifica quem curtiu
    @Override
    public void curtir(Usuario usuario) {
        this.curtidas += 1;
        this.usuariosQueCurtiram.add(usuario);
        this.usuario.adicionarNotificacao("Sua postagem foi curtida por " + usuario.getNomeUsuario());
    }

    @Override
    public int getCurtidas() {
        return curtidas;
    }

    // Adiciona um comentário na postagem
    public void comentar(String comentario) {
        this.comentarios.add(comentario);
        usuario.adicionarNotificacao("Sua postagem foi comentada.");
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public List<Usuario> getUsuariosQueCurtiram() {
        return usuariosQueCurtiram;
    }

    // Exibe as curtidas com o nome do usuário
    public void exibirCurtidas() {
        System.out.println("Curtidas na postagem '" + conteudo + "':");
        for (Usuario usuario : usuariosQueCurtiram) {
            String tipoUsuario = usuario instanceof UsuarioPremium ? "Usuário Premium" : 
                                  usuario instanceof UsuarioAdmin ? "Administrador" : "Usuário Comum";
            System.out.println("- " + usuario.getNomeUsuario() + " (" + tipoUsuario + ")");
        }
    }
}