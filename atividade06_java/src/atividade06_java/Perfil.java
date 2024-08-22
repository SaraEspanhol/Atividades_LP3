package atividade06_java;

// Classe para adicionar uma bibliografia e foto no perfil de cada usuário

class Perfil {
    private String biografia;
    private String fotoPerfil;

    public Perfil(String biografia, String fotoPerfil) {
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }
}
