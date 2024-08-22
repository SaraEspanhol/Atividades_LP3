package atividade06_java;

import java.util.List;

// Interface para curtidas e identificar usuário que curtiu
interface Curtivel {
    void curtir(Usuario usuario);
    int getCurtidas();
    List<Usuario> getUsuariosQueCurtiram();
}
