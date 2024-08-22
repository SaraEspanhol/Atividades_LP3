package atividade06_java;

import java.util.List;


// Usuario admnistrador que pode deletar postagens e banir usuários
class UsuarioAdmin extends Usuario {
    public UsuarioAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void deletarPostagem(Postagem postagem, Usuario usuario) {
        if (usuario.getPostagens().contains(postagem)) {
            usuario.getPostagens().remove(postagem);
            System.out.println("Postagem deletada.");
        } else {
            System.out.println("Postagem não encontrada.");
        }
    }

    public void banirUsuario(Usuario usuario, List<Usuario> usuarios) {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
            System.out.println("Usuário " + usuario.getNomeUsuario() + " foi banido.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
