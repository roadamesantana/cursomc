package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int cod;
    private String descricao;

    private TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(int cod) {
        for (TipoCliente tCliente : TipoCliente.values()) {
            if (cod == tCliente.cod) {
                return tCliente;
            }
        }

        throw new IllegalArgumentException("ID inválido " + cod);
    }

}
