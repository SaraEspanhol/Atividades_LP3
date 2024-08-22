package atividade06_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


// Classe usuário que contem todas as informaçoes dele
class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Set<Postagem> postagens;
    private Perfil perfil;
    private List<String> notificacoes;

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.postagens = new TreeSet<>(Comparator.comparing(Postagem::getDataCriacao));
        this.perfil = new Perfil("", "");
        this.notificacoes = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    // Validaçao de senha com menos de 8 caracteres
    public void setSenha(String novaSenha) {
        if (validarSenha(novaSenha)) {
            this.senha = novaSenha;
        } else {
            throw new IllegalArgumentException("Senha não é segura o suficiente");
        }
    }

    private boolean validarSenha(String senha) {
        return senha.length() >= 8;
    }

    // Criar a postagem com o conteúdo inserido pelo usuário
    public Postagem criarPostagem(String conteudo) {
        Postagem postagem = new Postagem(conteudo, this);
        this.postagens.add(postagem);
        return postagem;
    }

    public Set<Postagem> getPostagens() {
        return postagens;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    // Atualiza o perfil com bibliografia e foto
    public void atualizarPerfil(String biografia, String fotoPerfil) {
        this.perfil = new Perfil(biografia, fotoPerfil);
    }

    
    // Gerenciamento de notificaçoes 
    public void adicionarNotificacao(String mensagem) {
        this.notificacoes.add(mensagem);
    }

    public List<String> getNotificacoes() {
        return notificacoes;
    }

    public void exibirNotificacoes() {
        System.out.println("Notificações para " + nomeUsuario + ":");
        for (String notificacao : notificacoes) {
            System.out.println("- " + notificacao);
        }
    }
}