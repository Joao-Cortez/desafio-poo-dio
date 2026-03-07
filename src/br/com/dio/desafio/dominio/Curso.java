package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public static class Builder {
        private String titulo;
        private String descricao;
        private int cargaHoraria;

        public Builder titulo(String titulo){
            this.titulo = titulo;
            return this;
        }

        public Builder descricao(String descricao){
            this.descricao = descricao;
            return this;
        }

        public Builder cargaHoraria(int cargaHoraria){
            this.cargaHoraria = cargaHoraria;
            return this;
        }

        public Curso build(){
            Curso curso = new Curso();
            curso.setTitulo(titulo);
            curso.setDescricao(descricao);
            curso.setCargaHoraria(cargaHoraria);
            return curso;
        }
    }
}