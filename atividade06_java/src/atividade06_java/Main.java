package atividade06_java;

public class Main {
    public static void main(String[] args) {
        // Criação de usuários
        Usuario usuarioComum = new Usuario("Sara", "sara123456", "sara@gmail.com");
        UsuarioPremium usuarioPremium = new UsuarioPremium("Joao", "joao123456", "joao@gmail.com");
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Willy", "willy123456", "willy@gmail.com");

        // Atualização do perfil
        usuarioComum.atualizarPerfil("Olá, meu nome é Sara!.", "perfilSara.png");

        // Criação de postagens
        Postagem postagem1 = usuarioComum.criarPostagem("Postagem número 1.");
        Postagem postagem2 = usuarioPremium.criarPostagemDestaque("Postagem em destaque");
        Postagem postagem3 = usuarioComum.criarPostagem("Postagem número 2.");

        // Interação com as postagens
        postagem1.curtir(usuarioComum);
        postagem1.curtir(usuarioPremium);
        postagem2.curtir(usuarioAdmin);

        postagem1.comentar("Gostei!");
        postagem2.comentar("Legal!");

        // Exibir quem curtiu a postagem
        postagem1.exibirCurtidas();
        postagem2.exibirCurtidas();

        // Compartilhamento de postagem
        Compartilhamento compartilhamento = new Compartilhamento(usuarioComum, postagem2);
        System.out.println("Postagem de " + postagem2.getUsuario().getNomeUsuario() + " foi compartilhada por " + compartilhamento.getUsuario().getNomeUsuario());

        // Admin excluindo uma postagem
        usuarioAdmin.deletarPostagem(postagem3, usuarioComum);

        // Exibição de informações
        System.out.println("Usuário " + usuarioComum.getNomeUsuario() + " tem " + usuarioComum.getPostagens().size() + " postagens.");
        System.out.println("Perfil do usuário " + usuarioComum.getNomeUsuario() + ": " + usuarioComum.getPerfil().getBiografia());
        System.out.println("Postagem de " + usuarioPremium.getNomeUsuario() + " tem " + postagem2.getCurtidas() + " curtidas.");
        System.out.println("Comentários na postagem de " + usuarioComum.getNomeUsuario() + ": " + postagem1.getComentarios());
        usuarioComum.exibirNotificacoes();
        usuarioPremium.exibirNotificacoes();
    }
}
