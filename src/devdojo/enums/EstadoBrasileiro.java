package devdojo.enums;

public enum EstadoBrasileiro {
    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    private final String nome;

    // Construtor do enum
    EstadoBrasileiro(String nome) {
        this.nome = nome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Busca o enum pela sigla
    public static EstadoBrasileiro porSigla(String sigla) {
        for (EstadoBrasileiro estado : values()) {
            if (estado.name().equalsIgnoreCase(sigla)) {
                return estado;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name() + " - " + nome;
    }
}

