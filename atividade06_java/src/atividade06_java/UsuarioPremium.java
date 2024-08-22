package atividade06_java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


// Usuário premium que pode criar postagem de destaque 
class UsuarioPremium extends Usuario {
    private Set<Postagem> postagensDestaque;

    public UsuarioPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
        this.postagensDestaque = new TreeSet<>(Comparator.comparing(Postagem::getDataCriacao));
    }

    public Postagem criarPostagemDestaque(String conteudo) {
        Postagem postagem = criarPostagem(conteudo);
        this.postagensDestaque.add(postagem);
        return postagem;
    }

    public Set<Postagem> getPostagensDestaque() {
        return postagensDestaque;
    }
}


